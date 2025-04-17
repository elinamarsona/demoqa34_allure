import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@DisplayName("Лямбда степов")
public class LambdaStepTest extends TestBase {

    @Test

    public void lambdaStepTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Открываем главную страницу", () -> {
            open("https://github.com");
        });
        step("Установим фокус на поиске", () -> {
            $(".search-input").click();
        });
        step("В поле поиска ввести elinamarsona/demoqa34", () -> {
            $("#query-builder-test").setValue("elinamarsona/demoqa34").submit();
        });
        step("Найдем проект elinamarsona/demoqa34_junit", () -> {
            $("[href='/elinamarsona/demoqa34_junit']").click();
        });
        step("Кликаем на таб Issues", () -> {
            $("[data-content=Issues]").click();
        });
        step("Проверяем в репозитории название", () -> {
            $("#issues-tab").shouldHave(text("ISSUE"));
        });

    }
}
