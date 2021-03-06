package com.sysco.WebAutomationAssignemnt.pages;

import com.syscolab.qe.core.common.LoggerUtil;
import org.openqa.selenium.By;

public class BottlePage extends BasePage {

    public By bottleName = By.xpath("//*[@id=\"product-info\"]/div/div[1]");
    public By bottlePrice = By.xpath("//*[@id=\"product-price-1414\"]/span");
    public By addCartBtn = By.xpath("//*[@id=\"price-inner-content\"]/div[2]/div/div[2]/button/span/span");
    public By checkoutBtn = By.xpath("//*[@id=\"topCartContent\"]/div/div/div");
    public By proceedBtn = By.xpath("/html/body/div[2]/div[3]/div[2]/div/div[1]/div[1]/div/ul/li[2]/button");

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

    public void clickcheckout(){
        syscoLabUIOgm.waitTillElementLoaded(checkoutBtn);
        LoggerUtil.logINFO("clicking checkout from dropdown");
        syscoLabUIOgm.click(checkoutBtn);
        syscoLabUIOgm.sleep(1);
        LoggerUtil.logINFO("checkout clicked");
    }

    public void clickProceed(){
        LoggerUtil.logINFO("clicking proceed");
        syscoLabUIOgm.click(proceedBtn);
        LoggerUtil.logINFO("proceed button pressed");
    }

}
