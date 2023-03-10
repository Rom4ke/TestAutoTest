package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import main.BasePage;
import java.io.File;
import static com.codeborne.selenide.Selenide.$x;

public class Form extends BasePage {

    private static final SelenideElement enterFirstNameValue = $x("//input[@id='firstName']");
    private static final SelenideElement enterLastNameValue = $x("//input[@id='lastName']");
    private static final SelenideElement enterEmailValue = $x("//input[@id='userEmail']");
    private static final SelenideElement selectGenderClick = $x("//label[normalize-space()='Male']");
    private static final SelenideElement enterNumberPhoneValue = $x("//input[@id='userNumber']");
    private static final SelenideElement dateOfBirthClick = $x("//input[@id='dateOfBirthInput']");
    private static final SelenideElement selectMothClick = $x("//select[@class='react-datepicker__month-select']");
    private static final SelenideElement takeMothClick = $x("//option[@value='8']");
    private static final SelenideElement selectYearClick = $x("//select[@class='react-datepicker__year-select']");
    private static final SelenideElement takeYearClick = $x("//option[@value='2007']");
    private static final SelenideElement takeDayClick = $x("//div[@aria-label='Choose Saturday, September 1st, 2007']");
    private static final SelenideElement enterSubjectsValue = $x("//input[@id='subjectsInput']");
    private static final SelenideElement selectHobbiesClick = $x("//label[normalize-space()='Music']");
    private static final SelenideElement addPictureClick = $x("//input[@id='uploadPicture']");
    private static final SelenideElement enterCurrentAddressClick = $x("//textarea[@id='currentAddress']");
    private static final SelenideElement enterCurrentAddressValue = $x("//textarea[@id='currentAddress']");
    private static final SelenideElement selectStateClick = $x("//div[@id='state']");
    private static final SelenideElement selectStateChoose = $x("//div[@id='react-select-3-option-1']");

    private static final SelenideElement selectCityClick = $x("//div[@id='city']");
    private static final SelenideElement selectCityChoose = $x("//div[@id='react-select-4-option-1']");

    private static final SelenideElement clickSubmit = $x("//button[@id='submit']");

    @Step("???????? First Name")
    public Form enterFirstName(String value) {
        enterFirstNameValue.setValue(value);
        return this;
    }

    @Step("???????? Last Name")
    public Form enterLastName(String value) {
        enterLastNameValue.setValue(value);
        return this;
    }

    @Step("???????? Email")
    public Form enterEmail(String value) {
        enterEmailValue.setValue(value);
        return this;
    }

    @Step("?????????? Gender")
    public Form selectGender() {
        selectGenderClick.click();
//        $x("//label[normalize-space()='Female']").click();
//        $x("//label[normalize-space()='Other']").click();
        return this;
    }

    @Step("???????? ???????????? ????????????????")
    public Form enterNumberPhone(String value) {
        enterNumberPhoneValue.setValue(value);
        return this;
    }

    @Step("???????? ???????? ????????????????")
    public Form dateOfBirth() {
        dateOfBirthClick.click();
        return this;
    }

    @Step("?????????????? ???????????? ??????????????")
    public Form selectMoth() {
        selectMothClick.click();
        return this;
    }

    @Step("?????????? ????????????")
    public Form takeMoth() {
        takeMothClick.click();
        return this;
    }

    @Step("?????????????? ???????????? ????????")
    public Form selectYear() {
        selectYearClick.click();
        return this;
    }

    @Step("?????????? ????????")
    public Form takeYear() {
        takeYearClick.click();
        return this;
    }

    @Step("?????????? ??????")
    public Form takeDay() {
        takeDayClick.click();
        return this;
    }
    @Step("???????? Subjects")
    public Form enterSubjects(String value) {
        enterSubjectsValue.setValue(value).pressEnter();
        return this;
    }

    @Step("?????????????????? ??????-?????????? Hobbies")
    public Form selectHobbies() {
        selectHobbiesClick.click();
        return this;
    }

    @Step("???????????????????? Picture")
    public Form addPicture() {
        File photo = new File("src/test/resources/picForTest.png"); //?????????????????? ???????? ?????????????? ?? ?????????? resources
        addPictureClick.uploadFile(photo);
        return this;
    }

    @Step("???????? Current Address")
    public Form enterCurrentAddress(String value) {
        enterCurrentAddressClick.click();
        enterCurrentAddressValue.setValue(value);
        return this;

    }

    @Step("?????????? State")
    public Form selectState() {
        selectStateClick.click();
        selectStateChoose.click();
        return this;
    }

    @Step("?????????? City")
    public Form selectCity() {
        selectCityClick.click();
        selectCityChoose.click();
        return this;
    }

    @Step("???????? ???? ???????????? Submit")
    public Form clickSubmit() {
        clickSubmit.click();
        attachScreenshot();
        return this;
    }
}
