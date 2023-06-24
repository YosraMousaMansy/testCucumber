package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;

public class P03_homePage {

    public WebElement registerTab()
    {
        return driver.findElement(By.className("ico-register"));
    }
    public P03_homePage()
    {
        PageFactory.initElements(driver,this);
    }





    @FindBy(id="customerCurrency")
    public  WebElement customercurrency;


    @FindBy(className="button-2 add-to-wishlist-button")
    public  WebElement btnWhishlist;

    @FindBy(className="content")
    public  WebElement contentMsg;





}
