package Pages;

import Utilities.ElementActions;
import Utilities.JsonReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import org.testng.Assert;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    JsonReader loginData = new JsonReader("LoginData.json");
    String companyID = loginData.readDataFromJson("companyID");
    String email = loginData.readDataFromJson("email");
    String password = loginData.readDataFromJson("password");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators
    private final By companyId_TextBox = By.id("company_id");
    private final By companyLogin_Button = By.xpath("//button[@type='submit']");
    private final By email_TextBox = By.id("login-email");
    private final By password_TextBox = By.id("password");
    private final By login_Button = By.xpath("//button[@type='submit']");
    private final By loginSuccess_ToastMessage = By.id("only-once");

    // Actions

    public void login( ) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ElementActions.type(driver , companyId_TextBox , companyID);
        ElementActions.click(driver , companyLogin_Button);
        ElementActions.type(driver , email_TextBox , email);
        ElementActions.type(driver , password_TextBox , password);
        ElementActions.click(driver , login_Button);

    }

    // Assertions (add your own if needed)
    public void validateLoginSuccess() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginSuccess_ToastMessage));
        Assert.assertTrue(driver.findElement(loginSuccess_ToastMessage).isDisplayed());
    }
}
