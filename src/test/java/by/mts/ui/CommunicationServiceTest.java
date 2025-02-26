package by.mts.ui;

import by.mts.pages.HomePage;
import by.mts.pages.communicationService.CommunicationService;
import by.mts.pages.communicationService.CommunicationServiceXpath;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CommunicationServiceTest extends BaseTest {
    HomePage homePage = new HomePage();
    CommunicationService communicationService = new CommunicationService();

    @Test
    @DisplayName("Проверка суммы")
    public void testCheckSum() {
        homePage.cookieAgree();
        communicationService.checkPayConnection();
        Assertions.assertEquals(communicationService.checkText(CommunicationServiceXpath.CHECK_TEXT_SUM_XPATH), "10.00 BYN");
    }

    @Test
    @DisplayName("Проверка суммы на кнопке")
    public void testCheckSumButton() {
        homePage.cookieAgree();
        communicationService.checkPayConnection();
        Assertions.assertEquals(communicationService.checkText(CommunicationServiceXpath.CHECK_TEXT_SUM_BUTTON_XPATH), "10.00 BYN");
    }

    @Test
    @DisplayName("Проверка телефона")
    public void testCheckPhoneNumber() {
        homePage.cookieAgree();
        communicationService.checkPayConnection();
        Assertions.assertEquals(communicationService.checkText(CommunicationServiceXpath.CHECK_TEXT_NUMBER_XPATH), "Оплата: Услуги связи Номер:375297777777");
    }

    @Test
    @DisplayName("Проверка пустых полей на форме подтверждения платежа")
    public void testEmptyFieldCommunicationService() {
        homePage.cookieAgree();
        communicationService.checkPayConnection();
        SoftAssertions softAssertions = new SoftAssertions();

        softAssertions.assertThat(communicationService.checkText(CommunicationServiceXpath.LABEL_CARD_NUMBER_XPATH))
                .isEqualTo("Номер карты");

        softAssertions.assertThat(communicationService.checkText(CommunicationServiceXpath.LABEL_VALIDITY_PERIOD_XPATH))
                .isEqualTo("Срок действия");

        softAssertions.assertThat(communicationService.checkText(CommunicationServiceXpath.LABEL_HOLDER_NAME_XPATH))
                .isEqualTo("Имя держателя (как на карте)");

        softAssertions.assertThat(communicationService.checkText(CommunicationServiceXpath.LABEL_CVC_XPATH))
                .isEqualTo("CVC");

        softAssertions.assertAll();
    }

    @Test
    @DisplayName("Проверка логотипов платежных систем")
    public void testIconPaySystems() {
        homePage.cookieAgree();
        homePage.goPayConnection();
        SoftAssertions softAssertions = new SoftAssertions();

        softAssertions.assertThat(communicationService.checkCardIcon(CommunicationServiceXpath.CHECK_VISACARD_ICON_XPATH))
                .as("Логотип Visa отсутствует")
                .isEqualTo("assets/images/payment-icons/card-types/visa-system.svg");

        softAssertions.assertThat(communicationService.checkCardIcon(CommunicationServiceXpath.CHECK_MASTERCARD_ICON_XPATH))
                .as("Логотип MasterCard отсутствует")
                .isEqualTo("assets/images/payment-icons/card-types/mastercard-system.svg");

        softAssertions.assertThat(communicationService.checkCardIcon(CommunicationServiceXpath.CHECK_BELCARD_ICON_XPATH))
                .as("Логотип BelCard отсутствует")
                .isEqualTo("assets/images/payment-icons/card-types/belkart-system.svg");

        softAssertions.assertThat(communicationService.checkCardIcon(CommunicationServiceXpath.CHECK_WORLDCARD_ICON_XPAT))
                .as("Логотип Мир отсутствует")
                .isEqualTo("assets/images/payment-icons/card-types/maestro-system.svg");

        softAssertions.assertAll();
    }
}
