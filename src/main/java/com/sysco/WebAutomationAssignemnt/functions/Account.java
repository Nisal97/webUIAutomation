package com.sysco.WebAutomationAssignemnt.functions;


import com.sysco.WebAutomationAssignemnt.pages.AccountPage;
import com.syscolab.qe.core.common.LoggerUtil;

public class Account extends BaseFunctions {



    public static void removeItem(){
        LoggerUtil.logINFO("Clicking Cart");
        ogmAccountPage.clickCartIcon();
        LoggerUtil.logINFO("Removing items");
        ogmAccountPage.clickRemoveCartItem();
        LoggerUtil.logINFO("Item removed");

//        LoggerUtil.logINFO("Clicking Remove");
//        ogmAccountPage.clickRemove();
    }

    public static void gotoProduct(){
        LoggerUtil.logINFO("going to product");
        ogmAccountPage.clickProduct();
    }

    public static String returnAccName(){
        return ogmAccountPage.returnAccountName();
    }

//    public static String cartItems(){
//        return ogmAccountPage.returnCartItemCount();
//
//    }

}
