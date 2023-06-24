package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.testng.asserts.SoftAssert;

public class D08_WishlistStepDef {

    P03_homePage home = new P03_homePage();






    @Given("user click on wishlist button")
    public void userClickOnWishlistButton() {
        home.btnWhishlist.click();
    }

    @Then("verify The product has been added successfully to your wishlist")
    public void verifyTheProductHasBeenAddedSuccessfullyToYourWishlist() {
        boolean actualResult= home.contentMsg.isDisplayed();
        SoftAssert soft = new SoftAssert();
        //success message is displayed "The product has been added to your wishlist";
        soft.assertEquals(home.contentMsg.getText(),"The product has been added to your wishlist");
        //color of his message is green;
        soft.assertEquals(home.contentMsg.getCssValue("background-color"),"rgba(75, 176, 122, 1)");
        soft.assertAll();

    }
}
