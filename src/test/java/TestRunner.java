import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(

        plugin ="json:target/jsonReports/my-cucumber-report.json",
        features="src/test/resources/features",
        glue= {"stepDefinitions"}
       // tags= {"@AddPlace"}                 //compile test verify
)
public class TestRunner {

}


