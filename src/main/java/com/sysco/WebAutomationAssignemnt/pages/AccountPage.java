package com.sysco.WebAutomationAssignemnt.pages;

import com.syscolab.qe.core.common.LoggerUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AccountPage extends BasePage {

    private By cart = By.xpath("//*[@id=\"cartHeader\"]");

    private By remove1 = By.id("cartheader-item-312683");
    private By remove2 = By.id("cartheader-item-312710");
    private By product = By.xpath("//*[@id=\"nav-wrapper\"]/div/ul[1]/li[1]/a");
    private By bottleShop = By.xpath("//*[@id=\"nav-wrapper\"]/div/ul[1]/li[1]");
    private By exclusiveProducts = By.xpath("//*[@id=\"product-tracking-1625\"]/div[1]/a/img");

//    WebElement loggedUser = syscoLabUIOgm.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/div/div[3]/div[1]/h2"));
//
//
//    public void checkUser(){
//        Assert.assertEquals(syscoLabUIOgm.getText(),"Jacod Williams");
//    }


    public void clickCart(){
        syscoLabUIOgm.sleep(3);
        syscoLabUIOgm.waitTillElementLoaded(cart);
        syscoLabUIOgm.click(cart);

    }

    public void clickProduct(){
        syscoLabUIOgm.click(product);
    }

    public void clickBottleShop(){
        LoggerUtil.logINFO("clicking bottleshop");
        syscoLabUIOgm.click(bottleShop);
    }

    public void clickExclusiveProducts(){
        syscoLabUIOgm.click(exclusiveProducts);
    }

    public void clickRemove(){
//        syscoLabUIOgm.sleep(3);
//        LoggerUtil.logINFO("Clicking Remove1");
//        syscoLabUIOgm.click(remove1);
//        syscoLabUIOgm.sleep(1);
//        LoggerUtil.logINFO("Clicking Remove2");
//        syscoLabUIOgm.click(remove2);
    }



}
