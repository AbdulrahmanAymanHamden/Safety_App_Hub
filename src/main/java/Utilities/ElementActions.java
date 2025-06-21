package Utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementActions {

    private static final Duration TIMEOUT = Duration.ofSeconds(10);

    public static void click(WebDriver driver, By locator) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
            element.click();
        } catch (StaleElementReferenceException e) {
            System.out.println("Retrying click due to StaleElementReferenceException...");
            retryClick(driver, locator);
        } catch (ElementClickInterceptedException e) {
            System.out.println("Retrying click due to ElementClickInterceptedException...");
            retryClick(driver, locator);
        }
    }

    private static void retryClick(WebDriver driver, By locator) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        } catch (Exception e) {
            throw new RuntimeException("Failed to click on element after retries: " + locator, e);
        }
    }

    public static void type(WebDriver driver, By locator, String text) {
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        element.sendKeys(text);
    }

    public static String getText(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
    }

    public static boolean isDisplayed(WebDriver driver, By locator) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, TIMEOUT);
            return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed();
        } catch (TimeoutException | NoSuchElementException e) {
            return false;
        }
    }
}

