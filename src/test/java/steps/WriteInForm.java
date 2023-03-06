package steps;
import io.qameta.allure.Step;
import main.BasePage;

import java.io.File;

import static com.codeborne.selenide.Selenide.$x;

public class WriteInForm extends BasePage {


    @Step("Открыть страницу с формами")
    public WriteInForm tapIconForms(){
        $x("(//*[name()='svg'][@stroke='currentColor'])[2]").click();
        return this;
    }
    @Step("Выбор формы")
    public WriteInForm selectForm() {
        $x("//div[@class='element-list collapse show']//li[@id='item-0']").click();
        return this;
    }
    @Step("Ввод First Name")
    public WriteInForm enterFirstName(String value) {
        $x("//input[@id='firstName']").setValue(value);
        return this;
    }

    @Step("Ввод Last Name")
    public WriteInForm enterLastName(String value) {
        $x("//input[@id='lastName']").setValue(value);
        return this;
    }

    @Step("Ввод Email")
    public WriteInForm enterEmail(String value) {
        $x("//input[@id='userEmail']").setValue(value);
        return this;
    }

    @Step("Выбор Gender")
    public WriteInForm selectGender() {
        $x("//label[normalize-space()='Male']").click();
//        $x("//label[normalize-space()='Female']").click();
//        $x("//label[normalize-space()='Other']").click();
        return this;
    }

    @Step("Ввод номера телефона")
    public WriteInForm enterNumberPhone(String value) {
//        String phone = faker.bothify("8911#######");
        $x("//input[@id='userNumber']").setValue(value);
        return this;
    }

    @Step("Ввод даты рождения")
    public WriteInForm dateOfBirth() {
        $x("//input[@id='dateOfBirthInput']").click();
        $x("//select[@class='react-datepicker__month-select']").click();
        return this;
    }

    @Step("Открыть список месяцев")
    public WriteInForm selectMoth() {
        $x("//select[@class='react-datepicker__month-select']").click();
        return this;
    }

    @Step("Выбор месяца")
    public WriteInForm takeMoth() {
        $x("//option[@value='8']").click();
        return this;
    }

    @Step("Открыть список года")
    public WriteInForm selectYear() {
        $x("//select[@class='react-datepicker__year-select']").click();
        return this;
    }

    @Step("Выбор года")
    public WriteInForm takeYear() {
        $x("//option[@value='2007']").click();
        return this;
    }

    @Step("Выбор дня")
    public WriteInForm takeDay() {
        $x("//div[@aria-label='Choose Saturday, September 1st, 2007']").click();
        return this;
    }
//    @Step("Ввод Subjects")
//    public WriteInForm enterSubjects() {
//        $x("").click();
//        return this;
//    }

    @Step("Установка чек-бокса Hobbies")
    public WriteInForm selectHobbies() {
        $x("//label[normalize-space()='Music']").click();
        return this;
    }

    @Step("Добавление Picture")
    public WriteInForm addPicture() {
        File photo = new File("src/test/resources/picForTest.png"); //добавляет файл лежащий в папке resources
        $x("//input[@id='uploadPicture']").uploadFile(photo);
        return this;
    }

    @Step("Ввод Current Address")
    public WriteInForm enterCurrentAddress(String value) {
        $x("//textarea[@id='currentAddress']").click();
        $x("//textarea[@id='currentAddress']").setValue(value);
        return this;

    }

    @Step("Выбор State")
    public WriteInForm selectState() {
        $x("//div[@id='state']").click();
        $x("//div[@id='react-select-3-option-1']").click();
        return this;
    }

    @Step("Выбор City")
    public WriteInForm selectCity() {
        $x("//div[@id='city']").click();
        $x("//div[@id='react-select-4-option-1']").click();
        return this;
    }

    @Step("Клик по кнопке Submit")
    public WriteInForm clickSubmit() {
        $x("//button[@id='submit']").click();
        attachScreenshot();
        return this;
    }
}
