package by.mts.ui;

import by.mts.pages.HomePage;
import by.mts.pages.HomePageMessages;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class HomePageTest extends BaseTest {

    HomePage homePage = new HomePage();

    @Test
    @DisplayName("Проверка названия блока: Онлайн пополнение без комиссии")
    public void testBlockName() {
        homePage.cookieAgree();
        Assertions.assertEquals(homePage.checkBlockName(), "Онлайн пополнение\n" +
                "без комиссии");
    }

    @Test
    @DisplayName("Проверка логотипов платежных систем")
    public void testLogoPaySystems() {
        homePage.cookieAgree();
        SoftAssertions softAssertions = new SoftAssertions();

        softAssertions.assertThat(homePage.checkVisaLogo())
                .as("Логотип Visa отсутствует")
                .isTrue();

        softAssertions.assertThat(homePage.checkVerifiedByVisaLogo())
                .as("Логотип Verified By Visa отсутствует")
                .isTrue();

        softAssertions.assertThat(homePage.checkMasterCardLogo())
                .as("Логотип MasterCard отсутствует")
                .isTrue();

        softAssertions.assertThat(homePage.checkMasterCardSecureCodeLogo())
                .as("Логотип MasterCard Secure Code отсутствует")
                .isTrue();

        softAssertions.assertThat(homePage.checkBelCardLogo())
                .as("Логотип BelCard отсутствует")
                .isTrue();

        softAssertions.assertAll();
    }

    @Test
    @DisplayName("Проверка ссылки Подробнее о сервисе")
    public void testAboutServiceLink() {
        homePage.cookieAgree();
        Assertions.assertEquals(homePage.checkAboutServiceLink(), HomePageMessages.ABOUT_SERVICE_LINK);
    }

    @Test
    @DisplayName("Проверка оплаты связи")
    public void testConfirmPayFrame() {
        homePage.cookieAgree();
        Assertions.assertEquals(homePage.checkPayConnection(), HomePageMessages.CONFIRM_PAY_MESSAGE);
    }
}
