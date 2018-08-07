package com.sysco.WebAutomationAssignemnt.pages;

import com.syscolab.qe.core.common.LoggerUtil;
import org.openqa.selenium.By;

public class SigninPage extends BasePage {

    private By emailSignin = By.id("email");
    private By passwordSignin = By.id("pass");
    private By confirmSignin  = By.id("send2");

    public void emailFill(){
        LoggerUtil.logINFO("Selecting email");
        syscoLabUIOgm.click(emailSignin);
        LoggerUtil.logINFO("Filling email");
        syscoLabUIOgm.sendKeys(emailSignin,"williamjacob802@gmail.com");
    }

    public void passwordFill(){
        LoggerUtil.logINFO("Selecting password");
        syscoLabUIOgm.click(passwordSignin);
        LoggerUtil.logINFO("Filling password");
        syscoLabUIOgm.sendKeys(passwordSignin,"12345678");
    }

    public void clickSignin(){
        LoggerUtil.logINFO("Signin confirm");
        syscoLabUIOgm.click(confirmSignin);
    }
}
