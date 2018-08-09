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
    private By accountName = By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/div/div[3]/div[1]/h2");



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

    public String returnAccountName(){
        return syscoLabUIOgm.getText(accountName);
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
