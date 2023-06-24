package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P02_login;

public class login {
    P02_login login = new P02_login();
    @Given("user go to login page")
    public  void usergotologinpage(){

        login.loginTab.click();

    }

    @And("User enter valid email&password")
    public void userEnterValidEmailPassword() {
       login.email.sendKeys( D01_registerStepDef.Email);
       login.password.sendKeys( D01_registerStepDef.Password);

    }

    @And("user click on login button")
    public void userClickOnLoginButton() {
        login.btnLogin.click();
    }

    @Then("User login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {

    }
}
