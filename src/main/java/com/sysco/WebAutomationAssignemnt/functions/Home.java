package com.sysco.WebAutomationAssignemnt.functions;

import com.sysco.WebAutomationAssignemnt.pages.HomePage;
import com.syscolab.qe.core.common.LoggerUtil;


public class Home extends BaseFunctions {



    public static void clickAccount(){
        LoggerUtil.logINFO("Clicking My Account");
        ogmHomePage.clickAcc();
    }

}
