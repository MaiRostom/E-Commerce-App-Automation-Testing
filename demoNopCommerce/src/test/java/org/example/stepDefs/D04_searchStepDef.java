package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {
    SoftAssert soft = new SoftAssert();
    P03_homePage homePage = new P03_homePage();

    @Given("user clicks on search field")
    public void userclickonsearchfield()  {
        homePage.searchField().click();
    }

    @And("user search with {string}")
    public void userSearchWith(String productName) {
        homePage.searchField().sendKeys(productName);
        homePage.searchButton().click();

    }

    @Then("user could find {string} relative results")
    public void userCouldFindRelativeResults(String productName) {
        int numberOfProducts = homePage.productTitles().size();  //كدا هو خزن الل
        for (int i = 0; i < numberOfProducts; i++) {


            String actual = homePage.productTitles().get(i).getText();
            String expected = productName;
            expected = expected.toLowerCase();
            actual = actual.toLowerCase();
            System.out.println(actual+"  hahahaha"+i);
            System.out.println(expected+"  hahahaha"+i);
            String actualUrl = homePage.currentUrl();
            String expectedUrl = "https://demo.nopcommerce.com/search?q=";
            soft.assertTrue(actualUrl.contains(expectedUrl));
            soft.assertTrue(actual.contains(expected));
            soft.assertAll();
        }

    }

    @Then("user could find {string} inside product details page")
    public void userCouldFindInsideProductDetailsPage(String sku) {
        int numberOfProducts = homePage.productTitles().size();  //كدا هو خزن الل
//        for (int i = 0; i < numberOfProducts; i++) {
//
//
//            String actual = homePage.productTitles().get(i).getText();
//
//            String expected = sku;
//            expected = expected.toLowerCase().replaceAll("\\s", "");
//            actual = actual.toLowerCase().replaceAll("\\s", "");
//
//
//            System.out.println(expected+" jjjjahaha"+i);
//            System.out.println(actual+" haaha"+i);
            System.out.println(numberOfProducts+" this is number of number Of Products shown now ");

            soft.assertTrue(numberOfProducts == 1);

            soft.assertAll();
//        }
    }
}
