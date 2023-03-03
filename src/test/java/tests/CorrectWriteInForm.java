package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import main.FakerData;
import main.TestBase;
import main.UserData;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import steps.WriteInForm;

public class CorrectWriteInForm extends FakerData {
    UserData userData = new UserData();
    TestBase testBase = new TestBase();
    WriteInForm writeInForm = new WriteInForm();

    @Epic(value = "Заполнение формы")
    @Test
    @Tag("smoke")
    @Description(value = "заполнение формы")

    public void correctWriteInForm(){
        testBase.goTo();
        writeInForm.tapIconForms()
                .selectForm()
                .enterFirstName(userData.firstName)
                .enterLastName(userData.lastName)
                .enterEmail(userData.email)
                .selectGender()
                .enterNumberPhone(userData.phone)
                .selectHobbies()
                .addPicture()
                .enterCurrentAddress(userData.fullAddress)
                .clickSubmit();
    }
}
