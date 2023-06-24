package org.example.stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.example.pages.P01_register;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import static org.example.stepDefs.Hooks.driver;

public class D01_registerStepDef {
    P03_homePage home = new P03_homePage();
    P01_register register = new P01_register();
    public  static String Email;
    public  static String Password;



    @Given("User go to register page")
    public void userGoToRegisterPage() {
        home.register().click();
    }

    @When("User select gander type")
    public void userSelectGanderType() {
        register.gender.click();
    }

    @And("User enter first name & last name")
    public void userEnterFirstNameLastName() {
        register.firstName.sendKeys("Yosra");
        register.lastName.sendKeys("Mousa");
    }

    @And("User choose date of birth")
    public void userChooseDateOfBirth() {
        Select day = new Select(register.dayList);
        day.selectByValue("10");
        Select month = new Select(register.monthList);
        month.selectByValue("9");
        Select year = new Select(register.yearList);
        year.selectByValue("1997");
    }

    @And("User enter email{string}")
    public void userEnterEmail(String arg0) {
        Faker fake = new Faker();
        Email =fake.internet().emailAddress();
        register.email.sendKeys(Email);
    }

    @And("Newsletter should be selected")
    public void newsletterShouldBeSelected() {
        if( register.newsletter.isSelected() !=true) {
          register.newsletter.click();
        }
    }

    @And("User enter password & confirm password")
    public void userEnterPasswordConfirmPassword() {
        Password="test2023";
        register.password.sendKeys(Password);
        register.confirmPassword.sendKeys(Password);
    }

    @And("User click on register button")
    public void userClickOnRegisterButton() {
        register.btnRegister.click();
    }



    @Then("User create new account successfully")
    public void userCreateNewAccountSuccessfully() {
        SoftAssert soft = new SoftAssert();
        //success message is dispalyed "Your registration completed";
        soft.assertEquals(register.result.getText(),"Your registration completed");
        //color of his message is green;
        soft.assertEquals(register.result.getCssValue("color"),"rgba(76, 177, 124, 1)");
        soft.assertAll();

    }

    @Then("Account is not created successfully")
    public void accountIsNotCreatedSuccessfully() {

        SoftAssert soft = new SoftAssert();
          String actualError =register.wrongEmail.getText();
          soft.assertEquals(actualError ,"Wrong email");
          //second asserion
          String actualUrl = driver.getCurrentUrl();
          soft.assertEquals(actualUrl,"https://demo.nopcommerce.com/register?returnUrl=%2F");
          soft.assertAll();
    }

    @And("User enter  invalidEmail")
    public void userEnterInvalidEmail() {


                   Faker fake = new Faker();
                   String arg0 =fake.name().firstName();
              register.email.sendKeys(arg0+ "example.com");



}}
