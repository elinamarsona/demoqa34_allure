import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Шаги с аннотацией @Step")
public class WebStepsTest extends TestBase {

    @Test
    public void testGithubIssue() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        WebSteps steps = new WebSteps();
        steps.openMainPage();
        steps.searchInputClick();
        steps.querySetValueSubmit();
        steps.hrefClick();
        steps.issuesClick();
        steps.issuesShouldHave();

    }
}
