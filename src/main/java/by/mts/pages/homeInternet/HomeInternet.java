package by.mts.pages.homeInternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static by.mts.driver.Driver.getDriver;

public class HomeInternet {
    private WebDriver driver;

    public HomeInternet() {
        driver = getDriver();
    }

    public String checkEmptyField(String str) {
        return driver.findElement(By.xpath(str)).getDomAttribute("placeholder");
    }
}
