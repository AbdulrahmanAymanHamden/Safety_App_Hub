package Cases;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.Observations_AuditsRecord_Page;
import org.testng.annotations.Test;

public class ValidationEditAndView extends TestBase {
    @Test
    public void testCanEditAndView() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        Observations_AuditsRecord_Page observationsAuditsRecordPage = new Observations_AuditsRecord_Page(driver);

        loginPage.login();
        loginPage.validateLoginSuccess();

        //validate creator and HSE can view and edit observation in no action stated and in action stated after add action close and no action;
        homePage.clickObservations();
        observationsAuditsRecordPage.clickAddObservations();
        observationsAuditsRecordPage.create_Observation_Audit();
        observationsAuditsRecordPage.creatUnsafeActObservation();
        homePage.validateUnSafeObservationCreatedOrUpdated();
        homePage.editObservationByCreator();
        observationsAuditsRecordPage.editByCreatorInObservationPage();
        homePage.clickViewObservationInActionStated();
        observationsAuditsRecordPage.validateCreatorCanViewObservationInNoActionStatedAndValidateItAlreadyModified();
        homePage.clickEditObservationByHSE();
        observationsAuditsRecordPage.editObservationByHSE();
        homePage.clickViewObservationInActionStated();
        observationsAuditsRecordPage.validateHSECanViewObservationInNoActionStatedAndValidateItAlreadyModified();
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
        homePage.validateHSECanViewNoActionRequiredObservationInActionStated();
        homePage.clickNoActionStatedButton();

        //validate creator and HSE can view and edit observation in no action stated;
        observationsAuditsRecordPage.clickAddObservations();
        observationsAuditsRecordPage.create_Observation_Audit();
        observationsAuditsRecordPage.creatUnsafeActObservation();
        homePage.validateUnSafeObservationCreatedOrUpdated();
        homePage.editObservationByCreator();
        observationsAuditsRecordPage.editByCreatorInObservationPage();
        homePage.clickViewObservationInActionStated();
        observationsAuditsRecordPage.validateCreatorCanViewObservationInNoActionStatedAndValidateItAlreadyModified();
        homePage.clickEditObservationByHSE();
        observationsAuditsRecordPage.editObservationByHSE();
        homePage.clickViewObservationInActionStated();
        observationsAuditsRecordPage.validateHSECanViewObservationInNoActionStatedAndValidateItAlreadyModified();
        homePage.addHSERepAction();
        homePage.addCommitteFeedBackAction();
        homePage.validateObservationStatusNeedCommitteFeedBack();

        //validate creator and HSE can view and edit observation in no action stated and in action stated after add action Closed With Immediate Action;
        observationsAuditsRecordPage.clickAddObservations();
        observationsAuditsRecordPage.create_Observation_Audit();
        observationsAuditsRecordPage.creatUnsafeActObservation();
        homePage.validateUnSafeObservationCreatedOrUpdated();
        homePage.editObservationByCreator();
        observationsAuditsRecordPage.editByCreatorInObservationPage();
        homePage.clickViewObservationInActionStated();
        observationsAuditsRecordPage.validateCreatorCanViewObservationInNoActionStatedAndValidateItAlreadyModified();
        homePage.clickEditObservationByHSE();
        observationsAuditsRecordPage.editObservationByHSE();
        homePage.clickViewObservationInActionStated();
        observationsAuditsRecordPage.validateHSECanViewObservationInNoActionStatedAndValidateItAlreadyModified();
        homePage.addHSERepAction();
        homePage.addClosedWithImmediateAction();
        homePage.validateClosedWithImmediateActionMovetoActionStated();
        homePage.clickNoActionStatedButton();

        //validate creator and HSE can view and edit observation in no action stated and in action stated after add action add action by HSE;
        observationsAuditsRecordPage.clickAddObservations();
        observationsAuditsRecordPage.create_Observation_Audit();
        observationsAuditsRecordPage.creatUnsafeActObservation();
        homePage.validateUnSafeObservationCreatedOrUpdated();
        homePage.editObservationByCreator();
        observationsAuditsRecordPage.editByCreatorInObservationPage();
        homePage.clickViewObservationInActionStated();
        observationsAuditsRecordPage.validateCreatorCanViewObservationInNoActionStatedAndValidateItAlreadyModified();
        homePage.clickEditObservationByHSE();
        observationsAuditsRecordPage.editObservationByHSE();
        homePage.clickViewObservationInActionStated();
        observationsAuditsRecordPage.validateHSECanViewObservationInNoActionStatedAndValidateItAlreadyModified();
        homePage.addHSERepAction();
        homePage.addActionByHSEAction();
        homePage.validateActionInProgressMovetoActionStated();
        homePage.clickNoActionStatedButton();

        //validate creator and HSE can view and edit observation in no action stated;
        observationsAuditsRecordPage.clickAddObservations();
        observationsAuditsRecordPage.create_Observation_Audit();
        observationsAuditsRecordPage.creatUnsafeActObservation();
        homePage.validateUnSafeObservationCreatedOrUpdated();
        homePage.editObservationByCreator();
        observationsAuditsRecordPage.editByCreatorInObservationPage();
        homePage.clickViewObservationInActionStated();
        observationsAuditsRecordPage.validateCreatorCanViewObservationInNoActionStatedAndValidateItAlreadyModified();
        homePage.clickEditObservationByHSE();
        observationsAuditsRecordPage.editObservationByHSE();
        homePage.clickViewObservationInActionStated();
        observationsAuditsRecordPage.validateHSECanViewObservationInNoActionStatedAndValidateItAlreadyModified();
        homePage.addHSERepAction();
        homePage.addOwnerDepartmentFeedBackRequired();
        homePage.validateObservationStatusIsOwnerDeptFeedbackRequired();
        homePage.logOut();


    }


}
