package com.sysco.WebAutomationAssignemnt.pages;

import com.syscolab.qe.core.ui.SyscoLabUI;
import com.syscolab.qe.core.ui.web.SyscoLabWUI;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;

/**
 * Created by Rifad on 5/21/18.
 */
public class LoginPage extends BasePage {

    private By txtGoogleSearch = By.id("lst-ib");
    private By dateDropDown = By.id("age_select_day");
    private By monthDropDown = By.id("age_select_month");
    private By yearDropDown = By.id("age_select_year");
    private By selectDate = By.xpath("//*[@id=\"age_select_day\"]/option[11]");
    private By selectMonth = By.xpath("//*[@id=\"age_select_month\"]/option[4]");
    private By selectYear = By.xpath("//*[@id=\"age_select_year\"]/option[15]");
    private By selectCont = By.id("age_confirm_btn");
    private By countryDropdown = By.id("age_select_country");
    private By selectCountry = By.xpath("//*[@id=\"age_select_country\"]/option[237]");

//    private By myAccount = By.xpath("//*[@id=\"nav-wrapper\"]/div/ul[1]/li[1]/a");

    public static void loadLoginPage(Capabilities capabilities, String url) {
        syscoLabUIOgm = new SyscoLabWUI(capabilities);
        syscoLabUIOgm.navigateTo(url);
        syscoLabUIOgm.driver.manage().window().maximize();
    }

    public void clickDate(){
        syscoLabUIOgm.waitTillElementLoaded(dateDropDown);
        syscoLabUIOgm.click(dateDropDown);
    }

    public void clickMonth(){
        syscoLabUIOgm.click(monthDropDown);
    }

    public void setDate(){
        syscoLabUIOgm.click(selectDate);
    }

    public void setMonth(){
        syscoLabUIOgm.click(selectMonth);
    }

    public void clickYear(){
        syscoLabUIOgm.click(yearDropDown);
    }

    public void setYear(){
        syscoLabUIOgm.click(selectYear);
    }

    public void cont(){
        syscoLabUIOgm.click(selectCont);
    }

    public void clickCountry(){
        syscoLabUIOgm.click(countryDropdown);
    }

    public void setCountry(){
        syscoLabUIOgm.click(selectCountry);
    }

//    public void clickAcc(){
//        syscoLabUIOgm.click(myAccount);
//    }

    public void quitDriver() {
        if (syscoLabUIOgm != null) {
            syscoLabUIOgm.quit();
        }
    }


    public void enterText(String searchString) {
        syscoLabUIOgm.sendKeys(txtGoogleSearch, searchString);
    }

}

