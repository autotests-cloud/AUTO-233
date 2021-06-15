package cloud.autotests.tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.*;

import static cloud.autotests.helpers.DriverHelper.getConsoleLogs;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class AppTests extends TestBase {
    @Test
    @Description("Soon to be implemented by QA.GURU engineers")
    @DisplayName("Test")
    void generatedTest() {
        step("Lorem ipsum dolor", () -> {
            // todo just add selenium action
        });

        step("It amet consectetur adipisicing elit", () -> {
            // todo just add selenium action
        });

        step("Debitis dolorem natus nemo", () -> {
            // todo just add selenium action
        });

        step("Ducimus, autem saepe!", () -> {
            // todo just add selenium action
        });
    }
}