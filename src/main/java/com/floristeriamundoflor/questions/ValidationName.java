package com.floristeriamundoflor.questions;

import com.floristeriamundoflor.ui.LoveValidation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidationName implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LoveValidation.NAME_PRODUCT.resolveFor(actor).isClickable();
    }

    public static Question from(){
        return new ValidationName();
    }
}
