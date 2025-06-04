package E2E;

import Base.TestBase;
import Pages.HomePage;
import Pages.ObservationsPage;
import Utilities.JsonReader;
import org.testng.annotations.Test;
import Pages.LoginPage;

public class PositiveObservation extends TestBase {

    @Test
    public void testUserLogin() {

        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ObservationsPage observationsPage = new ObservationsPage(driver);

        loginPage.login();
        loginPage.validateLoginSuccess();
        homePage.clickObservations();
        observationsPage.clickAddObservations();
        observationsPage.createObservation();
        observationsPage.creatPositiveObservation();
        homePage.validatePositiveObservationCreated();
        homePage.addHSERepAction();
        homePage.addComfirmPostiveObservationAction();
        homePage.validatePositiveObservationMoveToActionStated();
        homePage.validateCreatorCanViewPositiveObservationInActionStated();
        homePage.logingOut();

    }
}
