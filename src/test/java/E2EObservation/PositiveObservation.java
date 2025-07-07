package E2EObservation;

import Base.TestBase;
import Pages.HomePage;
import Pages.Observations_AuditsRecord_ManagementReview_Page;
import org.testng.annotations.Test;
import Pages.LoginPage;

public class PositiveObservation extends TestBase {

    @Test
    public void testUserLogin() {

        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        Observations_AuditsRecord_ManagementReview_Page observationsAuditsRecordPage = new Observations_AuditsRecord_ManagementReview_Page(driver);

        loginPage.login();
        loginPage.validateLoginSuccess();
        homePage.clickObservations();
        observationsAuditsRecordPage.clickAddObservations();
        observationsAuditsRecordPage.create_Observation_Audit();
        observationsAuditsRecordPage.creatPositiveObservation();
        homePage.validatePositiveObservationCreated();
        homePage.addHSERepAction();
        homePage.addComfirmPostiveObservationAction();
        homePage.validatePositiveObservationMoveToActionStated();
        homePage.validateCreatorCanViewPositiveObservationInActionStated();
        homePage.logOut();

    }
}
