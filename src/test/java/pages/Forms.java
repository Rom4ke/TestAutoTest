package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import main.BasePage;


import java.io.File;

import static com.codeborne.selenide.Selenide.$x;

public class Forms {

    private static final SelenideElement SelectFormClick = $x("//div[@class='element-list collapse show']//li[@id='item-0']");
    @Step("Выбор формы")
    public Form selectForm() {
        SelectFormClick.click();
        return new Form();
    }
}
