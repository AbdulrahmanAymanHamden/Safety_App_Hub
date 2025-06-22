package Pages;

import Utilities.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
    private final By closeObservation_Button = By.xpath("//button[@class=\"btn-close\"]");
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
    private final By action_TextBox = By.xpath("//*[@id=\"tbody-pixel\"]/tr/td[2]/div/div/div/textarea");
    private final By ownerDEPT_Selection = By.xpath("/html/body/div[3]/div/div[1]/div/div/div[2]/div/form/div[1]/table/tbody/tr/td[3]/div/div/div[2]/div[1]/div[1]/div[2]/input");
    private final By rESPDeoartemnts_Selection = By.xpath("/html/body/div[3]/div/div[1]/div/div/div[2]/div/form/div[1]/table/tbody/tr/td[4]/div/div/div[2]/div[1]/div[1]/div[2]/input");
    private final By pirority_Selection = By.xpath("/html/body/div[3]/div/div[1]/div/div/div[2]/div/form/div[1]/table/tbody/tr/td[5]/div/div/div/div/div[1]/div[2]/input");
    private final By date_Input = By.xpath("//input[@name=\"actions.0.due_date\"]");
    private final By dateSelected_Selection = By.xpath("//span[@aria-label=\""+formattedDate+"\"]");
    private final By ownerDepartmentFeedBack_Button = By.xpath("//*[@id=\"igs-table-container\"]/div/table/tbody/tr[1]/td[13]/div/div/div[2]/div/div/button[7]/div/span");
    private final By ownerDeparment_Selection = By.xpath("/html/body/div[3]/div/div[1]/div/div/div[2]/div/form/div[1]/div[2]/div[1]/div[1]/div[2]/input");
    private final By noActionStated_Button = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/div/div/div[2]/div[3]/div/ul/li[1]/a/div/div[2]");















    // Actions
    public void clickViewingDropDown()
    {
        ElementActions.click(driver,viewing_dropDownList);
//        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(viewing_dropDownList))).click();
    }

    public void clickObservations()
    {
        ElementActions.click(driver,observations_Section);
//        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(observations_Section))).click();
    }
    public void addHSERepAction()
    {
        clickViewingDropDown();
        ElementActions.click(driver,viewingAsHSERepNoActionStated_Button);
//        driver.findElement(viewingAsHSERepNoActionStated_Button).click();
        ElementActions.click(driver,actionsObservation_Button);
//        driver.findElement(actionsObservation_Button).click();
        ElementActions.click(driver,addHSEAction_Button);
//        driver.findElement(addHSEAction_Button).click();
    }
    public void addComfirmPostiveObservationAction()
    {
        ElementActions.click(driver,confirmPositiveObservation_Button);
//        driver.findElement(confirmPositiveObservation_Button).click();
        ElementActions.click(driver,submit_Button);
//        driver.findElement(submit_Button).click();
    }
    public void addClarificationNeededfromCreatorAction()
    {
        ElementActions.click(driver,clarificationNeededFromCreator_Button);
//        driver.findElement(clarificationNeededFromCreator_Button).click();
        ElementActions.click(driver,submit_Button);
//        driver.findElement(submit_Button).click();
    }

    public void logOut()
    {
        ElementActions.click(driver,linkUser_Button);
//        driver.findElement(linkUser_Button).click();
        ElementActions.click(driver,logOut_Button);
//        driver.findElement(logOut_Button).click();
    }
    public void editObservationByCreator()
    {
        clickViewingDropDown();
        ElementActions.click(driver,viewingAsCreatorNoActionStated_button);
//        driver.findElement(viewingAsCreatorNoActionStated_button).click();
        ElementActions.click(driver,actionsObservation_Button);
//        driver.findElement(actionsObservation_Button).click();
        ElementActions.click(driver,editOptionsAction_Button);
//        driver.findElement(editOptionsAction_Button).click();

    }
    public void addcloseAndNoActionRequiredAction()
    {
        ElementActions.click(driver,closeAndNoActionRequired_Button);
//        driver.findElement(closeAndNoActionRequired_Button).click();
        ElementActions.click(driver,submit_Button);
//        driver.findElement(submit_Button).click();
    }
    public void addCommitteFeedBackAction()
    {
        ElementActions.click(driver,needCommitteFeedBack_Button);
//        driver.findElement(needCommitteFeedBack_Button).click();
        ElementActions.type(driver,personCommitte_Selection,"aaa");

//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.findElement(personCommitte_Selection).sendKeys("aaa");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.sendKeys(Keys.ENTER).perform();
        ElementActions.click(driver,submitTypeSubmit_Button);
//        driver.findElement(submitTypeSubmit_Button).click();
        ElementActions.click(driver,confirm_Button);
//        driver.findElement(confirm_Button).click();
    }
    public void addClosedWithImmediateAction()
    {
        ElementActions.click(driver,closedWithImmedidateAction_Button);
//        driver.findElement(closedWithImmedidateAction_Button).click();
        ElementActions.click(driver,submit_Button);
//        driver.findElement(submit_Button).click();
    }
    public void addActionByHSEAction()
    {
        ElementActions.click(driver,addActionByHSEAction_Button);
//        driver.findElement(addActionByHSEAction_Button).click();
        ElementActions.type(driver,action_TextBox,"Automation Testing");
//        driver.findElement(action_TextBox).sendKeys("Automation Testing");
        ElementActions.type(driver,ownerDEPT_Selection,"human");
//        driver.findElement(ownerDEPT_Selection).sendKeys("human");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.sendKeys(Keys.ENTER).perform();
        ElementActions.type(driver,rESPDeoartemnts_Selection,"human");
//        driver.findElement(rESPDeoartemnts_Selection).sendKeys("human");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.sendKeys(Keys.ENTER).perform();
        ElementActions.type(driver,pirority_Selection,"high");
//        driver.findElement(pirority_Selection).sendKeys("high");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.sendKeys(Keys.ENTER).perform();
        ElementActions.click(driver,date_Input);
//        driver.findElement(date_Input).click();
        ElementActions.click(driver,dateSelected_Selection);
//        driver.findElement(dateSelected_Selection).click();
        ElementActions.click(driver,submitTypeSubmit_Button);
//        driver.findElement(submitTypeSubmit_Button).click();
        ElementActions.click(driver,confirm_Button);
//        driver.findElement(confirm_Button).click();

    }
    public void addOwnerDepartmentFeedBackRequired()
    {
        ElementActions.click(driver,ownerDepartmentFeedBack_Button);
//        driver.findElement(ownerDepartmentFeedBack_Button).click();
        ElementActions.type(driver,ownerDeparment_Selection,"human");
//        driver.findElement(ownerDeparment_Selection).sendKeys("human");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.sendKeys(Keys.ENTER).perform();
        ElementActions.click(driver,submitTypeSubmit_Button);
//        driver.findElement(submitTypeSubmit_Button).click();
        ElementActions.click(driver,confirm_Button);
//        driver.findElement(confirm_Button).click();
    }
    public void clickViewObservationInActionStated()
    {
        ElementActions.click(driver,actionsObservation_Button);
//        driver.findElement(actionsObservation_Button).click();
        ElementActions.click(driver,viewOptionsAction_Button);
//        driver.findElement(viewOptionsAction_Button).click();

    }

    public void clickEditObservationByHSE()
    {
        clickViewingDropDown();
        ElementActions.click(driver,viewingAsHSERepNoActionStated_Button);
//        driver.findElement(viewingAsHSERepNoActionStated_Button).click();
        ElementActions.click(driver,actionsObservation_Button);
//        driver.findElement(actionsObservation_Button).click();
        ElementActions.click(driver,editOptionsAction_Button);
//        driver.findElement(editOptionsAction_Button).click();

    }
    public void clickNoActionStatedButton()
    {
        ElementActions.click(driver,noActionStated_Button);
//        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(noActionStated_Button))).click();

    }














    //Assertion
    public void validatePositiveObservationCreated()
    {
        clickViewingDropDown();
        ElementActions.click(driver,viewingAsCreatorNoActionStated_button);
//        driver.findElement(viewingAsCreatorNoActionStated_button).click();
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
//        driver.findElement(observationActionStated_Button).click();
        clickViewingDropDown();
        ElementActions.click(driver,viewingAsHSERepActionStated_Button);
//        driver.findElement(viewingAsHSERepActionStated_Button).click();
        ElementActions.click(driver,actionsObservation_Button);
//        driver.findElement(actionsObservation_Button).click();
        ElementActions.click(driver,viewOptionsAction_Button);
//        driver.findElement(viewOptionsAction_Button).click();
        Assert.assertEquals("Positive Observation", driver.findElement(viewingObservationStatus_Label).getText());
        ElementActions.click(driver,closeObservation_Button);
//        driver.findElement(closeObservation_Button).click();
    }
    public void validateCreatorCanViewPositiveObservationInActionStated()
    {
        clickViewingDropDown();
        ElementActions.click(driver,viewinAsCreatorActionStated_Button);
//        driver.findElement(viewinAsCreatorActionStated_Button).click();
        ElementActions.click(driver,actionsObservation_Button);
//        driver.findElement(actionsObservation_Button).click();
        ElementActions.click(driver,viewOptionsAction_Button);
//        driver.findElement(viewOptionsAction_Button).click();
        Assert.assertEquals("Positive Observation", driver.findElement(viewingObservationStatus_Label).getText());
        ElementActions.click(driver,closeObservation_Button);
//        driver.findElement(closeObservation_Button).click();
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
//        driver.findElement(viewingAsHSERepNoActionStated_Button).click();
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
//        driver.findElement(observationActionStated_Button).click();
        clickViewingDropDown();
        ElementActions.click(driver,viewingAsHSERepActionStated_Button);
//        driver.findElement(viewingAsHSERepActionStated_Button).click();
        ElementActions.click(driver,actionsObservation_Button);
//        driver.findElement(actionsObservation_Button).click();
        ElementActions.click(driver,viewOptionsAction_Button);
//        driver.findElement(viewOptionsAction_Button).click();
        Assert.assertEquals("No Action Required", driver.findElement(viewingObservationStatus_Label).getText());
        ElementActions.click(driver,closeObservation_Button);
//        driver.findElement(closeObservation_Button).click();
    }
    public void validateCreatorCanViewNoActionRequiredObservationInActionStated()
    {
        clickViewingDropDown();
        ElementActions.click(driver,viewinAsCreatorActionStated_Button);
//        driver.findElement(viewinAsCreatorActionStated_Button).click();
        ElementActions.click(driver,actionsObservation_Button);
//        driver.findElement(actionsObservation_Button).click();
        ElementActions.click(driver,viewOptionsAction_Button);
//        driver.findElement(viewOptionsAction_Button).click();
        Assert.assertEquals("No Action Required", driver.findElement(viewingObservationStatus_Label).getText());
        ElementActions.click(driver,closeObservation_Button);
//        driver.findElement(closeObservation_Button).click();
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
//        driver.findElement(observationActionStated_Button).click();
        clickViewingDropDown();
        ElementActions.click(driver,viewingAsHSERepActionStated_Button);
//        driver.findElement(viewingAsHSERepActionStated_Button).click();
        ElementActions.click(driver,actionsObservation_Button);
//        driver.findElement(actionsObservation_Button).click();
        ElementActions.click(driver,viewOptionsAction_Button);
//        driver.findElement(viewOptionsAction_Button).click();
        Assert.assertEquals("Closed With Immediate Action", driver.findElement(viewingObservationStatus_Label).getText());
        driver.findElement(closeObservation_Button).click();
    }

    public void validateCreatorCanViewClosedWithImmediateActionInActionStated()
    {
        clickViewingDropDown();
        ElementActions.click(driver,viewinAsCreatorActionStated_Button);
//        driver.findElement(viewinAsCreatorActionStated_Button).click();
        ElementActions.click(driver,actionsObservation_Button);
//        driver.findElement(actionsObservation_Button).click();
        ElementActions.click(driver,viewOptionsAction_Button);
//        driver.findElement(viewOptionsAction_Button).click();
        Assert.assertEquals("Closed With Immediate Action", driver.findElement(viewingObservationStatus_Label).getText());
        ElementActions.click(driver,closeObservation_Button);
//        driver.findElement(closeObservation_Button).click();
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
//        driver.findElement(observationActionStated_Button).click();
        clickViewingDropDown();
        ElementActions.click(driver,viewingAsHSERepActionStated_Button);
//        driver.findElement(viewingAsHSERepActionStated_Button).click();
        ElementActions.click(driver,actionsObservation_Button);
//        driver.findElement(actionsObservation_Button).click();
        ElementActions.click(driver,viewOptionsAction_Button);
//        driver.findElement(viewOptionsAction_Button).click();
        Assert.assertEquals("Action In Progress", driver.findElement(viewingObservationStatus_Label).getText());
        ElementActions.click(driver,closeObservation_Button);
//        driver.findElement(closeObservation_Button).click();
    }
    public void validateCreatorCanViewActionInProgressInActionStated()
    {
        clickViewingDropDown();
        ElementActions.click(driver,viewinAsCreatorActionStated_Button);
//        driver.findElement(viewinAsCreatorActionStated_Button).click();
        ElementActions.click(driver,actionsObservation_Button);
//        driver.findElement(actionsObservation_Button).click();
        ElementActions.click(driver,viewOptionsAction_Button);
//        driver.findElement(viewOptionsAction_Button).click();
        Assert.assertEquals("Action In Progress", driver.findElement(viewingObservationStatus_Label).getText());
        ElementActions.click(driver,closeObservation_Button);
//        driver.findElement(closeObservation_Button).click();
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
//        driver.findElement(viewingAsHSERepActionStated_Button).click();
        ElementActions.click(driver,actionsObservation_Button);
//        driver.findElement(actionsObservation_Button).click();
        ElementActions.click(driver,viewOptionsAction_Button);
//        driver.findElement(viewOptionsAction_Button).click();
        Assert.assertEquals("No Action Required", driver.findElement(viewingObservationStatus_Label).getText());
        ElementActions.click(driver,closeObservation_Button);
//        driver.findElement(closeObservation_Button).click();
    }




}


