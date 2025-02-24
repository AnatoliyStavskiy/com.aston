package by.mts.pages.communicationService;

import by.mts.pages.HomePageXpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static by.mts.driver.Driver.getDriver;

public class CommunicationService {
    private WebDriver driver;
    private WebDriverWait webDriverWait;

    public CommunicationService() {
        driver = getDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public String checkEmptyField(String str) {
        return driver.findElement(By.xpath(str)).getDomAttribute("placeholder");
    }

    private void enterText(By locator, String text) {
        WebElement element = driver.findElement(locator);
        element.click();
        element.sendKeys(text);
    }

    private void clickElement(By locator) {
        driver.findElement(locator).click();
    }

    private void switchToFrame(By locator) {
        WebElement frameElement = driver.findElement(locator);
        driver.switchTo().frame(frameElement);
    }

    public String checkPayConnection() {
        enterText(By.xpath(HomePageXpath.INPUT_PHONE_XPATH), "297777777");
        enterText(By.xpath(HomePageXpath.INPUT_SUM_XPATH), "10");
        enterText(By.xpath(HomePageXpath.INPUT_EMAIL_XPATH), "AstonTest@gmail.com");

        clickElement(By.xpath(HomePageXpath.CONTINUE_BUTTON_XPATH));

        switchToFrame(By.xpath(HomePageXpath.PAY_FRAME_XPATH));

        return webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HomePageXpath.FULL_PAY_FRAME_XPATH))).getText();
    }

    public String checkText(String str) {
        return driver.findElement(By.xpath(str)).getText();
    }

    public boolean checkCardIcon(String str) {
        return driver.findElement(By.xpath(str)).isDisplayed();
    }
}
