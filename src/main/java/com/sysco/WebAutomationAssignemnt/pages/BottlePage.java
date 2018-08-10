package com.sysco.WebAutomationAssignemnt.pages;

import com.syscolab.qe.core.common.LoggerUtil;
import org.openqa.selenium.By;

public class BottlePage extends BasePage {

    public By bottleName = By.xpath("//*[@id=\"product-info\"]/div/div[1]");
    public By bottlePrice = By.xpath("//*[@id=\"product-price-1414\"]/span");
    public By addCartBtn = By.xpath("//*[@id=\"price-inner-content\"]/div[2]/div/div[2]/button/span/span");

    public String returnBottleName(){
        syscoLabUIOgm.sleep(1);
        LoggerUtil.logINFO("verify bottle name");
        return syscoLabUIOgm.getText(bottleName);
    }

    public String returnBottlePrice(){
        syscoLabUIOgm.sleep(1);
        LoggerUtil.logINFO("verify bottle price");
        return syscoLabUIOgm.getText(bottlePrice);
    }

    public void clickAddCart(){
        syscoLabUIOgm.sleep(1);
        LoggerUtil.logINFO("clicking add to cart");
        syscoLabUIOgm.click(addCartBtn);
        LoggerUtil.logINFO("bottle addded to cart");
    }

}
