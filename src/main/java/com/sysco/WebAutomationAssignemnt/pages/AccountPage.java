package com.sysco.WebAutomationAssignemnt.pages;

import com.syscolab.qe.core.common.LoggerUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AccountPage extends BasePage {

    private By cart = By.xpath("//*[@id=\"cartHeader\"]");
    private By cartItems = By.xpath("//*//*[@id=\"quick-access-list\"]/li[2]/ul/li[3]/div/div[1]/span[2]");

    private By product = By.xpath("//*[@id=\"nav-wrapper\"]/div/ul[1]/li[1]/a");
    private By accountName = By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/div/div[3]/div[1]/h2");
    private static By cartRemove =By.xpath("//a[@title='Remove']");
//    private static By cartRemove = By.id("cartheader-item-313820");
    private static By cartQuantity =By.xpath("//li[2]/ul/li[3]/div/div[1]/span[2]");


//    public void clickCart(){
//        syscoLabUIOgm.sleep(3);
//        syscoLabUIOgm.waitTillElementLoaded(cart);
//        syscoLabUIOgm.click(cart);
//
//    }

    public void clickProduct(){
        syscoLabUIOgm.click(product);
    }

    public String returnAccountName(){
        return syscoLabUIOgm.getText(accountName);
    }

//    public String returnCartItemCount(){
//        return syscoLabUIOgm.getText(cartItems);
//    }

    public void clickCartIcon() {
        syscoLabUIOgm.sleep(1);
        syscoLabUIOgm.click(cartQuantity);
        syscoLabUIOgm.sleep(3);
    }
    public void clickRemoveCartItem() {
        int x = 0;
        while (Integer.parseInt(syscoLabUIOgm.getText(cartQuantity)) != 0) {
            syscoLabUIOgm.click(cartRemove);
            syscoLabUIOgm.sleep(2);
            //syscoLabUIOgm.click(cartRemove);
            //syscoLabUIOgm.sleep(1);
            syscoLabUIOgm.isAlertDisplayed();
            //LoggerUtil.logINFO("confirmation alert");
            syscoLabUIOgm.sleep(2);
            syscoLabUIOgm.clickOkInWindowsAlert();
            //LoggerUtil.logINFO("Clicking OK");
            //syscoLabUIOgm.sleep(2);
        }
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
