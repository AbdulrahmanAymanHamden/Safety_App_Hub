package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ObservationsPage {

    WebDriver driver;
    WebDriverWait wait;
    LocalDate today = LocalDate.now();
    String formattedDate = today.format(DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH));
    Actions actions;



    public ObservationsPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        actions =new Actions(driver);
    }

    // Locators
    private final By addObservations_Button = By.xpath("//button[@class=\"align-items-center btn btn-success\"]");
    private final By date_Input = By.id("date");
    private final By dateSelected_Selection = By.xpath("//span[@aria-label=\""+formattedDate+"\"]");
    private final By shift_Selection = By.xpath("(//div[@class=\"select__control css-13cymwt-control\"]/div/div/input[contains(@id, 'react-select')])[1]");
    private final By time_Selection = By.id("custom-date-time-picker-input");
    private final By observationDuration_TextBox = By.xpath("//*[@id=\"duration\"]");
    private final By branch_Selection = By.xpath("(//div[@class=\"select__control css-13cymwt-control\"]/div/div/input[contains(@id, 'react-select')])[2]");
    private final By positiveObservation_Selection = By.xpath("//input[@value=\"positive_observation\"]");
    private final By observationTitle_TextBox = By.id("title");
    private final By observationDetails_TextBox = By.xpath("//div[@class=\"ql-editor ql-blank\"]");
    private final By editObservationDetails_TextBox = By.xpath("//*[@id=\"my-modal\"]/div/div[2]/div/form/div[3]/div[3]/div/div/div[2]/div[1]");
    private final By hasAction_Yes_Selection = By.xpath("(//input[@name=\"has_action\"])[1]");
    private final By hasDiscussion_Yes_Selection = By.xpath("(//input[@name=\"has_discussion\"])[1]");
    private final By submit_Button = By.xpath("//button[@type=\"submit\"]");
    private final By confirm_Button = By.xpath("//button[@class=\"swal2-confirm btn btn-outline-secondary btn-success\"]");
    private final By subArea_Selection = By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div[3]/div/div/div/div[2]/div/div/div[2]/div/form/div[1]/div[8]/div/div[2]/div/div[1]/div[2]/input");
    private final By mainArea_Selection = By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div[3]/div/div/div/div[2]/div/div/div[2]/div/form/div[1]/div[7]/div/div[2]/div/div[1]/div[2]/input");
    private final By observationList_Button = By.xpath("//button[@class=\"align-items-center btn btn-primary\"]");
    private final By unSafeActObservation_Selection = By.xpath("//input[@value=\"unsafe_act\"]");
    private final By unSafeOptions_Selection = By.id("items-2");
    private final By update_Button = By.xpath("//button[@class=\"swal2-confirm btn btn-outline-secondary btn-success\"]");
    private final By unSafeConditionObservation_Selection = By.xpath("//input[@value=\"unsafe_condition\"]");



    // Actions

    public void clickAddObservations() {
        driver.findElement(addObservations_Button).click();
    }

    public void createObservation()  {
        driver.findElement(date_Input).click();
        driver.findElement(dateSelected_Selection).click();
        driver.findElement(observationDuration_TextBox).sendKeys("5");
        driver.findElement(shift_Selection).sendKeys("night");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.sendKeys(Keys.ENTER).perform();
        driver.findElement(time_Selection).click();
        driver.findElement(branch_Selection).sendKeys("Cairo branch");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.sendKeys(Keys.ENTER).perform();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(mainArea_Selection).sendKeys("main");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.sendKeys(Keys.ENTER).perform();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(subArea_Selection).sendKeys("sub");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.sendKeys(Keys.ENTER).perform();

    }
    public void creatPositiveObservation()
    {
        driver.findElement(positiveObservation_Selection).click();
        driver.findElement(observationTitle_TextBox).sendKeys("AutomationTest");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(observationDetails_TextBox).sendKeys("AutomationTest");
        driver.findElement(hasAction_Yes_Selection).click();
        driver.findElement(hasDiscussion_Yes_Selection).click();
        driver.findElement(submit_Button).click();
        driver.findElement(confirm_Button).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(observationList_Button).click();
    }

    public void creatUnsafeActObservation()
    {
        driver.findElement(unSafeActObservation_Selection).click();
        driver.findElement(observationTitle_TextBox).sendKeys("Automation Test");
        driver.findElement(unSafeOptions_Selection).click();
        driver.findElement(observationDetails_TextBox).sendKeys("Automation Test");
        driver.findElement(hasAction_Yes_Selection).click();
        driver.findElement(hasDiscussion_Yes_Selection).click();
        driver.findElement(submit_Button).click();
        driver.findElement(confirm_Button).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(observationList_Button).click();
    }
    public void makeClarificationCreator()
    {
        driver.findElement(editObservationDetails_TextBox).sendKeys("clarification");
        driver.findElement(submit_Button).click();
        driver.findElement(update_Button).click();
    }

    public void creatUnsafeConditionObservation()
    {
        driver.findElement(unSafeConditionObservation_Selection).click();
        driver.findElement(observationTitle_TextBox).sendKeys("Automation Test");
        driver.findElement(unSafeOptions_Selection).click();
        driver.findElement(observationDetails_TextBox).sendKeys("Automation Test");
        driver.findElement(hasAction_Yes_Selection).click();
        driver.findElement(hasDiscussion_Yes_Selection).click();
        driver.findElement(submit_Button).click();
        driver.findElement(confirm_Button).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(observationList_Button).click();
    }



    //Assertion




}
