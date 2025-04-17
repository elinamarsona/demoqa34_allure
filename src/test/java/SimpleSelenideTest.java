import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


@DisplayName("Чистый Selenide")
public class SimpleSelenideTest extends TestBase {

    @Test
    public void simpleSelenide() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        open("https://github.com/");
        $(".search-input").click();
        $("#query-builder-test").setValue("elinamarsona/demoqa34").submit();
        $("[href='/elinamarsona/demoqa34_junit']").click();
        $("[data-content=Issues]").click();
        $("#issues-tab").shouldHave(text("ISSUE"));
    }

}
