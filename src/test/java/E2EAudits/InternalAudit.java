package E2EAudits;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.Observations_AuditsRecord_ManagementReview_Page;
import org.testng.annotations.Test;

public class InternalAudit extends TestBase {

    @Test
    public void testE2ECreatNoFindingsExternalAudit() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        Observations_AuditsRecord_ManagementReview_Page observationsAuditsRecordPage = new Observations_AuditsRecord_ManagementReview_Page(driver);

        loginPage.login();
        loginPage.validateLoginSuccess();
        homePage.clickAudits();
        homePage.clickAddAudits();
        observationsAuditsRecordPage.create_Observation_Audit();
        observationsAuditsRecordPage.creatInternalAudit();
        observationsAuditsRecordPage.selectNoFindings();
        homePage.validateNoFindingAuditCreated();
        homePage.logOut();
    }

    @Test
    public void testE2EAddCloseAndNoActions_Action()
    {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        Observations_AuditsRecord_ManagementReview_Page observationsAuditsRecordPage = new Observations_AuditsRecord_ManagementReview_Page(driver);

        loginPage.login();
        loginPage.validateLoginSuccess();
        homePage.clickAudits();
        homePage.clickAddAudits();
        observationsAuditsRecordPage.create_Observation_Audit();
        observationsAuditsRecordPage.creatInternalAudit();
        observationsAuditsRecordPage.selectFindingsDeteced();
        homePage.validatefindingsAuditCreated();
        homePage.clickFindingsNoActionStated();
        homePage.addHSERepActionToAudit();
        homePage.addcloseAndNoActionRequiredAction_Audit();
        homePage.validateNoActionRequiredAuditMoveToActionStated();
        homePage.logOut();
    }

    @Test
    public void testE2EAddClosedWithImmediateAction_Action()
    {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        Observations_AuditsRecord_ManagementReview_Page observationsAuditsRecordPage = new Observations_AuditsRecord_ManagementReview_Page(driver);

        loginPage.login();
        loginPage.validateLoginSuccess();
        homePage.clickAudits();
        homePage.clickAddAudits();
        observationsAuditsRecordPage.create_Observation_Audit();
        observationsAuditsRecordPage.creatInternalAudit();
        observationsAuditsRecordPage.selectFindingsDeteced();
        homePage.validatefindingsAuditCreated();
        homePage.clickFindingsNoActionStated();
        homePage.addHSERepActionToAudit();
        homePage.addClosedWithImmediateAction_Audit();
        homePage.validateClosedWithImmediateActionAuditMovetoActionStated();
        homePage.logOut();
    }


    @Test
    public void testE2EAddActionimmediatly_Action() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        Observations_AuditsRecord_ManagementReview_Page observationsAuditsRecordPage = new Observations_AuditsRecord_ManagementReview_Page(driver);

        loginPage.login();
        loginPage.validateLoginSuccess();
        homePage.clickAudits();
        homePage.clickAddAudits();
        observationsAuditsRecordPage.create_Observation_Audit();
        observationsAuditsRecordPage.creatInternalAudit();
        observationsAuditsRecordPage.selectFindingsDeteced();
        homePage.validatefindingsAuditCreated();
        homePage.clickFindingsNoActionStated();
        homePage.addHSERepActionToAudit();
        homePage.addActionImmediatly_Audit();
        homePage.validateActionInProgressAuditMovetoActionStated();
        homePage.logOut();
    }

    @Test
    public void testE2EAddNeededCommitteFeedBack_Action() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        Observations_AuditsRecord_ManagementReview_Page observationsAuditsRecordPage = new Observations_AuditsRecord_ManagementReview_Page(driver);

        loginPage.login();
        loginPage.validateLoginSuccess();
        homePage.clickAudits();
        homePage.clickAddAudits();
        observationsAuditsRecordPage.create_Observation_Audit();
        observationsAuditsRecordPage.creatInternalAudit();
        observationsAuditsRecordPage.selectFindingsDeteced();
        homePage.validatefindingsAuditCreated();
        homePage.clickFindingsNoActionStated();
        homePage.addHSERepActionToAudit();
        homePage.addNeededCommitteFeedBackAction_Audit();
        homePage.validateFindingsStatusNeededCommitteeFeedBack();
        homePage.logOut();
    }





}
