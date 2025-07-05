package E2EManagementReviews;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.Observations_AuditsRecord_ManagementReview_Page;
import org.testng.annotations.Test;

public class NoActionRequiredManagementReview extends TestBase {

    @Test
    public void testE2ECreatNoActionManagementReview()
    {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        Observations_AuditsRecord_ManagementReview_Page observationsAuditsRecordPage = new Observations_AuditsRecord_ManagementReview_Page(driver);

        loginPage.login();
        loginPage.validateLoginSuccess();
        homePage.clickManagementReiews();
        observationsAuditsRecordPage.creatManagementReview();
        observationsAuditsRecordPage.selectNoActionRequired();
        homePage.validateNoActionMeetingReviewCreated();
        homePage.logOut();
    }



}
