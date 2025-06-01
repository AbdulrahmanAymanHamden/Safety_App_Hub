package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor scroll;
    Actions actions;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        scroll = (JavascriptExecutor) driver;
        actions = new Actions(driver);
    }

    // Locators
    private final By observations_Section = By.xpath("//a[@href=\"/observations\"]");
    private final By observationStatus_Label = By.id("pixel-status-tooltip");
    private final By viewingNOActionStated_dropDownList = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div/div/div[2]/div[3]/div/div/div/div[2]/div[1]/div/div/div/a/span");
    private final By viewingActionStated_DropDownList =   By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div/div/div[2]/div[3]/div/div/div/div/div[1]/div/div/div/a/span");
    private final By viewingAsCreatorNoActionStated_button = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div/div/div[2]/div[3]/div/div/div/div[2]/div[1]/div/div/div/div/button[2]");
    private final By viewinAsCreatorActionStated_Button = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div/div/div[2]/div[3]/div/div/div/div/div[1]/div/div/div/div/button[2]");
    private final By viewingAsHSERepNoActionStated_Button = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div/div/div[2]/div[3]/div/div/div/div[2]/div[1]/div/div/div/div/button[3]");
    private final By viewingAsHSERepActionStated_Button = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div/div/div[2]/div[3]/div/div/div/div/div[1]/div/div/div/div/button[3]");
    private final By actionsObservation_Button = By.xpath("//*[@id=\"igs-table-container\"]/div/table/tbody/tr[1]/td[13]/div/div/div[1]");
    private final By addHSEAction_Button = By.xpath("//*[@id=\"igs-table-container\"]/div/table/tbody/tr[1]/td[13]/div/div/div[2]/div/button");
    private final By clickConfirmPositiveObservation_Button = By.xpath("//*[@id=\"igs-table-container\"]/div/table/tbody/tr[1]/td[13]/div/div/div[2]/div/div/button");
    private final By observationActionStated_Button = By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div[3]/div/ul/li[2]/a");
    private final By viewAction_Button = By.xpath("//*[@id=\"igs-table-container\"]/div/table/tbody/tr[1]/td[13]/div/div/div[2]/button");
    private final By closeObservation_Button = By.xpath("//button[@class=\"btn-close\"]");
    private final By linkUser_Button = By.xpath("//a[@class=\"nav-link dropdown-user-link\"]");
    private final By logOut_Button = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div/div[1]/nav/div/ul/li/div/a[2]");
    private final By submit_Button = By.xpath("//button[@class=\"swal2-confirm btn btn-outline-secondary btn-success\"]");




    // Actions

    public void clickObservations()
    {
        driver.findElement(observations_Section).click();
    }
    public void addHSERepAction()
    {
        driver.findElement(viewingNOActionStated_dropDownList).click();
        driver.findElement(viewingAsHSERepNoActionStated_Button).click();
        driver.findElement(actionsObservation_Button).click();
        driver.findElement(addHSEAction_Button).click();
    }
    public void addComfirmPostiveObservationAction()
    {
        driver.findElement(clickConfirmPositiveObservation_Button).click();
        driver.findElement(submit_Button).click();
    }

    public void logingOut()
    {
        driver.findElement(linkUser_Button).click();
        driver.findElement(logOut_Button).click();
    }


    //Assertion
    public void validateObservationCreated()
    {
        driver.findElement(viewingNOActionStated_dropDownList).click();
        driver.findElement(viewingAsCreatorNoActionStated_button).click();
        Assert.assertEquals("positive Observation", driver.findElement(observationStatus_Label).getText());
    }
    public void validateObservationMoveToActionStated()
    {
//        scroll.executeScript("window.scrollTo(0, -100);");
        actions.scrollByAmount(0, -200).perform();


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.scrollByAmount(0, -200).perform();


        driver.findElement(observationActionStated_Button).click();
        driver.findElement(viewingActionStated_DropDownList).click();
        driver.findElement(viewingAsHSERepActionStated_Button).click();
        driver.findElement(actionsObservation_Button).click();
        driver.findElement(viewAction_Button).click();
        Assert.assertEquals("Positive Observation", driver.findElement(observationStatus_Label).getText());
        driver.findElement(closeObservation_Button).click();
    }
    public void validatecreatorCanViewObservationInActionStated()
    {
        driver.findElement(viewingActionStated_DropDownList).click();
        driver.findElement(viewinAsCreatorActionStated_Button).click();
        driver.findElement(actionsObservation_Button).click();
        driver.findElement(viewAction_Button).click();
        Assert.assertEquals("Positive Observation", driver.findElement(observationStatus_Label).getText());
        driver.findElement(closeObservation_Button).click();
    }

}


