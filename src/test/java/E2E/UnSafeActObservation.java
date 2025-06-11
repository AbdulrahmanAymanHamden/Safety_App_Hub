package E2E;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ObservationsPage;
import org.testng.annotations.Test;

public class UnSafeActObservation extends TestBase {
    @Test
    public void testE2EAddClarificationNeededAndCloseAndNoActions_Action()
    {

        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ObservationsPage observationsPage = new ObservationsPage(driver);

        loginPage.login();
        loginPage.validateLoginSuccess();
        homePage.clickObservations();
        observationsPage.clickAddObservations();
        observationsPage.createObservation();
        observationsPage.creatUnsafeActObservation();
        homePage.validateUnSafeObservationCreatedOrUpdated();
        homePage.addHSERepAction();
        homePage.addClarificationNeededfromCreatorAction();
        homePage.validateObservationStatusClarificationNeeded();
        homePage.editObservationByCreator();
        observationsPage.makeClarificationCreator();
        homePage.validateUnSafeObservationCreatedOrUpdated();
        homePage.addHSERepAction();
        homePage.addcloseAndNoActionRequiredAction();
        homePage.validateNoActionRequiredObservationMoveToActionStated();
        homePage.validateCreatorCanViewNoActionRequiredObservationInActionStated();
        homePage.logingOut();

    }

    @Test
    public void testE2EAddCommiteFeedBack_Action()
    {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ObservationsPage observationsPage = new ObservationsPage(driver);

        loginPage.login();
        loginPage.validateLoginSuccess();
        homePage.clickObservations();
        observationsPage.clickAddObservations();
        observationsPage.createObservation();
        observationsPage.creatUnsafeActObservation();
        homePage.validateUnSafeObservationCreatedOrUpdated();
        homePage.addHSERepAction();
        homePage.addCommitteFeedBackAction();
        homePage.validateObservationStatusNeedCommitteFeedBack();
        homePage.logingOut();

    }

    @Test
    public void testE2EAddActionCloseWithImmediate_Action()
    {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ObservationsPage observationsPage = new ObservationsPage(driver);

        loginPage.login();
        loginPage.validateLoginSuccess();
        homePage.clickObservations();
        observationsPage.clickAddObservations();
        observationsPage.createObservation();
        observationsPage.creatUnsafeActObservation();
        homePage.validateUnSafeObservationCreatedOrUpdated();
        homePage.addHSERepAction();
        homePage.addClosedWithImmediateAction();
        homePage.validateClosedWithImmediateActionMovetoActionStated();
        homePage.validateCreatorCanViewClosedWithImmediateActionInActionStated();
        homePage.logingOut();
    }

    @Test
    public void testE2EAddActionByHSE_Action()
    {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ObservationsPage observationsPage = new ObservationsPage(driver);

        loginPage.login();
        loginPage.validateLoginSuccess();
        homePage.clickObservations();
        observationsPage.clickAddObservations();
        observationsPage.createObservation();
        observationsPage.creatUnsafeActObservation();
        homePage.validateUnSafeObservationCreatedOrUpdated();
        homePage.addHSERepAction();
        homePage.addActionByHSEAction();
        homePage.validateActionInProgressMovetoActionStated();
        homePage.validateCreatorCanViewActionInProgressInActionStated();
        homePage.logingOut();
    }

    @Test
    public void testE2EAddOwnerDepartmentFeedBackRequired_Action()
    {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ObservationsPage observationsPage = new ObservationsPage(driver);

        loginPage.login();
        loginPage.validateLoginSuccess();
        homePage.clickObservations();
        observationsPage.clickAddObservations();
        observationsPage.createObservation();
        observationsPage.creatUnsafeActObservation();
        homePage.validateUnSafeObservationCreatedOrUpdated();
        homePage.addHSERepAction();
        homePage.addOwnerDepartmentFeedBackRequired();
        homePage.validateObservationStatusIsOwnerDeptFeedbackRequired();
        homePage.logingOut();

    }



}

