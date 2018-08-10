package com.sysco.WebAutomationAssignemnt.tests;


import com.sysco.WebAutomationAssignemnt.data.LoginData;
import com.sysco.WebAutomationAssignemnt.functions.*;
import com.sysco.WebAutomationAssignemnt.utils.ExcelUtil;
import com.sysco.WebAutomationAssignemnt.utils.TestBase;
import com.syscolab.qe.core.common.LoggerUtil;
import net.sf.ezmorph.test.ArrayAssertions;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


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
        Login.loadLoginPage();

//        Account.gotoProduct();
//        Catagory.gotoBottleShop();
//        Catagory.clickOneBottle();



//        Account.removeItem();
//        Item.purchaseItem();
//        Catagory.goExclusiveCatagory();


//        Login.quiteDriver();
    }

    @Test(description = "validating using wrong age", dependsOnMethods = "testLogin", alwaysRun = true)
    public void testWrongAgeLogin() throws Exception{
        Login.wrongAge();
        SoftAssert wrongAgeAssert = new SoftAssert();
        wrongAgeAssert.assertEquals(Login.returnErrorMsg(),"Sorry, your age or location does not permit you to enter at this time.");
        wrongAgeAssert.assertAll();
    }

    @Test(description = "enter using correct age", dependsOnMethods = "testWrongAgeLogin", alwaysRun = true)
    public void testCorrectAgeLogin() throws Exception{
        Login.setAge();
    }

    @Test(description = "naviagting to my  account", dependsOnMethods = "testCorrectAgeLogin", alwaysRun = true)
    public void testNavigateMyAccount() throws Exception{
        Home.clickAccount();
    }

//    @Test(description = "enter correct mail and empty password", dependsOnMethods = "testNavigateMyAccount", alwaysRun = true)
//    public void emptyPWvalidate() throws Exception{
//        Signin.emptyPassword();
//        SoftAssert emptyPWErrorAssert = new SoftAssert();
//        emptyPWErrorAssert.assertEquals(Signin.returnShortPWError(),"This is a required field.");
//        emptyPWErrorAssert.assertAll();
//    }

    @Test(description = "enter wrong mail and wrong password", dependsOnMethods = "testNavigateMyAccount", alwaysRun = true)
    public void wrongCredentialsValidate() throws Exception{
        Signin.wEmailwPW();
        SoftAssert wrondgCredentialsAssert = new SoftAssert();
        wrondgCredentialsAssert.assertEquals(Signin.returnWrongCredentials(),"Invalid login or password.");
        wrondgCredentialsAssert.assertAll();
    }

    @Test(description = "enter correct mail and wrong password", dependsOnMethods = "wrongCredentialsValidate", alwaysRun = true)
    public void wrongPasswordValidate() throws Exception{
        Signin.cEmailwPW();
        SoftAssert wrongPasswordAssert = new SoftAssert();
        wrongPasswordAssert.assertEquals(Signin.returnWrongCredentials(),"Invalid login or password.");
        wrongPasswordAssert.assertAll();
    }

    @Test(description = "enter wrong mail and correct password", dependsOnMethods = "wrongPasswordValidate", alwaysRun = true)
    public void wrongEmailValidate() throws Exception{
        Signin.wEmailcPW();
        SoftAssert wrongEmailAssert = new SoftAssert();
        wrongEmailAssert.assertEquals(Signin.returnWrongCredentials(),"Invalid login or password.");
        wrongEmailAssert.assertAll();
    }

    @Test(description = "signin to my account with correct email and password", dependsOnMethods = "wrongEmailValidate", alwaysRun = true)
    public void testAccountSignin() throws Exception{
        Signin.cEmailcPW();
    }

    @Test(description = "validating user name", dependsOnMethods = "testAccountSignin", alwaysRun = true)
    public void validateUsername() throws Exception{
        Account.returnAccName();
        SoftAssert accountNameAssert = new SoftAssert();
        accountNameAssert.assertEquals(Account.returnAccName(),"HELLO, WILLIAM JACOB!");
        accountNameAssert.assertAll();

//        Account.removeItem();
    }

    @Test(description = "validating cart", dependsOnMethods = "validateUsername", alwaysRun = true)
    public void validateCart() throws Exception{
//        Account.cartItems();
//        SoftAssert cartAssert = new SoftAssert();
//        cartAssert.assertEquals(Account.returnAccName(),"1");
//        cartAssert.assertAll();

        Account.gotoProduct();
        LoggerUtil.logINFO("going to product");
    }

    @Test(description = "Choosing item", dependsOnMethods = "validateCart", alwaysRun = true)
    public void testChooseItem() throws Exception{
        Catagory.chooseProduct();
    }

    @Test(description = "verify bottle name", dependsOnMethods = "testChooseItem", alwaysRun = true)
    public void testValidateBottleName() throws Exception{
        SoftAssert bottleNameAssert = new SoftAssert();
        bottleNameAssert.assertEquals(Bottle.verifyBottleName(),"BUNDABERG ROYAL LIQUEUR SALTED CARAMEL");
        bottleNameAssert.assertAll();
    }

    @Test(description = "verify bottle price", dependsOnMethods = "testValidateBottleName", alwaysRun = true)
    public void testValidateBottlePrice() throws Exception{
        SoftAssert bottlePriceAssert = new SoftAssert();
        bottlePriceAssert.assertEquals(Bottle.verifyBottlePrice(),"$49.95");
        bottlePriceAssert.assertAll();
    }

    @Test(description = "verify bottle price", dependsOnMethods = "testValidateBottlePrice", alwaysRun = true)
    public void testBottleAddCart() throws Exception{
        Bottle.addCart();
    }
}