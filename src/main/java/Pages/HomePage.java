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
    private final By observationStatus_Label = By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[1]/div[2]/div[3]/div/div/div/div[2]/div[4]/div[2]/div/table/tbody/tr[1]/td[12]/div/div[1]/span");
    private final By viewingObservationStatus_Label = By.xpath("//*[@id=\"pixel-status-tooltip\"]/span");
    private final By viewing_dropDownList = By.xpath("//span[@class=\"fw-bolder text-primary\"]");
    private final By viewingAsCreatorNoActionStated_button = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div/div/div[2]/div[3]/div/div/div/div[2]/div[1]/div/div/div/div/button[2]");
    private final By viewinAsCreatorActionStated_Button = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div/div/div[2]/div[3]/div/div/div/div/div[1]/div/div/div/div/button[2]");
    private final By viewingAsHSERepNoActionStated_Button = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div/div/div[2]/div[3]/div/div/div/div[2]/div[1]/div/div/div/div/button[3]");
    private final By viewingAsHSERepActionStated_Button = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div/div/div[2]/div[3]/div/div/div/div/div[1]/div/div/div/div/button[3]");
    private final By actionsObservation_Button = By.xpath("//*[@id=\"igs-table-container\"]/div/table/tbody/tr[1]/td[13]/div/div/div[1]");
    private final By addHSEAction_Button = By.xpath("//*[@id=\"igs-table-container\"]/div/table/tbody/tr[1]/td[13]/div/div/div[2]/div/button");
    private final By ConfirmPositiveObservation_Button = By.xpath("//*[@id=\"igs-table-container\"]/div/table/tbody/tr[1]/td[13]/div/div/div[2]/div/div/button");
    private final By observationActionStated_Button = By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div[3]/div/ul/li[2]/a");
    private final By viewOptionsAction_Button = By.xpath("//*[@id=\"igs-table-container\"]/div/table/tbody/tr[1]/td[13]/div/div/div[2]/button");
    private final By closeObservation_Button = By.xpath("//button[@class=\"btn-close\"]");
    private final By linkUser_Button = By.xpath("//a[@class=\"nav-link dropdown-user-link\"]");
    private final By logOut_Button = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div/div[1]/nav/div/ul/li/div/a[2]");
    private final By submit_Button = By.xpath("//button[@class=\"swal2-confirm btn btn-outline-secondary btn-success\"]");
    private final By clarificationNeededFromCreatorButton = By.xpath("//*[@id=\"igs-table-container\"]/div/table/tbody/tr[1]/td[13]/div/div/div[2]/div/div/button[2]");
    private final By editOptionsAction_Button = By.xpath("//*[@id=\"igs-table-container\"]/div/table/tbody/tr[1]/td[13]/div/div/div[2]/button[2]");
    private final By closeAndNoActionRequired_Button = By.xpath("//*[@id=\"igs-table-container\"]/div/table/tbody/tr[1]/td[13]/div/div/div[2]/div/div/button[3]/div/span");







    // Actions

    public void clickObservations()
    {
        driver.findElement(observations_Section).click();
    }
    public void addHSERepAction()
    {
        driver.findElement(viewing_dropDownList).click();
        driver.findElement(viewingAsHSERepNoActionStated_Button).click();
        driver.findElement(actionsObservation_Button).click();
        driver.findElement(addHSEAction_Button).click();
    }
    public void addComfirmPostiveObservationAction()
    {
        driver.findElement(ConfirmPositiveObservation_Button).click();
        driver.findElement(submit_Button).click();
    }
    public void addClarificationNeededfromCreatorAction()
    {
        driver.findElement(clarificationNeededFromCreatorButton).click();
        driver.findElement(submit_Button).click();
    }

    public void logingOut()
    {
        driver.findElement(linkUser_Button).click();
        driver.findElement(logOut_Button).click();
    }
    public void editObservationByCreator()
    {
        driver.findElement(viewing_dropDownList).click();
        driver.findElement(viewingAsCreatorNoActionStated_button).click();
        driver.findElement(actionsObservation_Button).click();
        driver.findElement(editOptionsAction_Button).click();

    }
    public void addcloseAndNoActionRequiredAction()
    {
        driver.findElement(closeAndNoActionRequired_Button).click();
        driver.findElement(submit_Button).click();
    }











    //Assertion
    public void validatePositiveObservationCreated()
    {
        driver.findElement(viewing_dropDownList).click();
        driver.findElement(viewingAsCreatorNoActionStated_button).click();
        Assert.assertEquals("Positive Observation", driver.findElement(observationStatus_Label).getText());
    }
    public void validatePositiveObservationMoveToActionStated()
    {
        actions.scrollByAmount(0, -200).perform();


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.scrollByAmount(0, -200).perform();


        driver.findElement(observationActionStated_Button).click();
        driver.findElement(viewing_dropDownList).click();
        driver.findElement(viewingAsHSERepActionStated_Button).click();
        driver.findElement(actionsObservation_Button).click();
        driver.findElement(viewOptionsAction_Button).click();
        Assert.assertEquals("Positive Observation", driver.findElement(viewingObservationStatus_Label).getText());
        driver.findElement(closeObservation_Button).click();
    }
    public void validateCreatorCanViewPositiveObservationInActionStated()
    {
        driver.findElement(viewing_dropDownList).click();
        driver.findElement(viewinAsCreatorActionStated_Button).click();
        driver.findElement(actionsObservation_Button).click();
        driver.findElement(viewOptionsAction_Button).click();
        Assert.assertEquals("Positive Observation", driver.findElement(viewingObservationStatus_Label).getText());
        driver.findElement(closeObservation_Button).click();
    }
    public void validateUnSafeActObservationCreatedOrUpdated()
    {
        driver.findElement(viewing_dropDownList).click();
        driver.findElement(viewingAsHSERepNoActionStated_Button).click();
        Assert.assertEquals("Draft", driver.findElement(observationStatus_Label).getText());
    }
    public void validateObservationStatus()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals("Clarification Needed from Creator", driver.findElement(observationStatus_Label).getText());

    }
    public void validateNoActionRequiredObservationMoveToActionStated()
    {
        actions.scrollByAmount(0, -200).perform();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.scrollByAmount(0, -200).perform();


        driver.findElement(observationActionStated_Button).click();
        driver.findElement(viewing_dropDownList).click();
        driver.findElement(viewingAsHSERepActionStated_Button).click();
        driver.findElement(actionsObservation_Button).click();
        driver.findElement(viewOptionsAction_Button).click();
        Assert.assertEquals("No Action Required", driver.findElement(viewingObservationStatus_Label).getText());
        driver.findElement(closeObservation_Button).click();
    }
    public void validateCreatorCanViewNoActionRequiredObservationInActionStated()
    {
        driver.findElement(viewing_dropDownList).click();
        driver.findElement(viewinAsCreatorActionStated_Button).click();
        driver.findElement(actionsObservation_Button).click();
        driver.findElement(viewOptionsAction_Button).click();
        Assert.assertEquals("No Action Required", driver.findElement(viewingObservationStatus_Label).getText());
        driver.findElement(closeObservation_Button).click();
    }

}


