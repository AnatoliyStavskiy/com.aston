package by.mts.ui;

import by.mts.pages.HomePage;
import by.mts.pages.installmentPlan.InstallmentPlan;
import by.mts.pages.installmentPlan.InstallmentPlanXpath;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InstallmentPlanTest extends BaseTest {

    HomePage homePage = new HomePage();
    InstallmentPlan installmentPlan = new InstallmentPlan();

    @Test
    @DisplayName("Проверка пустых полей InstallmentPlan")
    public void testEmptyFieldInstallmentPlan() {
        homePage.cookieAgree();
        SoftAssertions softAssertions = new SoftAssertions();

        softAssertions.assertThat(installmentPlan.checkEmptyField(InstallmentPlanXpath.INPUT_SCORE_XPATH))
                .isEqualTo("Номер абонента");

        softAssertions.assertThat(installmentPlan.checkEmptyField(InstallmentPlanXpath.INPUT_SUM_XPATH))
                .isEqualTo("Сумма");

        softAssertions.assertThat(installmentPlan.checkEmptyField(InstallmentPlanXpath.INPUT_EMAIL_XPATH))
                .isEqualTo("E-mail для отправки чека");

        softAssertions.assertAll();
    }
}
