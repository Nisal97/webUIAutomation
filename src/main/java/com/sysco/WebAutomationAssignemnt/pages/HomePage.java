package com.sysco.WebAutomationAssignemnt.pages;

import com.syscolab.qe.core.ui.web.SyscoLabWUI;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;

public class HomePage extends BasePage{

    private By myAccount = By.xpath("//*[@id=\"quick-access-list\"]/li[1]/ul/li[2]/ul/li/a");

//    public static void loadLoginPage(Capabilities capabilities, String url) {
//        syscoLabUIOgm = new SyscoLabWUI(capabilities);
//        syscoLabUIOgm.navigateTo(url);
//        syscoLabUIOgm.driver.manage().window().maximize();
//    }

    public void clickAcc(){
//        syscoLabUIOgm.waitTillElementLoaded(myAccount);
        syscoLabUIOgm.sleep(2);
        syscoLabUIOgm.click(myAccount);
    }

}
