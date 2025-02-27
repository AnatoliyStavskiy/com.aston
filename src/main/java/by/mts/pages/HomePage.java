package by.mts.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static by.mts.driver.Driver.getDriver;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait webDriverWait;

    public HomePage() {
        driver = getDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
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

    public void cookieAgree() {
        try {
            webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HomePageXpath.MAIN_XPATH)));
            clickElement(By.xpath(HomePageXpath.COOCKIE_AGREE_XPATH));
        } catch (ElementNotInteractableException | NoSuchElementException e) {
            System.out.println("Cookie не принимались");
        }
    }

    public String checkBlockName() {
        return driver.findElement(By.xpath(HomePageXpath.BLOCK_NAME_XPATH)).getText();
    }

    public boolean checkVisaLogo() {
        return driver.findElement(By.xpath(HomePageXpath.VISA_LOGO_XPATH)).isDisplayed();
    }

    public boolean checkVerifiedByVisaLogo() {
        return driver.findElement(By.xpath(HomePageXpath.VERIFIED_BY_VISA_LOGO_XPATH)).isDisplayed();
    }

    public boolean checkMasterCardLogo() {
        return driver.findElements(By.xpath(HomePageXpath.MASTERCARD_LOGO_XPATH)).get(0).isDisplayed();
    }

    public boolean checkMasterCardSecureCodeLogo() {
        return driver.findElement(By.xpath(HomePageXpath.MASTERCARD_SECURECODE_LOGO_XPATH)).isDisplayed();
    }

    public boolean checkBelCardLogo() {
        return driver.findElements(By.xpath(HomePageXpath.BELCARD_LOGO_XPATH)).get(0).isDisplayed();
    }

    public String checkAboutServiceLink() {
        clickElement(By.xpath(HomePageXpath.ABOUT_SERVICE_XPATH));
        return driver.getCurrentUrl();
    }

    public String checkPayConnection() {
        enterText(By.xpath(HomePageXpath.INPUT_PHONE_XPATH), "297777777");
        enterText(By.xpath(HomePageXpath.INPUT_SUM_XPATH), "10");
        enterText(By.xpath(HomePageXpath.INPUT_EMAIL_XPATH), "AstonTest@gmail.com");

        clickElement(By.xpath(HomePageXpath.CONTINUE_BUTTON_XPATH));
        switchToFrame(By.xpath(HomePageXpath.PAY_FRAME_XPATH));

        return webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(HomePageXpath.FULL_PAY_FRAME_XPATH))).getText();
    }

    public void goPayConnection() {
        enterText(By.xpath(HomePageXpath.INPUT_PHONE_XPATH), "297777777");
        enterText(By.xpath(HomePageXpath.INPUT_SUM_XPATH), "10");
        enterText(By.xpath(HomePageXpath.INPUT_EMAIL_XPATH), "AstonTest@gmail.com");

        clickElement(By.xpath(HomePageXpath.CONTINUE_BUTTON_XPATH));
        switchToFrame(By.xpath(HomePageXpath.PAY_FRAME_XPATH));
    }
}
