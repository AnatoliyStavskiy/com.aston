package by.mts.pages.debt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static by.mts.driver.Driver.getDriver;

public class Debt {
    private WebDriver driver;

    public Debt() {
        driver = getDriver();
    }

    public String checkEmptyField(String str) {
        return driver.findElement(By.xpath(str)).getDomAttribute("placeholder");
    }
}
