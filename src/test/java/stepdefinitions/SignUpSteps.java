package stepdefinitions;

import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.SignUpPage;
import utils.ConfigReader;
import com.utils.DriverFactory;



public class SignUpSteps {  

    WebDriver driver = DriverFactory.getDriver();
    SignUpPage signUpPage = new SignUpPage(driver);
    
    private final By lnkCreateAccount = By.xpath("//ul[@class='header links']//li//a[contains(@href ,'create')]");

    @Given("user navigates to the registration page")
    public void user_navigates_to_registration_page() {
        driver.get(ConfigReader.getProperty("base.url"));
        driver.findElement(lnkCreateAccount).click();
    }

    @When("user enters valid signup details")
    public void user_enters_valid_signup_details() {
        signUpPage.enterFirstName("Apurvaa");
        signUpPage.enterLastName("Pandey");
        signUpPage.enterEmail("apurva" + System.currentTimeMillis() + "@test.com");
        signUpPage.enterPassword("Test@1234pandey1");
        signUpPage.enterConfirmPassword("Test@1234pandey1");
    }

    @And("submits the form")
    public void submits_the_form() {
        signUpPage.clickCreateAccount();
    }

    @Then("user account should be created successfully")
    public void account_created_successffully() {
            driver.quit();
    }
}
