package com.sysco.WebAutomationAssignemnt.functions;

import com.sysco.WebAutomationAssignemnt.pages.CatagoryPage;
import com.syscolab.qe.core.common.LoggerUtil;

public class Catagory extends BaseFunctions {

    public static CatagoryPage ogmCatagoryPage = new CatagoryPage();

//    public static void goExclusiveCatagory(){
//        LoggerUtil.logINFO("clicking exclusive liquor");
//        ogmCatagoryPage.clickExclusive();
//    }

    public static void gotoBottleShop(){
        LoggerUtil.logINFO("going to bottle shop");
        ogmCatagoryPage.clickBottleShop();
    }

    public static void gotoExclusiveProducts(){
        LoggerUtil.logINFO("going to exclusive products");
        ogmCatagoryPage.clickExclusiveProducts();
        LoggerUtil.logINFO("in exclusive products");
    }

}
