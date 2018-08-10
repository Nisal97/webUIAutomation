package com.sysco.WebAutomationAssignemnt.functions;

import com.sysco.WebAutomationAssignemnt.pages.SigninPage;
import com.syscolab.qe.core.common.LoggerUtil;

public class Signin extends BaseFunctions {



    public static void cEmailcPW(){
        LoggerUtil.logINFO("correct email and correct password enetered and signin");
        ogmSigninPage.emailFill();
        ogmSigninPage.passwordFill();
        ogmSigninPage.clickSignin();
        LoggerUtil.logINFO("Logged");
    }

    public static void wEmailwPW(){
        LoggerUtil.logINFO("wrong email and wrong password enetered and signin");
        ogmSigninPage.wrongEmailFill();
        ogmSigninPage.wrongPasswordFill();
        ogmSigninPage.clickSignin();
    }

    public static void cEmailwPW(){
        LoggerUtil.logINFO("correct email and wrong password enetered and signin");
        ogmSigninPage.emailFill();
        ogmSigninPage.wrongPasswordFill();
        ogmSigninPage.clickSignin();
    }

    public static void wEmailcPW(){
        LoggerUtil.logINFO("wrong email and correct password enetered and signin");
        ogmSigninPage.wrongEmailFill();
        ogmSigninPage.passwordFill();
        ogmSigninPage.clickSignin();
    }

    public static void emptyPassword(){
        LoggerUtil.logINFO("correct email and empty password enetered and signin");
        ogmSigninPage.emailFill();
        ogmSigninPage.emptyPasswordFill();
        ogmSigninPage.clickSignin();
    }

    public static String returnShortPWError(){
        return ogmSigninPage.returnShortPassword();
    }

    public static String returnWrongCredentials(){
        return ogmSigninPage.returnInvalidCredentialsError();
    }
}
