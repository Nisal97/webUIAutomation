package com.sysco.WebAutomationAssignemnt.pages;

import com.syscolab.qe.core.common.LoggerUtil;
import org.openqa.selenium.By;

public class SigninPage extends BasePage {

    private By emailSignin = By.id("email");
    private By passwordSignin = By.id("pass");
    private By confirmSignin  = By.id("send2");
    private By credentialsError = By.xpath("/html/body/div[3]/div[3]/div[2]/div/div/ul/li");
    private By emptyPwError = By.id("advice-required-password-pass");


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
        LoggerUtil.logINFO("logged");
    }

    public void wrongEmailFill(){
        LoggerUtil.logINFO("Selecting email");
        syscoLabUIOgm.click(emailSignin);
        LoggerUtil.logINFO("Filling wrong email");
        syscoLabUIOgm.sendKeys(emailSignin,"williamjacob802@yahoo.com");
    }

    public void wrongPasswordFill(){
        LoggerUtil.logINFO("Selecting password");
        syscoLabUIOgm.click(passwordSignin);
        LoggerUtil.logINFO("Filling wrong password");
        syscoLabUIOgm.sendKeys(passwordSignin,"123411111111");
    }

    public void emptyPasswordFill(){
        LoggerUtil.logINFO("Selecting password");
        syscoLabUIOgm.click(passwordSignin);
        LoggerUtil.logINFO("Leave password blank");
        syscoLabUIOgm.sendKeys(passwordSignin,"");
    }

    public String returnShortPassword(){
        return syscoLabUIOgm.getText(emptyPwError);
    }

    public String returnInvalidCredentialsError(){
        return syscoLabUIOgm.getText(credentialsError);
    }

}
