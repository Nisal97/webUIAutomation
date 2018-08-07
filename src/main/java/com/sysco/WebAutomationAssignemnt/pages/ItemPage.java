package com.sysco.WebAutomationAssignemnt.pages;

import com.sysco.WebAutomationAssignemnt.functions.BaseFunctions;
import org.openqa.selenium.By;

public class ItemPage extends BasePage {

    private By purchasingItem = By.xpath("//*[@id=\"main-image\"]/img");
    private By addtoCart = By.xpath("//*[@id=\"price-inner-content\"]/div[2]/div/div[2]/button/span/span");
    private By cartIcon = By.xpath("//*[@id=\"cartHeader\"]");
    private By checkout = By.xpath("//*[@id=\"topCartContent\"]/div/div/div/button/span/span");

    public void clickOnItem(){
        syscoLabUIOgm.click(purchasingItem);
    }

    public void addItemToCart(){
        syscoLabUIOgm.click(addtoCart);
    }

    public void checkCart(){
        syscoLabUIOgm.click(cartIcon);
    }

    public void checkoutCart(){
        syscoLabUIOgm.click(checkout);
    }
}
