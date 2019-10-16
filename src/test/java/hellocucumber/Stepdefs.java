package hellocucumber;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

public class Stepdefs {

    @Given("^using test_plugin (test|test2) \"(\\d+)\" another string \"([^\"]*)\"(option1|option2) and hello:$")
    public void testMethod(String validateOrSave, int count, String entityType, String userId, String password) {
        System.out.println("Im good");
    }
}
