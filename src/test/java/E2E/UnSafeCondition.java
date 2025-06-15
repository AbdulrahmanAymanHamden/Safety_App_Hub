package E2E;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ObservationsPage;
import org.testng.annotations.Test;

public class UnSafeCondition extends TestBase {

    //make unsafe conditions observation and add action "clarificaion needed" then update observation as a creator and add action "close and no actions" finally logged out.
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
        observationsPage.creatUnsafeConditionObservation();
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

    // make unsafe conditions observation and add action " committe feedback needed" finally logged out.
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
        observationsPage.creatUnsafeConditionObservation();
        homePage.validateUnSafeObservationCreatedOrUpdated();
        homePage.addHSERepAction();
        homePage.addCommitteFeedBackAction();
        homePage.validateObservationStatusNeedCommitteFeedBack();
        homePage.logingOut();
    }

    //make unsafe conditions observation and add action "add action by HSE REP." finally logged out.
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
        observationsPage.creatUnsafeConditionObservation();
        homePage.validateUnSafeObservationCreatedOrUpdated();
        homePage.addHSERepAction();
        homePage.addClosedWithImmediateAction();
        homePage.validateClosedWithImmediateActionMovetoActionStated();
        homePage.validateCreatorCanViewClosedWithImmediateActionInActionStated();
        homePage.logingOut();
    }

    //make unsafe conditions observation and add action "add action by HSE REP." finally logged out.
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
        observationsPage.creatUnsafeConditionObservation();
        homePage.validateUnSafeObservationCreatedOrUpdated();
        homePage.addHSERepAction();
        homePage.addActionByHSEAction();
        homePage.validateActionInProgressMovetoActionStated();
        homePage.validateCreatorCanViewActionInProgressInActionStated();
        homePage.logingOut();
    }

    //make unsafe conditions observation  and add action "owner DEPT. feedback required" finally logged out.
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
        observationsPage.creatUnsafeConditionObservation();
        homePage.validateUnSafeObservationCreatedOrUpdated();
        homePage.addHSERepAction();
        homePage.addOwnerDepartmentFeedBackRequired();
        homePage.validateObservationStatusIsOwnerDeptFeedbackRequired();
        homePage.logingOut();

    }






}
