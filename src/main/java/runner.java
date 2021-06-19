
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

//single runner
//@CucumberOptions(features="classpath:Feature/DataDrivenLogic.feature", glue = { "stepDefinition" } ) // argument passed as array


//multiple runner
/*@CucumberOptions(
        features = "src/test/Features/",
        glue = "src/test/java/MyStepdefs.java",
        format = {"html:test-output"}
)*/


// dry run just to check right map
@CucumberOptions(features = "src/test/Features/", glue = "src/test/java/MyStepdefs.java", format = {"html:test-output"}, dryRun = true)


public class runner {


}
