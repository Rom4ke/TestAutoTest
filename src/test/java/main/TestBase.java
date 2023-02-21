package main;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;

import java.beans.BeanProperty;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    static String SITE_URL = "https://demoqa.com/";

    @BeforeAll
    public static void goTo(){
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = SITE_URL;
        Configuration.browser = "chrome";
        SelenideLogger.addListener("AllureSelenide",
                new AllureSelenide());
        open(SITE_URL);
    }
}
