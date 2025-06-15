package Pages;

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
    private final By ConfirmPositiveObservation_Button = By.xpath("//*[@id=\"igs-table-container\"]/div/table/tbody/tr[1]/td[13]/div/div/div[2]/div/div/button");
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















    // Actions
    public void clickViewingDropDown()
    {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(viewing_dropDownList))).click();
    }

    public void clickObservations()
    {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(observations_Section))).click();
    }
    public void addHSERepAction()
    {
        clickViewingDropDown();
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
        driver.findElement(clarificationNeededFromCreator_Button).click();
        driver.findElement(submit_Button).click();
    }

    public void logingOut()
    {
        driver.findElement(linkUser_Button).click();
        driver.findElement(logOut_Button).click();
    }
    public void editObservationByCreator()
    {
        clickViewingDropDown();
        driver.findElement(viewingAsCreatorNoActionStated_button).click();
        driver.findElement(actionsObservation_Button).click();
        driver.findElement(editOptionsAction_Button).click();

    }
    public void addcloseAndNoActionRequiredAction()
    {
        driver.findElement(closeAndNoActionRequired_Button).click();
        driver.findElement(submit_Button).click();
    }
    public void addCommitteFeedBackAction()
    {
        driver.findElement(needCommitteFeedBack_Button).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(personCommitte_Selection).sendKeys("aaa");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.sendKeys(Keys.ENTER).perform();
        driver.findElement(submitTypeSubmit_Button).click();
        driver.findElement(confirm_Button).click();
    }
    public void addClosedWithImmediateAction()
    {
        driver.findElement(closedWithImmedidateAction_Button).click();
        driver.findElement(submit_Button).click();
    }
    public void addActionByHSEAction()
    {
        driver.findElement(addActionByHSEAction_Button).click();
        driver.findElement(action_TextBox).sendKeys("Automation Testing");
        driver.findElement(ownerDEPT_Selection).sendKeys("human");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.sendKeys(Keys.ENTER).perform();
        driver.findElement(rESPDeoartemnts_Selection).sendKeys("human");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.sendKeys(Keys.ENTER).perform();
        driver.findElement(pirority_Selection).sendKeys("high");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.sendKeys(Keys.ENTER).perform();
        driver.findElement(date_Input).click();
        driver.findElement(dateSelected_Selection).click();
        driver.findElement(submitTypeSubmit_Button).click();
        driver.findElement(confirm_Button).click();

    }
    public void addOwnerDepartmentFeedBackRequired()
    {
        driver.findElement(ownerDepartmentFeedBack_Button).click();
        driver.findElement(ownerDeparment_Selection).sendKeys("human");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.sendKeys(Keys.ENTER).perform();
        driver.findElement(submitTypeSubmit_Button).click();
        driver.findElement(confirm_Button).click();
    }













    //Assertion
    public void validatePositiveObservationCreated()
    {
        clickViewingDropDown();
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
        clickViewingDropDown();
        driver.findElement(viewingAsHSERepActionStated_Button).click();
        driver.findElement(actionsObservation_Button).click();
        driver.findElement(viewOptionsAction_Button).click();
        Assert.assertEquals("Positive Observation", driver.findElement(viewingObservationStatus_Label).getText());
        driver.findElement(closeObservation_Button).click();
    }
    public void validateCreatorCanViewPositiveObservationInActionStated()
    {
        clickViewingDropDown();
        driver.findElement(viewinAsCreatorActionStated_Button).click();
        driver.findElement(actionsObservation_Button).click();
        driver.findElement(viewOptionsAction_Button).click();
        Assert.assertEquals("Positive Observation", driver.findElement(viewingObservationStatus_Label).getText());
        driver.findElement(closeObservation_Button).click();
    }
    public void validateUnSafeObservationCreatedOrUpdated()
    {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        clickViewingDropDown();
        driver.findElement(viewingAsHSERepNoActionStated_Button).click();
        Assert.assertEquals("Draft", driver.findElement(observationStatus_Label).getText());
    }
    public void validateObservationStatusClarificationNeeded()
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
        clickViewingDropDown();
        driver.findElement(viewingAsHSERepActionStated_Button).click();
        driver.findElement(actionsObservation_Button).click();
        driver.findElement(viewOptionsAction_Button).click();
        Assert.assertEquals("No Action Required", driver.findElement(viewingObservationStatus_Label).getText());
        driver.findElement(closeObservation_Button).click();
    }
    public void validateCreatorCanViewNoActionRequiredObservationInActionStated()
    {
        clickViewingDropDown();
        driver.findElement(viewinAsCreatorActionStated_Button).click();
        driver.findElement(actionsObservation_Button).click();
        driver.findElement(viewOptionsAction_Button).click();
        Assert.assertEquals("No Action Required", driver.findElement(viewingObservationStatus_Label).getText());
        driver.findElement(closeObservation_Button).click();
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


        driver.findElement(observationActionStated_Button).click();
        clickViewingDropDown();
        driver.findElement(viewingAsHSERepActionStated_Button).click();
        driver.findElement(actionsObservation_Button).click();
        driver.findElement(viewOptionsAction_Button).click();
        Assert.assertEquals("Closed With Immediate Action", driver.findElement(viewingObservationStatus_Label).getText());
        driver.findElement(closeObservation_Button).click();
    }

    public void validateCreatorCanViewClosedWithImmediateActionInActionStated()
    {
        clickViewingDropDown();
        driver.findElement(viewinAsCreatorActionStated_Button).click();
        driver.findElement(actionsObservation_Button).click();
        driver.findElement(viewOptionsAction_Button).click();
        Assert.assertEquals("Closed With Immediate Action", driver.findElement(viewingObservationStatus_Label).getText());
        driver.findElement(closeObservation_Button).click();
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


        driver.findElement(observationActionStated_Button).click();
        clickViewingDropDown();
        driver.findElement(viewingAsHSERepActionStated_Button).click();
        driver.findElement(actionsObservation_Button).click();
        driver.findElement(viewOptionsAction_Button).click();
        Assert.assertEquals("Action In Progress", driver.findElement(viewingObservationStatus_Label).getText());
        driver.findElement(closeObservation_Button).click();
    }
    public void validateCreatorCanViewActionInProgressInActionStated()
    {
        clickViewingDropDown();
        driver.findElement(viewinAsCreatorActionStated_Button).click();
        driver.findElement(actionsObservation_Button).click();
        driver.findElement(viewOptionsAction_Button).click();
        Assert.assertEquals("Action In Progress", driver.findElement(viewingObservationStatus_Label).getText());
        driver.findElement(closeObservation_Button).click();
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

}


