package by.mts.ui;

import by.mts.pages.HomePage;
import by.mts.pages.debt.Debt;
import by.mts.pages.debt.DebtXpath;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DebtTest extends BaseTest {

    HomePage homePage = new HomePage();
    Debt debt = new Debt();

    @Test
    @DisplayName("Проверка пустых полей Debt")
    public void testEmptyFieldDebt() {
        homePage.cookieAgree();
        SoftAssertions softAssertions = new SoftAssertions();

        softAssertions.assertThat(debt.checkEmptyField(DebtXpath.INPUT_SCORE_XPATH))
                .isEqualTo("Номер счета на 2073");

        softAssertions.assertThat(debt.checkEmptyField(DebtXpath.INPUT_SUM_XPATH))
                .isEqualTo("Сумма");

        softAssertions.assertThat(debt.checkEmptyField(DebtXpath.INPUT_EMAIL_XPATH))
                .isEqualTo("E-mail для отправки чека");

        softAssertions.assertAll();
    }
}
