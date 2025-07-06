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

public class Observations_AuditsRecord_ManagementReview_Page {

    WebDriver driver;
    WebDriverWait wait;
    LocalDate today = LocalDate.now();
    String formattedDate = today.format(DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH));
    Actions actions;



    public Observations_AuditsRecord_ManagementReview_Page(WebDriver driver) {
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
    private final By externalAudit_Selection = By.xpath("//input[@value=\"external\"]");
    private final By selectAuditor_Selection =By.id("react-select-6-input");
    private final By selectAuditType_Selection = By.id("react-select-7-input");
    private final By auditDetails_TextBox = By.xpath("//*[@id=\"rc-dyn-tabs-p-1\"]/form/div[3]/div[3]/div/div/div[2]/div[1]/p");
    private final By noFindings_Selection = By.xpath("//input[@value=\"no\"]");
    private final By submitTypeSubmit_Button = By.xpath("//button[@type=\"submit\"]");
    private final By auditRecordsList_Button = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div/div/div[2]/div[3]/div/div/div/div[1]/button[1]/span[2]");
    private final By findings_Selection = By.xpath("//input[@value=\"yes\"]");
    private final By findings_TextBox = By.id("findings.0.finding");
    private final By ownerDepartment_TextBox = By.id("react-select-8-input");
    private final By suggestion_Textbox = By.id("findings.0.suggestion");
    private final By internalAudit_Selection = By.xpath("//input[@value=\"internal\"]");

    private final By addManagementReview_Button = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div/div/div[2]/div[3]/div/div/div/div[1]/button[2]");
    private final By minutesOfMeeting_TextBox = By.xpath("//*[@id=\"rc-dyn-tabs-p-1\"]/form/div[3]/div/div/div[2]/div[1]/p");
    private final By noActionRequired_Selection = By.xpath("//input[@value=\"no_actions_required\"]");
    private final By managementReviewList_Button = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div/div/div[2]/div[3]/div/div/div/div[1]/button[1]/span[2]");
    private final By issuesAndSuggestions_Selection = By.xpath("//input[@value=\"issues_suggested\"]");
    private final By issses_TextBox = By.id("issues.0.issue");
    private final By ownerDepartmentManagement_TextBox = By.id("react-select-5-input");
    private final By issuesSuggestion_TextBox = By.id("issues.0.suggestion");






    // Actions

    public void clickAddObservations() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.scrollByAmount(0, -300).perform();
        ElementActions.click(driver,addObservations_Button);
    }

    public void create_Observation_Audit()
    {
        ElementActions.click(driver,date_Input);
        ElementActions.click(driver,dateSelected_Selection);
        ElementActions.type(driver,observationDuration_TextBox,"5");
        ElementActions.type(driver,shift_Selection,"night");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.sendKeys(Keys.ENTER).perform();
        ElementActions.click(driver,time_Selection);
        ElementActions.type(driver,branch_Selection,"Automation Test");
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
        ElementActions.type(driver,mainArea_Selection,"Automation Test");
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
        ElementActions.type(driver,subArea_Selection,"Automation Test");
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
        ElementActions.type(driver,observationTitle_TextBox,"AutomationTest");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ElementActions.type(driver,observationDetails_TextBox,"AutomationTest");
        ElementActions.click(driver,hasAction_Yes_Selection);
        ElementActions.click(driver,hasDiscussion_Yes_Selection);
        ElementActions.click(driver,submit_Button);
        ElementActions.click(driver,confirm_Button);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ElementActions.click(driver,observationList_Button);
    }

    public void creatUnsafeActObservation()
    {
        ElementActions.click(driver,unSafeActObservation_Selection);
        ElementActions.type(driver,observationTitle_TextBox,"Automation Test");
        ElementActions.click(driver,unSafeOptions_Selection);
        ElementActions.type(driver,observationDetails_TextBox,"Automation Test");
        ElementActions.click(driver,hasAction_Yes_Selection);
        ElementActions.click(driver,hasDiscussion_Yes_Selection);
        ElementActions.click(driver,submit_Button);
        ElementActions.click(driver,confirm_Button);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ElementActions.click(driver,observationList_Button);
    }
    public void makeClarificationCreator()
    {
        ElementActions.type(driver,editObservationDetails_TextBox,"clarification");
        ElementActions.click(driver,submit_Button);
        ElementActions.click(driver,confirm_Button);
    }

    public void creatUnsafeConditionObservation()
    {
        ElementActions.click(driver,unSafeConditionObservation_Selection);
        ElementActions.type(driver,observationTitle_TextBox,"Automation Test");
        ElementActions.click(driver,unSafeOptions_Selection);
        ElementActions.type(driver,observationDetails_TextBox,"Automation Test");
        ElementActions.click(driver,hasAction_Yes_Selection);
        ElementActions.click(driver,hasDiscussion_Yes_Selection);
        ElementActions.click(driver,submit_Button);
        ElementActions.click(driver,confirm_Button);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ElementActions.click(driver,observationList_Button);
    }

    public void editByCreatorInObservationPage()
    {
        ElementActions.type(driver,observationTitle_TextBox,"edit by creator");
        ElementActions.click(driver,submit_Button);
        ElementActions.click(driver,confirm_Button);
    }
    public void editObservationByHSE()
    {
        ElementActions.type(driver,observationTitle_TextBox," edit by HSE");
        ElementActions.click(driver,submit_Button);
        ElementActions.click(driver,confirm_Button);
    }

    public void creatExternalAudit()
    {
        ElementActions.click(driver,externalAudit_Selection);
//        ElementActions.type(driver,selectAuditor_Selection,"ِAutomation Test");
        ElementActions.click(driver,selectAuditor_Selection);
        actions.sendKeys(Keys.ENTER).perform();
        ElementActions.type(driver,selectAuditType_Selection,"Automation Test");
        actions.sendKeys(Keys.ENTER).perform();
        ElementActions.type(driver,auditDetails_TextBox,"Automation Test");

    }
    public void selectNoFindings()
    {
        ElementActions.click(driver,noFindings_Selection);
        ElementActions.click(driver,submitTypeSubmit_Button);
        ElementActions.click(driver,confirm_Button);
        ElementActions.click(driver,auditRecordsList_Button);
    }
    public void selectFindingsDeteced()
    {
        ElementActions.click(driver,findings_Selection);
        ElementActions.type(driver,findings_TextBox,"Test");
        ElementActions.type(driver,ownerDepartment_TextBox,"human");
        actions.sendKeys(Keys.ENTER).perform();
        ElementActions.type(driver,suggestion_Textbox,"Test");
        ElementActions.click(driver,submitTypeSubmit_Button);
        ElementActions.click(driver,confirm_Button);
        ElementActions.click(driver,auditRecordsList_Button);

    }
    public void creatInternalAudit()
    {
        ElementActions.click(driver,internalAudit_Selection);
        ElementActions.type(driver,selectAuditor_Selection,"ali");
        actions.sendKeys(Keys.ENTER).perform();
        ElementActions.type(driver,selectAuditType_Selection,"rrr");
        actions.sendKeys(Keys.ENTER).perform();
        ElementActions.type(driver,auditDetails_TextBox,"Automation Test");

    }

    public void creatManagementReview()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ElementActions.click(driver,addManagementReview_Button);

        ElementActions.click(driver,date_Input);
        ElementActions.click(driver,dateSelected_Selection);
        ElementActions.type(driver,observationDuration_TextBox,"5");
        ElementActions.type(driver,shift_Selection,"night");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.sendKeys(Keys.ENTER).perform();
        ElementActions.click(driver,time_Selection);
        ElementActions.type(driver,branch_Selection,"Automation Test");
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
        ElementActions.type(driver,mainArea_Selection,"Automation Test");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.sendKeys(Keys.ENTER).perform();

        ElementActions.type(driver,minutesOfMeeting_TextBox,"Test");
    }
    public void selectNoActionRequired()
    {
        ElementActions.click(driver,noActionRequired_Selection);
        ElementActions.click(driver,submitTypeSubmit_Button);
        ElementActions.click(driver,confirm_Button);
        actions.scrollByAmount(0, -500).perform();
        ElementActions.click(driver,managementReviewList_Button);

    }
    public void selectIssuesAndSuggestions()
    {
        ElementActions.click(driver,issuesAndSuggestions_Selection);
        ElementActions.type(driver,issses_TextBox,"Test");
        ElementActions.type(driver,ownerDepartmentManagement_TextBox,"HSE");
        actions.sendKeys(Keys.ENTER).perform();
        ElementActions.type(driver,issuesSuggestion_TextBox,"Test");
        ElementActions.click(driver,submitTypeSubmit_Button);
        ElementActions.click(driver,confirm_Button);
        actions.scrollByAmount(0, -500).perform();
        ElementActions.click(driver,managementReviewList_Button);
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
