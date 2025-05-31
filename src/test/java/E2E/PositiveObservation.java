package E2E;

import Base.TestBase;
import Pages.HomePage;
import Pages.ObservationsPage;
import org.testng.annotations.Test;
import Pages.LoginPage;

public class PositiveObservation extends TestBase {

    @Test
    public void testUserLogin() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ObservationsPage observationsPage = new ObservationsPage(driver);

        loginPage.login("11111" , "mohamed.nour.gms@gmail.com", "123456789");
        loginPage.validateLoginSuccess();
        homePage.clickObservations();
        observationsPage.clickAddObservations();
        observationsPage.createPositiveObservation();
        homePage.validateObservationCreating();
    }
}
