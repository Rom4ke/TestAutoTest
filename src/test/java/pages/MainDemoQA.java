package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class MainDemoQA {

    private static final SelenideElement iconFormClick = $x("(//*[name()='svg'][@stroke='currentColor'])[2]");
    @Step("Открыть сайт")
    public MainDemoQA siteUrl(String SITE_URL){
        open(SITE_URL);
        return this;
    }

    @Step("Открыть страницу с формами")
    public Forms tapIconForms(){
        iconFormClick.click();
        return new Forms();
    }

}

