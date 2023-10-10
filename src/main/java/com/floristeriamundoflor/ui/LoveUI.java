package com.floristeriamundoflor.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoveUI {

    public static final Target BTN_LOVE = Target.the("Boton love")
            .located(By.xpath("(//a[@href='https://www.floristeriamundoflor.com/product-category/amor/'])[4]"));



    public static final Target SLECT_PRODUCT = Target.the("Selecto product")
            .located(By.xpath("//a[@title='MDF 0001']"));

    //button[@name='add-to-cart']

    public static final Target ADD_PRODUCTCART = Target.the("Add to cart")
            .located(By.xpath("//button[@name='add-to-cart']"));

    //span[@class='sub-title']


    public static final Target SLECT_PRODUCTTWO = Target.the("Selecto product")
            .located(By.xpath("//a[@title='MDF 00010']"));

    public static final Target BTN_CART = Target.the("Add to cart")
            .located(By.xpath("//span[@class='sub-title']"));
}
