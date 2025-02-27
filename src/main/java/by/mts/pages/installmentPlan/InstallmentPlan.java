package by.mts.pages.installmentPlan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static by.mts.driver.Driver.getDriver;

public class InstallmentPlan {
    private WebDriver driver;

    public InstallmentPlan() {
        driver = getDriver();
    }

    public String checkEmptyField(String str) {
        return driver.findElement(By.xpath(str)).getDomAttribute("placeholder");
    }
}
