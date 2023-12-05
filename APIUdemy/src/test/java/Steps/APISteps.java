package Steps;

import io.cucumber.java.en.Given;

public class APISteps {
    
    @Given("I send a GET request to the endPoint")
    public void sendGETRequest(){
        System.out.println("Hola Mundo");
    }
}
