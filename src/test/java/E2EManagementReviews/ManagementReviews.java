package E2EManagementReviews;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.Observations_AuditsRecord_ManagementReview_Page;
import org.testng.annotations.Test;

public class ManagementReviews extends TestBase {

    @Test
    public void testE2ECreatNoActionManagementReview()
    {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        Observations_AuditsRecord_ManagementReview_Page observationsAuditsRecordPage = new Observations_AuditsRecord_ManagementReview_Page(driver);

        loginPage.login();
        loginPage.validateLoginSuccess();
        homePage.clickManagementReviews();
        observationsAuditsRecordPage.creatManagementReview();
        observationsAuditsRecordPage.selectNoActionRequired();
        homePage.validateNoActionMeetingReviewCreated();
        homePage.logOut();
    }
    @Test
    public void testE2ECreatIssuesAndSuggestionManagementReview()
    {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        Observations_AuditsRecord_ManagementReview_Page observationsAuditsRecordPage = new Observations_AuditsRecord_ManagementReview_Page(driver);

        loginPage.login();
        loginPage.validateLoginSuccess();
        homePage.clickManagementReviews();
        observationsAuditsRecordPage.creatManagementReview();
        observationsAuditsRecordPage.selectIssuesAndSuggestions();
        homePage.validateIssuesAndSuggestionsMeetigReviewCreated();
        homePage.validateIssuesStatusInIssuesNoActionStated();
    }

    @Test
    public void addClosedAndNoActionRequired_Action()
    {
        HomePage homePage = new HomePage(driver);
        testE2ECreatIssuesAndSuggestionManagementReview();
        homePage.addCloseAndNoActionRequired_ManagementReview();
        homePage.validateNoActionRquiredMoveToIssuesActionStated();
        homePage.logOut();

    }

    @Test
    public void addCloseWithImmediate_Action()
    {
        HomePage homePage = new HomePage(driver);
        testE2ECreatIssuesAndSuggestionManagementReview();
        homePage.addCloseWithImmediateAction_ManagementReview();
        homePage.validateCloseWithImmediateMoveToIssuesActionStated();
        homePage.logOut();

    }
@Test
    public void addActionImmediatly_Action()
    {
        HomePage homePage = new HomePage(driver);
        testE2ECreatIssuesAndSuggestionManagementReview();
        homePage.addActionImmediatly_ManagementReview();
        homePage.validateActionInProgressMoveToIssuesActionStated();
        homePage.logOut();
    }
    @Test
    public void add_Action()
    {
        HomePage homePage = new HomePage(driver);
        testE2ECreatIssuesAndSuggestionManagementReview();
        homePage.addNeedCommitteFeedBackAction_ManagementReview();
        homePage.validateNeededCommitteFeedBackCreated();
        homePage.logOut();

    }


}
