package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_currenciesStepDef {
    P03_homePage home = new P03_homePage();


    @Given("user Select Euro currency")
    public  void userSelectEurocurrency (){
            //   home.customerCurrency.getAttribute("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
        Select list = new Select(home.customercurrency);
        list.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
        boolean actualResult= home.customercurrency.isDisplayed();
       // Assert.assertTrue(actualResult);
        Assert.assertEquals(actualResult,true);





        
    }


    @Then("verify Euro Symbol  is displayed in Home page")
    public void verifyEuroSymbolIsDisplayedInHomePage() {
    }
}
