package by.mts.pages.communicationService;

public class CommunicationServiceXpath {

    public static final String LABEL_CARD_NUMBER_XPATH = "//label[contains(text(),'Номер карты')]";
    public static final String LABEL_VALIDITY_PERIOD_XPATH = "//label[contains(text(),'Срок действия')]";
    public static final String LABEL_HOLDER_NAME_XPATH = "//label[contains(text(),'Имя держателя (как на карте)')]";
    public static final String LABEL_CVC_XPATH = "//label[contains(text(),'CVC')]";
    public static final String CHECK_TEXT_SUM_XPATH = "//span[contains(text(),'10.00 BYN')]";
    public static final String CHECK_TEXT_SUM_BUTTON_XPATH = "//span[contains(text(),'10.00 BYN')]";
    public static final String CHECK_TEXT_NUMBER_XPATH = "//span[contains(text(),'375297777777')]";

    public static final String CHECK_VISACARD_ICON_XPATH = "//img[@src='assets/images/payment-icons/card-types/visa-system.svg']";
    public static final String CHECK_MASTERCARD_ICON_XPATH = "//img[@src='assets/images/payment-icons/card-types/mastercard-system.svg']";
    public static final String CHECK_BELCARD_ICON_XPATH = "//img[@src='assets/images/payment-icons/card-types/belkart-system.svg']";
    public static final String CHECK_WORLDCARD_ICON_XPAT = "//img[@src='assets/images/payment-icons/card-types/maestro-system.svg']";

    //CHECK_WORLDCARD_ICON_XPATH динамичный иконки меняются, поэтому просто к классу привязался, он уникальный

}
