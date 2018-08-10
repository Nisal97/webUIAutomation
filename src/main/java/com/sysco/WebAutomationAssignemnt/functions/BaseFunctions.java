package com.sysco.WebAutomationAssignemnt.functions;

import com.sysco.WebAutomationAssignemnt.common.Constants;
import com.sysco.WebAutomationAssignemnt.pages.*;
import com.sysco.WebAutomationAssignemnt.utils.DriverSetUpUtil;
import org.openqa.selenium.remote.DesiredCapabilities;

//import static com.sysco.WebAutomationAssignemnt.functions.Login.ogmLoginPage;

public class BaseFunctions {

    public static LoginPage ogmLoginPage = new LoginPage();
    public static BottlePage ogmBottlePage = new BottlePage();
    public static AccountPage ogmAccountPage = new AccountPage();
    public static CatagoryPage ogmCatagoryPage = new CatagoryPage();
    public static HomePage ogmHomePage = new HomePage();
    public static ItemPage ogmItemPage = new ItemPage();
    public static SigninPage ogmSigninPage = new SigninPage();


    public static void loadLoginPage() {

        if (Constants.RUN_LOCALLY) {
            DriverSetUpUtil.setToRunLocally();
            DesiredCapabilities capabilities = null;
            ogmLoginPage.loadLoginPage(capabilities, Constants.APP_URL);
        } else {
            ogmLoginPage.loadLoginPage(DriverSetUpUtil.setToRunRemotely(Constants.APP_OS), Constants.APP_URL);
        }
    }


    public static void quiteDriver() {
        ogmLoginPage.quitDriver();
    }




}
