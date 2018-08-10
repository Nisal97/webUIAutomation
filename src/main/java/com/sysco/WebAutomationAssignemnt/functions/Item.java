package com.sysco.WebAutomationAssignemnt.functions;

import com.sysco.WebAutomationAssignemnt.pages.ItemPage;
import com.syscolab.qe.core.common.LoggerUtil;

public class Item extends BaseFunctions {



    public static void purchaseItem(){
        ogmItemPage.clickOnItem();
        ogmItemPage.addItemToCart();
        LoggerUtil.logINFO("clicked on cart icon");
        ogmItemPage.checkCart();
        LoggerUtil.logINFO("continue to checkout");
        ogmItemPage.checkoutCart();
    }
}
