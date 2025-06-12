package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pages.BasePage;

import io.qameta.allure.Step;

public class SignUpPage extends BasePage {

   private final By firstName = By.id("firstname");
   private final By lastName = By.id("lastname");
   private final By email = By.id("email_address");
   private final By password = By.id("password");
   private final By confirmPassword = By.id("password-confirmation");
   private final By btnCreateAccount = By.xpath("//button[@title='Create an Account']");

   

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    @Step("Enter first name: {fname}")
    public void enterFirstName(String fname) {
        driver.findElement(firstName).sendKeys(fname);
    }
    @Step("Enter last name: {lname}")
    public void enterLastName(String lname) {
        driver.findElement(lastName).sendKeys(lname);
    }
    @Step("Enter email: {mail}")
    public void enterEmail(String mail) {
        driver.findElement(email).sendKeys(mail);
    }
    @Step("Enter password: {passwo}")
    public void enterPassword(String passwo) {
        driver.findElement(password).sendKeys(passwo);
    }
    @Step("Enter confirm password: {confpass}")
    public void enterConfirmPassword(String confpass) {
        driver.findElement(confirmPassword).sendKeys(confpass);
    }
    @Step("Click on Create Account button")
    public void clickCreateAccount() {
        driver.findElement(btnCreateAccount).click();
    }
}
