package by.mts.ui;

import by.mts.pages.HomePage;
import by.mts.pages.homeInternet.HomeInternet;
import by.mts.pages.homeInternet.HomeInternetXpath;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HomeInternetTest extends BaseTest {

    HomePage homePage = new HomePage();
    HomeInternet homeInternet = new HomeInternet();

    @Test
    @DisplayName("Проверка пустых полей HomeInternet")
    public void testEmptyFieldHomeInternet() {
        homePage.cookieAgree();
        SoftAssertions softAssertions = new SoftAssertions();

        softAssertions.assertThat(homeInternet.checkEmptyField(HomeInternetXpath.INPUT_PHONE_XPATH))
                .isEqualTo("Номер абонента");

        softAssertions.assertThat(homeInternet.checkEmptyField(HomeInternetXpath.INPUT_SUM_XPATH))
                .isEqualTo("Сумма");

        softAssertions.assertThat(homeInternet.checkEmptyField(HomeInternetXpath.INPUT_EMAIL_XPATH))
                .isEqualTo("E-mail для отправки чека");

        softAssertions.assertAll();
    }
}
