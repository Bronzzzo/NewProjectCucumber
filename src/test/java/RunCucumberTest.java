import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// @RunWith
// Указание класса для запуска тестов
@RunWith(Cucumber.class)
// @CucumberOptions
// Указание опции для запуска сценариев
@CucumberOptions(
        // Список папок с feature файлами - фичи/сценарии
        features = {"src/test/resources/features"},
        // Спиcок пакетов с steps файлами - шаги
        glue = {"steps"}
)

public class RunCucumberTest {
}
