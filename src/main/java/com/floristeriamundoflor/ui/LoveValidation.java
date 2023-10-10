package com.floristeriamundoflor.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoveValidation {

    public static final Target NAME_PRODUCT = Target.the("Selecto product")
            .located(By.xpath("(//a[@href='https://www.floristeriamundoflor.com/product/mdf-0001/'])[7]"));
}
