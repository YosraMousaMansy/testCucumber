package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;

public class P01_register {


    public P01_register()
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="gender-female")
    public WebElement gender;
    @FindBy(id="FirstName")
    public WebElement firstName;

    @FindBy(id="LastName")
    public WebElement lastName;

    @FindBy(name="DateOfBirthDay")
    public
    WebElement dayList;
    @FindBy(name="DateOfBirthMonth")
    public  WebElement monthList;
    @FindBy(name="DateOfBirthYear")
    public  WebElement yearList;
    @FindBy(id="Email")
    public  WebElement email;
    @FindBy(id="Newsletter")
    public  WebElement newsletter;
    @FindBy(id="Password")
    public  WebElement password;
    @FindBy(id="ConfirmPassword")
    public  WebElement confirmPassword;
    @FindBy(id="register-button")
    public WebElement btnRegister;

    @FindBy(className = "result")
    public WebElement result;

    @FindBy(id="Email-error")
    public WebElement wrongEmail;
}
