package Pages;

import Utilities.ElementActions;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor scroll;
    Actions actions;
    LocalDate today = LocalDate.now();
    String formattedDate = today.format(DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH));






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
    private final By confirmPositiveObservation_Button = By.xpath("//*[@id=\"igs-table-container\"]/div/table/tbody/tr[1]/td[13]/div/div/div[2]/div/div/button");
    private final By observationActionStated_Button = By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div[3]/div/ul/li[2]/a");
    private final By viewOptionsAction_Button = By.xpath("//*[@id=\"igs-table-container\"]/div/table/tbody/tr[1]/td[13]/div/div/div[2]/button");
    private final By close_Button = By.xpath("//button[@class=\"btn-close\"]");
    private final By linkUser_Button = By.xpath("//a[@class=\"nav-link dropdown-user-link\"]");
    private final By logOut_Button = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div/div[1]/nav/div/ul/li/div/a[2]");
    private final By submit_Button = By.xpath("//button[@class=\"swal2-confirm btn btn-outline-secondary btn-success\"]");
    private final By clarificationNeededFromCreator_Button = By.xpath("//*[@id=\"igs-table-container\"]/div/table/tbody/tr[1]/td[13]/div/div/div[2]/div/div/button[2]");
    private final By editOptionsAction_Button = By.xpath("//*[@id=\"igs-table-container\"]/div/table/tbody/tr[1]/td[13]/div/div/div[2]/button[2]");
    private final By closeAndNoActionRequired_Button = By.xpath("//*[@id=\"igs-table-container\"]/div/table/tbody/tr[1]/td[13]/div/div/div[2]/div/div/button[3]/div/span");
    private final By needCommitteFeedBack_Button = By.xpath("//*[@id=\"igs-table-container\"]/div/table/tbody/tr[1]/td[13]/div/div/div[2]/div/div/button[6]/div");
    private final By personCommitte_Selection = By.xpath("//input[@class=\"select__input\"]");
    private final By confirm_Button = By.xpath("//button[@class=\"swal2-confirm btn btn-outline-secondary btn-success\"]");
    private final By submitTypeSubmit_Button = By.xpath("//button[@type=\"submit\"]");
    private final By closedWithImmedidateAction_Button = By.xpath("//*[@id=\"igs-table-container\"]/div/table/tbody/tr[1]/td[13]/div/div/div[2]/div/div/button[4]/div/span");
    private final By addActionByHSEAction_Button  = By.xpath("//*[@id=\"igs-table-container\"]/div/table/tbody/tr[1]/td[13]/div/div/div[2]/div/div/button[5]/div/span");
    private final By action_TextBox = By.xpath("//textarea[@placeholder=\"Enter Action\"]");
    private final By ownerDEPT_Selection = By.xpath("/html/body/div[3]/div/div[1]/div/div/div[2]/div/form/div[1]/table/tbody/tr/td[3]/div/div/div[2]/div[1]/div[1]/div[2]/input");
    private final By rESPDeoartemnts_Selection = By.xpath("/html/body/div[3]/div/div[1]/div/div/div[2]/div/form/div[1]/table/tbody/tr/td[4]/div/div/div[2]/div[1]/div[1]/div[2]/input");
    private final By pirority_Selection = By.xpath("/html/body/div[3]/div/div[1]/div/div/div[2]/div/form/div[1]/table/tbody/tr/td[5]/div/div/div/div/div[1]/div[2]/input");
    private final By date_Input = By.xpath("//input[@name=\"actions.0.due_date\"]");
    private final By dateSelected_Selection = By.xpath("//span[@aria-label=\""+formattedDate+"\"]");
    private final By ownerDepartmentFeedBack_Button = By.xpath("//*[@id=\"igs-table-container\"]/div/table/tbody/tr[1]/td[13]/div/div/div[2]/div/div/button[7]/div/span");
    private final By ownerDeparment_Selection = By.xpath("/html/body/div[3]/div/div[1]/div/div/div[2]/div/form/div[1]/div[2]/div[1]/div[1]/div[2]/input");
    private final By noActionStated_Button = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div/div/div[2]/div[3]/div/ul/li[1]/a/div/div[2]");
    private final By audits_Section = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div/div/div[1]/div[5]/ul/li[4]/a");
    private final By addAuditRecored_Button = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div/div/div[2]/div[3]/div/div/div/div[1]/button[2]");
    private final By findings_Label = By.xpath("//*[@id=\"igs-table-container\"]/div/table/tbody/tr[1]/td[10]/div/span");
    private final By findingsView_Button = By.xpath("//*[@id=\"igs-table-container\"]/div/table/tbody/tr[1]/td[10]/div/span/div");
    private final By findingsFinding_Label = By.xpath("//*[@id=\"my-modal\"]/div/div[2]/div/div/div/div/div/span[1]");
    private final By findingsNoActionStated_Button = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div/div/div[2]/div[3]/div/ul/li[2]/a/div/div[2]");
//    private final By lastPage_Button = By.xpath("//*[@id='root']/div[1]/div[1]/div/div/div[1]/div[2]/div[3]/div/div/div/div/div[4]/div[3]/div/ul/li[last()-1]/a");
    private final By actionsAudit_Button = By.xpath("//*[@id=\"igs-table-container\"]/div/table/tbody/tr/td[10]/div/div/div[1]");
    private final By viewingAsHSERepFindings_Button = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div/div/div[2]/div[3]/div/div/div/div/div[1]/div/div/div/div/button[3]");
    private final By addHSEActionAudit_Button = By.xpath("//*[@id=\"igs-table-container\"]/div/table/tbody/tr[1]/td[10]/div/div/div[2]/div/button");
    private final By closeAndNoActionRequiredAudit_Button = By.xpath("//*[@id=\"igs-table-container\"]/div/table/tbody/tr[1]/td[10]/div/div/div[2]/div/div/button[1]/div/span");
    private final By findingActionStated_Button = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div/div/div[2]/div[3]/div/ul/li[3]");
    private final By viewOptionsActionAudit_Button = By.xpath("//*[@id=\"igs-table-container\"]/div/table/tbody/tr[1]/td[10]/div/div/div[2]/button");
    private final By statusAudit_Label = By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/table/tbody/tr[8]/td[2]/div/span/div/div/span");
    private final By closedWithImmedidateActionAudit_Button = By.xpath("//*[@id=\"igs-table-container\"]/div/table/tbody/tr[1]/td[10]/div/div/div[2]/div/div/button[2]/div/span");
    private final By immediateAction_TextBox = By.xpath("//input[@placeholder=\"Immediate Action\"]");
    private final By actionImmediatly_Button = By.xpath("//*[@id=\"igs-table-container\"]/div/table/tbody/tr[1]/td[10]/div/div/div[2]/div/div/button[3]/div/span");
    private final By enterActionImmediatly_TextBox = By.xpath("//textarea[@name=\"actions.0.action_details\"]");
    private final By responsibleDepartmentsAudit_Selection = By.xpath("//*[@id=\"react-select-11-input\"]");
    private final By pirorityAudit_Selection = By.xpath("//*[@id=\"react-select-9-input\"]");
    private final By neededCommitteFeedBackAuditAction_Button = By.xpath("//*[@id=\"igs-table-container\"]/div/table/tbody/tr[1]/td[10]/div/div/div[2]/div/div/button[4]/div/span");
    private final By findingsNoActionStatedstatus_Label = By.xpath("/html/body/div/div[1]/div[1]/div/div/div[1]/div[2]/div[3]/div/div/div/div/div[4]/div[2]/div/table/tbody/tr[last()]/td[9]/div/div[1]/span\n");

    private final By managementReviews_Section = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div/div/div[1]/div[5]/ul/li[5]/a/span");
    private final By meetingResult_Label = By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div[1]/div[2]/div[3]/div/div/div/div[2]/div[3]/div[2]/div/table/tbody/tr[1]/td[7]/div/div/span");
    private final By issuesNoActionStated_Button =  By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div/div/div[2]/div[3]/div/ul/li[2]/a/div/div[2]");
    private final By issuesStatus_Label = By.xpath("/html/body/div/div[1]/div[1]/div/div/div[1]/div[2]/div[3]/div/div/div/div/div[4]/div[2]/div/table/tbody/tr[1]/td[7]/div/span");
    private final By viewingAsOwnerRep_Button = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div/div/div[2]/div[3]/div/div/div/div/div[1]/div/div/div/div/button[5]");
    private final By viewingAsOwnerIssuesActionStated_Button = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div/div/div[2]/div[3]/div/div/div/div/div[1]/div/div/div/div/button[6]");
    private final By actionsManagementReview_Button = By.xpath("//*[@id=\"igs-table-container\"]/div/table/tbody/tr[1]/td[8]/div/div/div[1]");
    private final By addOwnerActionManagementReview_Button = By.xpath("//*[@id=\"igs-table-container\"]/div/table/tbody/tr[1]/td[8]/div/div/div[2]/div/button/span");
    private final By closeAndNoActionRequiredManagementReview_Button = By.xpath("//*[@id=\"igs-table-container\"]/div/table/tbody/tr[1]/td[8]/div/div/div[2]/div/div/button[1]/div/span");
    private final By issuesActionStated_Button = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div/div/div[2]/div[3]/div/ul/li[3]/a/div/div[2]");
    private final By closeWithImmediateActionManagementReview_Button = By.xpath("//*[@id=\"igs-table-container\"]/div/table/tbody/tr[1]/td[8]/div/div/div[2]/div/div/button[2]/div/span");
    private final By addActionImmediatlyManagementReview_Button = By.xpath("//*[@id=\"igs-table-container\"]/div/table/tbody/tr[1]/td[8]/div/div/div[2]/div/div/button[3]/div/span");
    private final By responsibleDepartmentsManagementReview_Selection = By.id("react-select-8-input");
    private final By pirorityManagementReview_Selection = By.id("react-select-6-input");
    private final By addNeedCommitteFeedBackActionManagementReview_Button = By.xpath("//*[@id=\"igs-table-container\"]/div/table/tbody/tr[1]/td[8]/div/div/div[2]/div/div/button[4]/div/span");


























    // Actions
    public void clickViewingDropDown()
    {
        actions.scrollByAmount(0,-200).perform();
        ElementActions.click(driver,viewing_dropDownList);
    }

    public void clickObservations()
    {
        ElementActions.click(driver,observations_Section);
    }
    public void addHSERepAction()
    {
        clickViewingDropDown();
        ElementActions.click(driver,viewingAsHSERepNoActionStated_Button);
        ElementActions.click(driver,actionsObservation_Button);
        ElementActions.click(driver,addHSEAction_Button);
    }
    public void addComfirmPostiveObservationAction()
    {
        ElementActions.click(driver,confirmPositiveObservation_Button);
        ElementActions.click(driver,submit_Button);
    }
    public void addClarificationNeededfromCreatorAction()
    {
        ElementActions.click(driver,clarificationNeededFromCreator_Button);
        ElementActions.click(driver,submit_Button);
    }

    public void logOut()
    {
        ElementActions.click(driver,linkUser_Button);
        ElementActions.click(driver,logOut_Button);
    }
    public void editObservationByCreator()
    {
        clickViewingDropDown();
        ElementActions.click(driver,viewingAsCreatorNoActionStated_button);
        ElementActions.click(driver,actionsObservation_Button);
        ElementActions.click(driver,editOptionsAction_Button);

    }
    public void addcloseAndNoActionRequiredAction()
    {
        ElementActions.click(driver,closeAndNoActionRequired_Button);
        ElementActions.click(driver,submit_Button);
    }
    public void addCommitteFeedBackAction()
    {
        ElementActions.click(driver,needCommitteFeedBack_Button);
        ElementActions.type(driver,personCommitte_Selection,"aaa");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.sendKeys(Keys.ENTER).perform();
        ElementActions.click(driver,submitTypeSubmit_Button);
        ElementActions.click(driver,confirm_Button);
    }
    public void addClosedWithImmediateAction()
    {
        ElementActions.click(driver,closedWithImmedidateAction_Button);
        ElementActions.click(driver,submit_Button);
    }
    public void addActionByHSEAction()
    {
        ElementActions.click(driver,addActionByHSEAction_Button);
        ElementActions.type(driver,action_TextBox,"Automation Testing");
        ElementActions.type(driver,ownerDEPT_Selection,"human");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.sendKeys(Keys.ENTER).perform();
        ElementActions.type(driver,rESPDeoartemnts_Selection,"human");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.sendKeys(Keys.ENTER).perform();
        ElementActions.type(driver,pirority_Selection,"high");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.sendKeys(Keys.ENTER).perform();
        ElementActions.click(driver,date_Input);
        ElementActions.click(driver,dateSelected_Selection);
        ElementActions.click(driver,submitTypeSubmit_Button);
        ElementActions.click(driver,confirm_Button);

    }
    public void addOwnerDepartmentFeedBackRequired()
    {
        ElementActions.click(driver,ownerDepartmentFeedBack_Button);
        ElementActions.type(driver,ownerDeparment_Selection,"human");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.sendKeys(Keys.ENTER).perform();
        ElementActions.click(driver,submitTypeSubmit_Button);
        ElementActions.click(driver,confirm_Button);
    }
    public void clickViewObservationInActionStated()
    {
        ElementActions.click(driver,actionsObservation_Button);
        ElementActions.click(driver,viewOptionsAction_Button);

    }

    public void clickEditObservationByHSE()
    {
        clickViewingDropDown();
        ElementActions.click(driver,viewingAsHSERepNoActionStated_Button);
        ElementActions.click(driver,actionsObservation_Button);
        ElementActions.click(driver,editOptionsAction_Button);

    }
    public void clickNoActionStatedButton()
    {
        ElementActions.click(driver,noActionStated_Button);

    }

    public void clickAudits()
    {
        ElementActions.click(driver,audits_Section);
    }
    public void clickAddAudits()
    {
        ElementActions.click(driver,addAuditRecored_Button);
    }
    public void clickFindingsNoActionStated()
    {
        actions.scrollByAmount(0, -300).perform();
        ElementActions.click(driver,findingsNoActionStated_Button);
    }
    public void addHSERepActionToAudit()
    {
        clickViewingDropDown();
        ElementActions.click(driver, viewingAsHSERepFindings_Button);
        ElementActions.click(driver,actionsAudit_Button);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ElementActions.click(driver,addHSEActionAudit_Button);
    }
    public void addcloseAndNoActionRequiredAction_Audit()
    {
        ElementActions.click(driver,closeAndNoActionRequiredAudit_Button);
        ElementActions.click(driver,submit_Button);
    }
    public void addClosedWithImmediateAction_Audit()
    {
        ElementActions.click(driver,closedWithImmedidateActionAudit_Button);
        ElementActions.type(driver,immediateAction_TextBox,"test");
        ElementActions.click(driver,submitTypeSubmit_Button);
        ElementActions.click(driver,confirm_Button);
    }
    public void addActionImmediatly_Audit()
    {
        ElementActions.click(driver,actionImmediatly_Button);
        ElementActions.type(driver,enterActionImmediatly_TextBox,"test");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(responsibleDepartmentsAudit_Selection).sendKeys("human");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.sendKeys(Keys.ENTER).perform();
        driver.findElement(pirorityAudit_Selection).sendKeys("high");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.sendKeys(Keys.ENTER).perform();
        ElementActions.click(driver,date_Input);
        ElementActions.click(driver,dateSelected_Selection);
        ElementActions.click(driver,submitTypeSubmit_Button);
        ElementActions.click(driver,confirm_Button);

    }
    public void addNeededCommitteFeedBackAction_Audit()
    {
        ElementActions.click(driver, neededCommitteFeedBackAuditAction_Button);
        ElementActions.click(driver, submitTypeSubmit_Button);
        ElementActions.click(driver, confirm_Button);
    }

    public void clickManagementReviews()
    {
        ElementActions.click(driver,managementReviews_Section);
    }

    public void addCloseAndNoActionRequired_ManagementReview()
    {
        ElementActions.click(driver,actionsManagementReview_Button);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ElementActions.click(driver,addOwnerActionManagementReview_Button);
        ElementActions.click(driver,closeAndNoActionRequiredManagementReview_Button);
        ElementActions.click(driver,confirm_Button);
    }

    public void addCloseWithImmediateAction_ManagementReview()
    {
        ElementActions.click(driver,actionsManagementReview_Button);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ElementActions.click(driver,addOwnerActionManagementReview_Button);
        ElementActions.click(driver,closeWithImmediateActionManagementReview_Button);
        ElementActions.type(driver,immediateAction_TextBox,"Test");
        ElementActions.click(driver,submitTypeSubmit_Button);
        ElementActions.click(driver,confirm_Button);
    }
    public void addActionImmediatly_ManagementReview()
    {
        ElementActions.click(driver,actionsManagementReview_Button);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ElementActions.click(driver,addOwnerActionManagementReview_Button);
        ElementActions.click(driver,addActionImmediatlyManagementReview_Button);
        ElementActions.type(driver,action_TextBox,"Test");
        ElementActions.type(driver, responsibleDepartmentsManagementReview_Selection,"HSE");
        actions.sendKeys(Keys.ENTER).perform();
        ElementActions.type(driver,pirorityManagementReview_Selection,"high");
        actions.sendKeys(Keys.ENTER).perform();
        ElementActions.click(driver,date_Input);
        ElementActions.click(driver,dateSelected_Selection);
        ElementActions.click(driver,submitTypeSubmit_Button);
        ElementActions.click(driver,confirm_Button);
    }

    public void addNeedCommitteFeedBackAction_ManagementReview()
    {
        ElementActions.click(driver,actionsManagementReview_Button);
        ElementActions.click(driver,addOwnerActionManagementReview_Button);
        ElementActions.click(driver,addNeedCommitteFeedBackActionManagementReview_Button);
        ElementActions.type(driver,personCommitte_Selection,"aaa");
        actions.sendKeys(Keys.ENTER).perform();
        ElementActions.click(driver,submitTypeSubmit_Button);
        ElementActions.click(driver,confirm_Button);
    }

















    //Assertion
    public void validatePositiveObservationCreated()
    {
        clickViewingDropDown();
        ElementActions.click(driver,viewingAsCreatorNoActionStated_button);
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


        ElementActions.click(driver,observationActionStated_Button);
        clickViewingDropDown();
        ElementActions.click(driver,viewingAsHSERepActionStated_Button);
        ElementActions.click(driver,actionsObservation_Button);
        ElementActions.click(driver,viewOptionsAction_Button);
        Assert.assertEquals("Positive Observation", driver.findElement(viewingObservationStatus_Label).getText());
        ElementActions.click(driver, close_Button);
    }
    public void validateCreatorCanViewPositiveObservationInActionStated()
    {
        clickViewingDropDown();
        ElementActions.click(driver,viewinAsCreatorActionStated_Button);
        ElementActions.click(driver,actionsObservation_Button);
        ElementActions.click(driver,viewOptionsAction_Button);
        Assert.assertEquals("Positive Observation", driver.findElement(viewingObservationStatus_Label).getText());
        ElementActions.click(driver, close_Button);
    }
    public void validateUnSafeObservationCreatedOrUpdated()
    {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        clickViewingDropDown();
        ElementActions.click(driver,viewingAsHSERepNoActionStated_Button);
        Assert.assertEquals("Draft", driver.findElement(observationStatus_Label).getText());
    }
    public void validateObservationStatusClarificationNeeded()
    {
        try {
            Thread.sleep(2000);
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

        ElementActions.click(driver,observationActionStated_Button);
        clickViewingDropDown();
        ElementActions.click(driver,viewingAsHSERepActionStated_Button);
        ElementActions.click(driver,actionsObservation_Button);
        ElementActions.click(driver,viewOptionsAction_Button);
        Assert.assertEquals("No Action Required", driver.findElement(viewingObservationStatus_Label).getText());
        ElementActions.click(driver, close_Button);
    }
    public void validateCreatorCanViewNoActionRequiredObservationInActionStated()
    {
        clickViewingDropDown();
        ElementActions.click(driver,viewinAsCreatorActionStated_Button);
        ElementActions.click(driver,actionsObservation_Button);
        ElementActions.click(driver,viewOptionsAction_Button);
        Assert.assertEquals("No Action Required", driver.findElement(viewingObservationStatus_Label).getText());
        ElementActions.click(driver, close_Button);
    }

    public void validateObservationStatusNeedCommitteFeedBack()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals("Need Committee Feedback", driver.findElement(observationStatus_Label).getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void validateClosedWithImmediateActionMovetoActionStated()
    {
        actions.scrollByAmount(0, -200).perform();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.scrollByAmount(0, -200).perform();

        ElementActions.click(driver,observationActionStated_Button);
        clickViewingDropDown();
        ElementActions.click(driver,viewingAsHSERepActionStated_Button);
        ElementActions.click(driver,actionsObservation_Button);
        ElementActions.click(driver,viewOptionsAction_Button);
        Assert.assertEquals("Closed With Immediate Action", driver.findElement(viewingObservationStatus_Label).getText());
        driver.findElement(close_Button).click();
    }

    public void validateCreatorCanViewClosedWithImmediateActionInActionStated()
    {
        clickViewingDropDown();
        ElementActions.click(driver,viewinAsCreatorActionStated_Button);
        ElementActions.click(driver,actionsObservation_Button);
        ElementActions.click(driver,viewOptionsAction_Button);
        Assert.assertEquals("Closed With Immediate Action", driver.findElement(viewingObservationStatus_Label).getText());
        ElementActions.click(driver, close_Button);
    }
    public void validateActionInProgressMovetoActionStated()
    {
        actions.scrollByAmount(0, -300).perform();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.scrollByAmount(0, -300).perform();

        ElementActions.click(driver,observationActionStated_Button);
        clickViewingDropDown();
        ElementActions.click(driver,viewingAsHSERepActionStated_Button);
        ElementActions.click(driver,actionsObservation_Button);
        ElementActions.click(driver,viewOptionsAction_Button);
        Assert.assertEquals("Action In Progress", driver.findElement(viewingObservationStatus_Label).getText());
        ElementActions.click(driver, close_Button);
    }
    public void validateCreatorCanViewActionInProgressInActionStated()
    {
        clickViewingDropDown();
        ElementActions.click(driver,viewinAsCreatorActionStated_Button);
        ElementActions.click(driver,actionsObservation_Button);
        ElementActions.click(driver,viewOptionsAction_Button);
        Assert.assertEquals("Action In Progress", driver.findElement(viewingObservationStatus_Label).getText());
        ElementActions.click(driver, close_Button);
    }
    public void validateObservationStatusIsOwnerDeptFeedbackRequired()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals("Owner Dept. Feedback Required", driver.findElement(observationStatus_Label).getText());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public void validateHSECanViewNoActionRequiredObservationInActionStated()
    {
        clickViewingDropDown();
        ElementActions.click(driver,viewingAsHSERepActionStated_Button);
        ElementActions.click(driver,actionsObservation_Button);
        ElementActions.click(driver,viewOptionsAction_Button);
        Assert.assertEquals("No Action Required", driver.findElement(viewingObservationStatus_Label).getText());
        ElementActions.click(driver, close_Button);
    }
    public void validateNoFindingAuditCreated()
    {
        Assert.assertEquals(driver.findElement(findings_Label).getText(),"No Findings.");

    }
    public void validatefindingsAuditCreated()
    {
        ElementActions.click(driver,findingsView_Button);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals(driver.findElement(findingsFinding_Label).getText(),"Finding: Test");
        ElementActions.click(driver, close_Button);
    }

    public void validateNoActionRequiredAuditMoveToActionStated()
    {
        actions.scrollByAmount(0, -200).perform();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.scrollByAmount(0, -200).perform();

        ElementActions.click(driver,findingActionStated_Button);
        clickViewingDropDown();
        ElementActions.click(driver,viewingAsHSERepFindings_Button);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ElementActions.click(driver, actionsAudit_Button);
        ElementActions.click(driver,viewOptionsActionAudit_Button);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals("No Action Required", driver.findElement(statusAudit_Label).getText());
        ElementActions.click(driver, close_Button);
    }
    public void validateClosedWithImmediateActionAuditMovetoActionStated()
    {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.scrollByAmount(0, -200).perform();

        ElementActions.click(driver,findingActionStated_Button);
        clickViewingDropDown();
        ElementActions.click(driver,viewingAsHSERepFindings_Button);
//        ElementActions.click(driver,lastPage_Button);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ElementActions.click(driver, actionsAudit_Button);
        ElementActions.click(driver,viewOptionsActionAudit_Button);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals("Closed With Immediate Action", driver.findElement(statusAudit_Label).getText());
        driver.findElement(close_Button).click();
    }
    public void validateActionInProgressAuditMovetoActionStated()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.scrollByAmount(0, -300).perform();

        ElementActions.click(driver,findingActionStated_Button);
        clickViewingDropDown();
        ElementActions.click(driver,viewingAsHSERepFindings_Button);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ElementActions.click(driver, actionsAudit_Button);
        ElementActions.click(driver,viewOptionsActionAudit_Button);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals("Action In Progress", driver.findElement(statusAudit_Label).getText());
        ElementActions.click(driver, close_Button);
    }

    public void validateFindingsStatusNeededCommitteeFeedBack()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals(driver.findElement(findingsNoActionStatedstatus_Label).getText(),"Need Committee Feedback");

    }

    public void validateNoActionMeetingReviewCreated()
    {
        Assert.assertEquals(driver.findElement(meetingResult_Label).getText(),"No Actions Required");
    }

    public void validateIssuesAndSuggestionsMeetigReviewCreated()
    {
        Assert.assertEquals(driver.findElement(meetingResult_Label).getText(),"Issues & Suggestions");
    }

    public void validateIssuesStatusInIssuesNoActionStated()
    {
        ElementActions.click(driver,issuesNoActionStated_Button);
        clickViewingDropDown();
        ElementActions.click(driver, viewingAsOwnerRep_Button);
        Assert.assertEquals(driver.findElement(issuesStatus_Label).getText(),"Draft");


    }
    public void validateNoActionRquiredMoveToIssuesActionStated()
    {
        ElementActions.click(driver,issuesActionStated_Button);
        clickViewingDropDown();
        ElementActions.click(driver, viewingAsOwnerIssuesActionStated_Button);
        Assert.assertEquals(driver.findElement(issuesStatus_Label).getText(),"No Action Required");
    }

    public void validateCloseWithImmediateMoveToIssuesActionStated()
    {
        ElementActions.click(driver,issuesActionStated_Button);
        clickViewingDropDown();
        ElementActions.click(driver, viewingAsOwnerIssuesActionStated_Button);
        Assert.assertEquals(driver.findElement(issuesStatus_Label).getText(),"Closed With Immediate Action");
    }

    public void validateActionInProgressMoveToIssuesActionStated()
    {
        ElementActions.click(driver,issuesActionStated_Button);
        clickViewingDropDown();
        ElementActions.click(driver, viewingAsOwnerIssuesActionStated_Button);
        Assert.assertEquals(driver.findElement(issuesStatus_Label).getText(),"Action In Progress");
    }
    public void validateNeededCommitteFeedBackCreated()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals(driver.findElement(issuesStatus_Label).getText(),"Need Committee Feedback");
    }



}


