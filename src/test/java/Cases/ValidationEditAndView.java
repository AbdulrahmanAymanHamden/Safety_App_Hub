package Cases;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ObservationsPage;
import org.testng.annotations.Test;

public class ValidationEditAndView extends TestBase {
    @Test
    public void testCanEditAndView() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ObservationsPage observationsPage = new ObservationsPage(driver);

        loginPage.login();
        loginPage.validateLoginSuccess();

        //validate creator and HSE can view and edit observation in no action stated and in action stated after add action close and no action;
        homePage.clickObservations();
        observationsPage.clickAddObservations();
        observationsPage.createObservation();
        observationsPage.creatUnsafeActObservation();
        homePage.validateUnSafeObservationCreatedOrUpdated();
        homePage.editObservationByCreator();
        observationsPage.editByCreatorInObservationPage();
        homePage.clickViewObservationInActionStated();
        observationsPage.validateCreatorCanViewObservationInNoActionStatedAndValidateItAlreadyModified();
        homePage.clickEditObservationByHSE();
        observationsPage.editObservationByHSE();
        homePage.clickViewObservationInActionStated();
        observationsPage.validateHSECanViewObservationInNoActionStatedAndValidateItAlreadyModified();
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
        homePage.validateHSECanViewNoActionRequiredObservationInActionStated();
        homePage.clickNoActionStatedButton();

        //validate creator and HSE can view and edit observation in no action stated;
        observationsPage.clickAddObservations();
        observationsPage.createObservation();
        observationsPage.creatUnsafeActObservation();
        homePage.validateUnSafeObservationCreatedOrUpdated();
        homePage.editObservationByCreator();
        observationsPage.editByCreatorInObservationPage();
        homePage.clickViewObservationInActionStated();
        observationsPage.validateCreatorCanViewObservationInNoActionStatedAndValidateItAlreadyModified();
        homePage.clickEditObservationByHSE();
        observationsPage.editObservationByHSE();
        homePage.clickViewObservationInActionStated();
        observationsPage.validateHSECanViewObservationInNoActionStatedAndValidateItAlreadyModified();
        homePage.addHSERepAction();
        homePage.addCommitteFeedBackAction();
        homePage.validateObservationStatusNeedCommitteFeedBack();

        //validate creator and HSE can view and edit observation in no action stated and in action stated after add action Closed With Immediate Action;
        observationsPage.clickAddObservations();
        observationsPage.createObservation();
        observationsPage.creatUnsafeActObservation();
        homePage.validateUnSafeObservationCreatedOrUpdated();
        homePage.editObservationByCreator();
        observationsPage.editByCreatorInObservationPage();
        homePage.clickViewObservationInActionStated();
        observationsPage.validateCreatorCanViewObservationInNoActionStatedAndValidateItAlreadyModified();
        homePage.clickEditObservationByHSE();
        observationsPage.editObservationByHSE();
        homePage.clickViewObservationInActionStated();
        observationsPage.validateHSECanViewObservationInNoActionStatedAndValidateItAlreadyModified();
        homePage.addHSERepAction();
        homePage.addClosedWithImmediateAction();
        homePage.validateClosedWithImmediateActionMovetoActionStated();
        homePage.clickNoActionStatedButton();

        //validate creator and HSE can view and edit observation in no action stated and in action stated after add action add action by HSE;
        observationsPage.clickAddObservations();
        observationsPage.createObservation();
        observationsPage.creatUnsafeActObservation();
        homePage.validateUnSafeObservationCreatedOrUpdated();
        homePage.editObservationByCreator();
        observationsPage.editByCreatorInObservationPage();
        homePage.clickViewObservationInActionStated();
        observationsPage.validateCreatorCanViewObservationInNoActionStatedAndValidateItAlreadyModified();
        homePage.clickEditObservationByHSE();
        observationsPage.editObservationByHSE();
        homePage.clickViewObservationInActionStated();
        observationsPage.validateHSECanViewObservationInNoActionStatedAndValidateItAlreadyModified();
        homePage.addHSERepAction();
        homePage.addActionByHSEAction();
        homePage.validateActionInProgressMovetoActionStated();
        homePage.clickNoActionStatedButton();

        //validate creator and HSE can view and edit observation in no action stated;
        observationsPage.clickAddObservations();
        observationsPage.createObservation();
        observationsPage.creatUnsafeActObservation();
        homePage.validateUnSafeObservationCreatedOrUpdated();
        homePage.editObservationByCreator();
        observationsPage.editByCreatorInObservationPage();
        homePage.clickViewObservationInActionStated();
        observationsPage.validateCreatorCanViewObservationInNoActionStatedAndValidateItAlreadyModified();
        homePage.clickEditObservationByHSE();
        observationsPage.editObservationByHSE();
        homePage.clickViewObservationInActionStated();
        observationsPage.validateHSECanViewObservationInNoActionStatedAndValidateItAlreadyModified();
        homePage.addHSERepAction();
        homePage.addOwnerDepartmentFeedBackRequired();
        homePage.validateObservationStatusIsOwnerDeptFeedbackRequired();
        homePage.logOut();


    }


}
