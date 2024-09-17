package choucair.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/createNewEmployee.feature",
        glue = "choucair.stepdefinitions",
        tags = "@createNewEmployee",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class CreateNewEmployeeRunner {
}
