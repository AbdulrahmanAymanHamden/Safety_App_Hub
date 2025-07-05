package E2EObservation;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.Observations_AuditsRecord_ManagementReview_Page;
import org.testng.annotations.Test;

public class UnSafeActObservation extends TestBase {
    //make unsafeact observation and add action "clarificaion needed" then update observation as a creator and add action "close and no actions" finally logged out.
    @Test
    public void testE2EAddClarificationNeededAndCloseAndNoActions_Action()
    {

        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        Observations_AuditsRecord_ManagementReview_Page observationsAuditsRecordPage = new Observations_AuditsRecord_ManagementReview_Page(driver);

        loginPage.login();
        loginPage.validateLoginSuccess();
        homePage.clickObservations();
        observationsAuditsRecordPage.clickAddObservations();
        observationsAuditsRecordPage.create_Observation_Audit();
        observationsAuditsRecordPage.creatUnsafeActObservation();
        homePage.validateUnSafeObservationCreatedOrUpdated();
        homePage.addHSERepAction();
        homePage.addClarificationNeededfromCreatorAction();
        homePage.validateObservationStatusClarificationNeeded();
        homePage.editObservationByCreator();
        observationsAuditsRecordPage.makeClarificationCreator();
        homePage.validateUnSafeObservationCreatedOrUpdated();
        homePage.addHSERepAction();
        homePage.addcloseAndNoActionRequiredAction();
        homePage.validateNoActionRequiredObservationMoveToActionStated();
        homePage.validateCreatorCanViewNoActionRequiredObservationInActionStated();
        homePage.logOut();

    }

    // make unsafeact observation and add action " committe feedback needed" finally logged out.
    @Test
    public void testE2EAddCommiteFeedBack_Action()
    {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        Observations_AuditsRecord_ManagementReview_Page observationsAuditsRecordPage = new Observations_AuditsRecord_ManagementReview_Page(driver);

        loginPage.login();
        loginPage.validateLoginSuccess();
        homePage.clickObservations();
        observationsAuditsRecordPage.clickAddObservations();
        observationsAuditsRecordPage.create_Observation_Audit();
        observationsAuditsRecordPage.creatUnsafeActObservation();
        homePage.validateUnSafeObservationCreatedOrUpdated();
        homePage.addHSERepAction();
        homePage.addCommitteFeedBackAction();
        homePage.validateObservationStatusNeedCommitteFeedBack();
        homePage.logOut();

    }


    //make unsafact observation and add action "closed with immediate action" finally logged out.
    @Test
    public void testE2EAddActionCloseWithImmediate_Action()
    {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        Observations_AuditsRecord_ManagementReview_Page observationsAuditsRecordPage = new Observations_AuditsRecord_ManagementReview_Page(driver);

        loginPage.login();
        loginPage.validateLoginSuccess();
        homePage.clickObservations();
        observationsAuditsRecordPage.clickAddObservations();
        observationsAuditsRecordPage.create_Observation_Audit();
        observationsAuditsRecordPage.creatUnsafeActObservation();
        homePage.validateUnSafeObservationCreatedOrUpdated();
        homePage.addHSERepAction();
        homePage.addClosedWithImmediateAction();
        homePage.validateClosedWithImmediateActionMovetoActionStated();
        homePage.validateCreatorCanViewClosedWithImmediateActionInActionStated();
        homePage.logOut();
    }

    //make unsafeact observation and add action "add action by HSE REP." finally logged out.
    @Test
    public void testE2EAddActionByHSE_Action()
    {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        Observations_AuditsRecord_ManagementReview_Page observationsAuditsRecordPage = new Observations_AuditsRecord_ManagementReview_Page(driver);

        loginPage.login();
        loginPage.validateLoginSuccess();
        homePage.clickObservations();
        observationsAuditsRecordPage.clickAddObservations();
        observationsAuditsRecordPage.create_Observation_Audit();
        observationsAuditsRecordPage.creatUnsafeActObservation();
        homePage.validateUnSafeObservationCreatedOrUpdated();
        homePage.addHSERepAction();
        homePage.addActionByHSEAction();
        homePage.validateActionInProgressMovetoActionStated();
        homePage.validateCreatorCanViewActionInProgressInActionStated();
        homePage.logOut();
    }

    //make unsafe act observation  and add action "owner DEPT. feedback required" finally logged out.
    @Test
    public void testE2EAddOwnerDepartmentFeedBackRequired_Action()
    {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        Observations_AuditsRecord_ManagementReview_Page observationsAuditsRecordPage = new Observations_AuditsRecord_ManagementReview_Page(driver);

        loginPage.login();
        loginPage.validateLoginSuccess();
        homePage.clickObservations();
        observationsAuditsRecordPage.clickAddObservations();
        observationsAuditsRecordPage.create_Observation_Audit();
        observationsAuditsRecordPage.creatUnsafeActObservation();
        homePage.validateUnSafeObservationCreatedOrUpdated();
        homePage.addHSERepAction();
        homePage.addOwnerDepartmentFeedBackRequired();
        homePage.validateObservationStatusIsOwnerDeptFeedbackRequired();
        homePage.logOut();

    }



}

