package Pages;

import Utilities.ElementActions;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

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
    private final By observationType_Label = By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[1]/div[2]/div[3]/div/div/div/div[2]/div[4]/div[2]/div/table/tbody/tr[1]/td[6]/div/span");
    private final By editObservationTitle_Label = By.xpath("//*[@id=\"my-modal\"]/div/div[2]/div/table/tbody/tr[2]/td[2]/div");
    private final By closeSaftyObservation_Button = By.xpath("//button[@class=\"btn-close\"]");




    // Actions

    public void clickAddObservations() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.scrollByAmount(0, -300).perform();
        ElementActions.click(driver,addObservations_Button);
//        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(addObservations_Button))).click();
    }

    public void createObservation()
    {
        ElementActions.click(driver,date_Input);
//        driver.findElement(date_Input).click();
        ElementActions.click(driver,dateSelected_Selection);
//        driver.findElement(dateSelected_Selection).click();
        ElementActions.type(driver,observationDuration_TextBox,"5");
//        driver.findElement(observationDuration_TextBox).sendKeys("5");
        ElementActions.type(driver,shift_Selection,"night");
//        driver.findElement(shift_Selection).sendKeys("night");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.sendKeys(Keys.ENTER).perform();
        ElementActions.click(driver,time_Selection);
//        driver.findElement(time_Selection).click();
        ElementActions.type(driver,branch_Selection,"Cairo branch");
//        driver.findElement(branch_Selection).sendKeys("Cairo branch");
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
        ElementActions.type(driver,mainArea_Selection,"main");
//        driver.findElement(mainArea_Selection).sendKeys("main");
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
        ElementActions.type(driver,subArea_Selection,"sub");
//        driver.findElement(subArea_Selection).sendKeys("sub");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.sendKeys(Keys.ENTER).perform();

    }
    public void creatPositiveObservation()
    {
        ElementActions.click(driver,positiveObservation_Selection);
//        driver.findElement(positiveObservation_Selection).click();
        ElementActions.type(driver,observationTitle_TextBox,"AutomationTest");
//        driver.findElement(observationTitle_TextBox).sendKeys("AutomationTest");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ElementActions.type(driver,observationDetails_TextBox,"AutomationTest");
//        driver.findElement(observationDetails_TextBox).sendKeys("AutomationTest");
        ElementActions.click(driver,hasAction_Yes_Selection);
//        driver.findElement(hasAction_Yes_Selection).click();
        ElementActions.click(driver,hasDiscussion_Yes_Selection);
//        driver.findElement(hasDiscussion_Yes_Selection).click();
        ElementActions.click(driver,submit_Button);
//        driver.findElement(submit_Button).click();
        ElementActions.click(driver,confirm_Button);
//        driver.findElement(confirm_Button).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ElementActions.click(driver,observationList_Button);
//        driver.findElement(observationList_Button).click();
    }

    public void creatUnsafeActObservation()
    {
        ElementActions.click(driver,unSafeActObservation_Selection);
//        driver.findElement(unSafeActObservation_Selection).click();
        ElementActions.type(driver,observationTitle_TextBox,"Automation Test");
//        driver.findElement(observationTitle_TextBox).sendKeys("Automation Test");
        ElementActions.click(driver,unSafeOptions_Selection);
//        driver.findElement(unSafeOptions_Selection).click();
        ElementActions.type(driver,observationDetails_TextBox,"Automation Test");
//        driver.findElement(observationDetails_TextBox).sendKeys("Automation Test");
        ElementActions.click(driver,hasAction_Yes_Selection);
//        driver.findElement(hasAction_Yes_Selection).click();
        ElementActions.click(driver,hasDiscussion_Yes_Selection);
//        driver.findElement(hasDiscussion_Yes_Selection).click();
        ElementActions.click(driver,submit_Button);
//        driver.findElement(submit_Button).click();
        ElementActions.click(driver,confirm_Button);
//        driver.findElement(confirm_Button).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ElementActions.click(driver,observationList_Button);
//        wait.until(ExpectedConditions.elementToBeClickable(observationList_Button)).click();
    }
    public void makeClarificationCreator()
    {
        ElementActions.type(driver,editObservationDetails_TextBox,"clarification");
//        driver.findElement(editObservationDetails_TextBox).sendKeys("clarification");
        ElementActions.click(driver,submit_Button);
//        driver.findElement(submit_Button).click();
        ElementActions.click(driver,confirm_Button);
//        driver.findElement(update_Button).click();
    }

    public void creatUnsafeConditionObservation()
    {
        ElementActions.click(driver,unSafeConditionObservation_Selection);
//        driver.findElement(unSafeConditionObservation_Selection).click();
        ElementActions.type(driver,observationTitle_TextBox,"Automation Test");
//        driver.findElement(observationTitle_TextBox).sendKeys("Automation Test");
        ElementActions.click(driver,unSafeOptions_Selection);
//        driver.findElement(unSafeOptions_Selection).click();
        ElementActions.type(driver,observationDetails_TextBox,"Automation Test");
//        driver.findElement(observationDetails_TextBox).sendKeys("Automation Test");
        ElementActions.click(driver,hasAction_Yes_Selection);
//        driver.findElement(hasAction_Yes_Selection).click();
        ElementActions.click(driver,hasDiscussion_Yes_Selection);
//        driver.findElement(hasDiscussion_Yes_Selection).click();
        ElementActions.click(driver,submit_Button);
//        driver.findElement(submit_Button).click();
        ElementActions.click(driver,confirm_Button);
//        driver.findElement(confirm_Button).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ElementActions.click(driver,observationList_Button);
//        wait.until(ExpectedConditions.elementToBeClickable(observationList_Button)).click();
    }

    public void editByCreatorInObservationPage()
    {
        ElementActions.type(driver,observationTitle_TextBox,"edit by creator");
//        driver.findElement(observationTitle_TextBox).sendKeys("edit by creator");
        ElementActions.click(driver,submit_Button);
//        driver.findElement(submit_Button).click();
        ElementActions.click(driver,confirm_Button);
//        driver.findElement(update_Button).click();
    }
    public void editObservationByHSE()
    {
        ElementActions.type(driver,observationTitle_TextBox," edit by HSE");
//        driver.findElement(observationTitle_TextBox).clear();
//        driver.findElement(observationTitle_TextBox).sendKeys(" edit by HSE");
        ElementActions.click(driver,submit_Button);
//        driver.findElement(submit_Button).click();
        ElementActions.click(driver,confirm_Button);
//        driver.findElement(update_Button).click();
    }


    //Assertion
    public void validateCreatorCanViewObservationInNoActionStatedAndValidateItAlreadyModified()
    {

        Assert.assertEquals(driver.findElement(observationType_Label).getText(),"Unsafe Act");
        wait.until(ExpectedConditions.visibilityOfElementLocated(editObservationTitle_Label));
        Assert.assertEquals(driver.findElement(editObservationTitle_Label).getText(),"Automation Testedit by creator");
        driver.findElement(closeSaftyObservation_Button).click();

    }

    public void validateHSECanViewObservationInNoActionStatedAndValidateItAlreadyModified()
    {

        Assert.assertEquals(driver.findElement(observationType_Label).getText(),"Unsafe Act");
        wait.until(ExpectedConditions.visibilityOfElementLocated(editObservationTitle_Label));
        Assert.assertEquals(driver.findElement(editObservationTitle_Label).getText(),"Automation Testedit by creator edit by HSE");
        driver.findElement(closeSaftyObservation_Button).click();

    }




}
