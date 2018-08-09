package com.sysco.WebAutomationAssignemnt.pages;

import com.syscolab.qe.core.common.LoggerUtil;
import org.openqa.selenium.By;

public class CatagoryPage extends BasePage{

//    private By exclusiveCatagory = By.xpath("//*[@id=\"nav-wrapper\"]/div/div[4]/div[1]/div[1]/ul/li/ul/li[1]/a");

    private By bottleShop = By.xpath("//*[@id=\"nav-wrapper\"]/div/ul[1]/li[1]");
    private By exclusiveProducts = By.xpath("/html/body/div[2]/div[3]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a");

    private By neededBottle = By.xpath("*[@id=\"product-tracking-1414\"]/div[1]/a");


    public void clickBottleShop(){
        LoggerUtil.logINFO("clicking bottleshop");
        syscoLabUIOgm.click(bottleShop);
        LoggerUtil.logINFO("Bottleship clicked");
    }


    public void clickExclusiveProducts(){
        LoggerUtil.logINFO("clicking exclusive");
        syscoLabUIOgm.click(exclusiveProducts);
        LoggerUtil.logINFO("clicked exclusive");
    }

    public void selectBottle(){
        syscoLabUIOgm.sleep(1);
        LoggerUtil.logINFO("click bottle");
        syscoLabUIOgm.click(neededBottle);
        LoggerUtil.logINFO("done clicking bottle");
    }


}

