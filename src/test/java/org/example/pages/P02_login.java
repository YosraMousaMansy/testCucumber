package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;

public class P02_login {
    public P02_login()
    {

        PageFactory.initElements(driver,this);
    }

@FindBy(className="ico-login")
    public WebElement loginTab;

    @FindBy(id="Email")
    public WebElement email;
    @FindBy(id="Password")
    public WebElement password;
    @FindBy(className = "login-button")
    public WebElement btnLogin;

}
