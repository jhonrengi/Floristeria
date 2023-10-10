package com.floristeriamundoflor.tasks;

import com.floristeriamundoflor.ui.LoveUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoveTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoveUI.BTN_LOVE),
                Click.on(LoveUI.SLECT_PRODUCT),
                Click.on(LoveUI.ADD_PRODUCTCART),
                Click.on(LoveUI.BTN_LOVE),
                Click.on(LoveUI.SLECT_PRODUCTTWO),
                Click.on(LoveUI.ADD_PRODUCTCART)

        );
    }

    public static Performable Love(){
        return instrumented(LoveTask.class);
    }
}
