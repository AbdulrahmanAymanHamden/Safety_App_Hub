package E2E;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ObservationsPage;
import org.testng.annotations.Test;

public class UnSafeCondition extends TestBase {
    @Test

    public void testE2EUnSafeCondition()
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





}
