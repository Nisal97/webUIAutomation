package com.sysco.WebAutomationAssignemnt.tests;


import com.sysco.WebAutomationAssignemnt.data.LoginData;
import com.sysco.WebAutomationAssignemnt.functions.*;
import com.sysco.WebAutomationAssignemnt.utils.ExcelUtil;
import com.sysco.WebAutomationAssignemnt.utils.TestBase;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class LoginTest extends TestBase {

    @BeforeClass
    public void init(ITestContext iTestContext) {
        iTestContext.setAttribute("feature", "Bundabergrum - Checkout");
    }


    @Test
    public void testLogin() throws Exception {

        // Sample way to retrive data from excel
//        LoginData loginData = ExcelUtil.getLoginData("$as238l");

        //UI Automation  sample

//        Home.clickAccount();
//        Signin.clickSignin();
//        Account.gotoProduct();
//        Catagory.gotoBottleShop();
//        Catagory.clickOneBottle();



//        Account.removeItem();
//        Item.purchaseItem();
//        Catagory.goExclusiveCatagory();


        Login.quiteDriver();
    }

    @Test(description = "validating using wrong age", dependsOnMethods = "testLogin")
    public void testWrongAgeLogin() throws Exception{
        Login.loadLoginPage();
        Login.wrongAge();
    }

    @Test(description = "validating using wrong age", dependsOnMethods = "testWrongAgeLogin")
    public void testCorrectAgeLogin() throws Exception{
        Login.loadLoginPage();
        Login.setAge();
    }

    @Test(description = "naviagting to my  account", dependsOnMethods = "testCorrectAgeLogin")
    public void navigateMyAccount() throws Exception{

    }


}