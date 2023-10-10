package com.floristeriamundoflor.tasks;

import com.floristeriamundoflor.ui.BirthdayUI;
import com.floristeriamundoflor.ui.LoveUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BirthdayTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BirthdayUI.BTN_BIRTHDAY),
                Click.on(BirthdayUI.SLECT_PRODUCT),
                Click.on(BirthdayUI.ADD_PRODUCTCART),
                Click.on(BirthdayUI.DELETE_PRODUCTCART)


        );
    }

    public static Performable Birthday(){
        return instrumented(BirthdayTask.class);
    }
}
