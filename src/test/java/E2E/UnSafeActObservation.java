package E2E;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ObservationsPage;
import org.testng.annotations.Test;

public class UnSafeActObservation extends TestBase {
    @Test
    public void testE2EUnSafeAct()
    {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ObservationsPage observationsPage = new ObservationsPage(driver);

        loginPage.login("11111" , "mohamed.nour.gms@gmail.com", "123456789");
        loginPage.validateLoginSuccess();
        homePage.clickObservations();
        observationsPage.clickAddObservations();
        observationsPage.createObservation();
        observationsPage.creatUnsafeActObservation();
        homePage.validateUnSafeActObservationCreatedOrUpdated();
        homePage.addHSERepAction();
        homePage.addClarificationNeededfromCreatorAction();
        homePage.validateObservationStatus();
        homePage.editObservationByCreator();
        observationsPage.makeClarificationCreator();
        homePage.validateUnSafeActObservationCreatedOrUpdated();
        homePage.addHSERepAction();
        homePage.addcloseAndNoActionRequiredAction();
        homePage.validateNoActionRequiredObservationMoveToActionStated();
        homePage.validateCreatorCanViewNoActionRequiredObservationInActionStated();
        homePage.logingOut();

    }
}

