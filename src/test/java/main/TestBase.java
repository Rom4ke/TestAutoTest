package main;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.open;

public abstract class TestBase {
    @BeforeAll
    public static void goTo(){
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = System.getProperty("browser_size", "1920x1080");
        Configuration.browser = System.getProperty("browser","firefox");
        SelenideLogger.addListener("AllureSelenide",
                new AllureSelenide());
    }
}
