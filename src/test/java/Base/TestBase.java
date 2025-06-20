package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

public class TestBase {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Properties config;

    @BeforeMethod
    public void setUp() {
        loadConfig();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        // options.addArguments("--headless"); // Uncomment for headless mode

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Navigate to base URL
        driver.get(config.getProperty("baseUrl"));
    }
//
//    @AfterMethod
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }

    // Load configuration from config.properties file
    private void loadConfig() {
        config = new Properties();
        try {
            FileInputStream fis = new FileInputStream("src/main/resources/Properties/config.properties");
            config.load(fis);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load config file.", e);
        }
    }
}

