package com.sysco.WebAutomationAssignemnt.functions;

import com.sysco.WebAutomationAssignemnt.common.Constants;
import com.sysco.WebAutomationAssignemnt.pages.LoginPage;
import com.sysco.WebAutomationAssignemnt.utils.DriverSetUpUtil;
import com.syscolab.qe.core.common.LoggerUtil;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by Rifad on 5/21/18.
 */
public class Login extends BaseFunctions  {

    public static LoginPage ogmLoginPage = new LoginPage();


    public static void setAge(){
        LoggerUtil.logINFO("Click date");
        ogmLoginPage.clickDate();
        LoggerUtil.logINFO("select date");
        ogmLoginPage.setDate();
        LoggerUtil.logINFO("click month");
        ogmLoginPage.clickMonth();
        LoggerUtil.logINFO("select month");
        ogmLoginPage.setMonth();
        LoggerUtil.logINFO("click year");
        ogmLoginPage.clickYear();
        LoggerUtil.logINFO("select year");
        ogmLoginPage.setYear();
        LoggerUtil.logINFO("click country");
        ogmLoginPage.clickCountry();
        LoggerUtil.logINFO("set country");
        ogmLoginPage.setCountry();
        LoggerUtil.logINFO("press continue");
        ogmLoginPage.cont();
    }

    public static void wrongAge(){
        ogmLoginPage.clickDate();
        ogmLoginPage.setDate();
        ogmLoginPage.clickMonth();
        ogmLoginPage.setWrongMonth();
        ogmLoginPage.clickYear();
        ogmLoginPage.setWrongYear();
        ogmLoginPage.cont();
    }

    public static String returnErrorMsg(){
        return ogmLoginPage.returnAgeError();
    }

//    public static void clickAccount(){
//        LoggerUtil.logINFO("Clicking My Account");
//        ogmLoginPage.clickAcc();
//    }


    public static void loginToFtr() {

    }
}
