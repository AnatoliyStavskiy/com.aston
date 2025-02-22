package by.mts.ui;

import by.mts.driver.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    @BeforeEach
    public void startFromHome() {
        Driver.getDriver().get("https://mts.by/");
    }

    @AfterEach
    public void tearDown() {
        Driver.quit();
    }
}

