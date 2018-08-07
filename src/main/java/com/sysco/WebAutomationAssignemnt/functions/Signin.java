package com.sysco.WebAutomationAssignemnt.functions;

import com.sysco.WebAutomationAssignemnt.pages.SigninPage;
import com.syscolab.qe.core.common.LoggerUtil;

public class Signin extends BaseFunctions {

    public static SigninPage ogmSigninPage = new SigninPage();

    public static void clickSignin(){
        LoggerUtil.logINFO("email and password enetered and signin");
        ogmSigninPage.emailFill();
        ogmSigninPage.passwordFill();
        ogmSigninPage.clickSignin();
    }

}
