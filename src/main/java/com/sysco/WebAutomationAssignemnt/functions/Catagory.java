package com.sysco.WebAutomationAssignemnt.functions;

import com.sysco.WebAutomationAssignemnt.pages.CatagoryPage;
import com.syscolab.qe.core.common.LoggerUtil;

public class Catagory extends BaseFunctions {

    public static CatagoryPage ogmCatagoryPage = new CatagoryPage();

//    public static void goExclusiveCatagory(){
//        LoggerUtil.logINFO("clicking exclusive liquor");
//        ogmCatagoryPage.clickExclusive();
//    }


    public static void chooseProduct(){
        ogmCatagoryPage.clickBottleShop();
        ogmCatagoryPage.clickExclusiveProducts();
        ogmCatagoryPage.clickOnBottle();
    }


}
