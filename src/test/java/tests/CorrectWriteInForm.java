package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import main.FakerData;
import main.TestBase;
import main.UserData;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainDemoQA;

public class CorrectWriteInForm extends TestBase {
    UserData userData = new UserData();

    private static String SITE_URL = System.getProperty ("site_url", "https://demoqa.com/");
    @Epic(value = "Заполнение формы")
    @Test
    @Tag("smoke")
    @Description(value = "заполнение формы")

    public void correctWriteInForm(){
        new MainDemoQA().siteUrl(SITE_URL)
                .tapIconForms()
                .selectForm()
                .enterFirstName(userData.firstName)
                .enterLastName(userData.lastName)
                .enterEmail(userData.email)
                .selectGender()
                .enterNumberPhone(userData.phone)
                .dateOfBirth()
                .selectMoth()
                .takeMoth()
                .selectYear()
                .takeYear()
                .takeDay()
                .enterSubjects("B")
                .selectHobbies()
                .addPicture()
                .enterCurrentAddress(userData.fullAddress)
                .selectState()
                .selectCity()
                .clickSubmit();
    }
}
