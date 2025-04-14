import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


@DisplayName("Чистый Selenide")
public class SimpleSelenideTest extends TestBase{

    @Test
            public void simpleSelenide(){
        SelenideLogger.addListener("allure", new AllureSelenide());
        // открыть https://github.com/
        open("https://github.com/");
        // установить фокус на поиске
        $(".search-input").click();
        //    в поле поиска ввести elinamarsona/demoqa34
        $("#query-builder-test").setValue("elinamarsona/demoqa34").submit();
        //    найти проект junit
        $("[href='/elinamarsona/demoqa34_junit']").click();
        //    нажать на Issues
        $("[data-content=Issues]").click();
    }

}
