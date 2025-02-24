package by.mts.ui;

import by.mts.driver.Driver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

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

