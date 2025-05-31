package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators
    private final By observations_Section = By.xpath("//a[@href=\"/observations\"]");
    private final By observationStatus_label = By.id("pixel-status-tooltip");
    private final By viewing_dropDownList = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div/div/div[2]/div[3]/div/div/div/div[2]/div[1]/div/div/div/a/span");
    private final By viewingAsCreator_button = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div/div/div[2]/div[3]/div/div/div/div[2]/div[1]/div/div/div/div/button[2]");



    // Actions

    public void clickObservations() {
        driver.findElement(observations_Section).click();
    }



    //Assertion
    public void validateObservationCreating()
    {
        driver.findElement(viewing_dropDownList).click();
        driver.findElement(viewingAsCreator_button).click();

        Assert.assertEquals("Positive Observation", driver.findElement(observationStatus_label).getText());



    }
}


