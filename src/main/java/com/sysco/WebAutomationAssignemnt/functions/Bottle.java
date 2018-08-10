package com.sysco.WebAutomationAssignemnt.functions;

import com.sysco.WebAutomationAssignemnt.pages.BottlePage;

public class Bottle extends BaseFunctions {

    public static BottlePage ogmBottlePage = new BottlePage();

    public static String verifyBottleName(){
        return ogmBottlePage.returnBottleName();
    }

    public static String verifyBottlePrice(){
        return ogmBottlePage.returnBottlePrice();
    }

    public static void addCart(){
        ogmBottlePage.clickAddCart();
    }
}
