package com.floristeriamundoflor.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BirthdayUI {



    public static final Target BTN_BIRTHDAY = Target.the("Add to cart")
            .located(By.xpath("(//a[@href='https://www.floristeriamundoflor.com/product-category/cumpleanos/'])[4]"));

    public static final Target SLECT_PRODUCT = Target.the("Selecto product")
            .located(By.xpath("//a[@title='MDF 0001']"));

    public static final Target ADD_PRODUCTCART = Target.the("Add to cart")
            .located(By.xpath("//button[@name='add-to-cart']"));

    public static final Target DELETE_PRODUCTCART = Target.the("Delete to cart")
            .located(By.xpath("(//a[@class='remove'])[3]"));


}
