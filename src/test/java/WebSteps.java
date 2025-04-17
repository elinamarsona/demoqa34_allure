import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebSteps {
    @Step("Открываем главную страницу")
    public void openMainPage() {
        open("https://github.com");
    }

    @Step("Установим фокус на поиске")
    public void searchInputClick() {
        $(".search-input").click();
    }

    @Step("В поле поиска ввести elinamarsona/demoqa34")
    public void querySetValueSubmit() {
        $("#query-builder-test").setValue("elinamarsona/demoqa34").submit();
    }

    @Step("Найдем проект elinamarsona/demoqa34_junit")
    public void hrefClick() {
        $("[href='/elinamarsona/demoqa34_junit']").click();
    }

    @Step("Кликаем на таб Issues")
    public void issuesClick() {
        $("[data-content=Issues]").click();
    }

    @Step("Проверяем в репозитории название Issues")
    public void issuesShouldHave() {
        $("#issues-tab").shouldHave(text("ISSUE"));
    }

}