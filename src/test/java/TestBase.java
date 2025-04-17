import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;


public class TestBase {

    @BeforeAll
    static void setupConfig() {
        Configuration.pageLoadStrategy = "eager";
        //Configuration.browserSize = "1920x1080";
        //Configuration.holdBrowserOpen = true;
    }

    @AfterEach
    void afterEach() {
        Selenide.closeWebDriver();
    }
}

//1. Чистый Selenide (с Listener) AbsoluteSelenideTest
//
//2. Лямбда шаги через step (name, () -> {}) LambdaStepTest
//
//3. Шаги с аннотацией @Step WebStepsTest