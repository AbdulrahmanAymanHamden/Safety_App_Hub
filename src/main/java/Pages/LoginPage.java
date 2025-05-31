package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import org.testng.Assert;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

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

    public void login(String companyId, String email, String password) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(companyId_TextBox).sendKeys(companyId);
        driver.findElement(companyLogin_Button).click();
        driver.findElement(email_TextBox).sendKeys(email);
        driver.findElement(password_TextBox).sendKeys(password);
        driver.findElement(login_Button).click();
    }

    // Assertions (add your own if needed)
    public void validateLoginSuccess() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginSuccess_ToastMessage));
        Assert.assertTrue(driver.findElement(loginSuccess_ToastMessage).isDisplayed());
    }
}
