package Runner;

import org.junit.runner.RunWith;
import org.cucumber.junit.Cucumber;
import org.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "Steps"
)


public class Runner {
    
}
