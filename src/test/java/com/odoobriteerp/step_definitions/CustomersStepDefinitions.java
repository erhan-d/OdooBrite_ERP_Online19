package com.odoobriteerp.step_definitions;

import com.odoobriteerp.pages.CustomersPage;
import com.odoobriteerp.pages.LoginPage;
import com.odoobriteerp.utilities.ConfigurationReader;
import com.odoobriteerp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomersStepDefinitions {
    LoginPage loginPage = new LoginPage();
    CustomersPage customersPage = new CustomersPage();



    @Given("user is on Home Page")
    public void user_is_on_Home_Page() {
        System.out.println("I am on the Home Page");
        Driver.get().get(ConfigurationReader.getProperty("home_url"));
    }

    @When("user navigate to Login Page")
    public void user_navigate_to_Login_Page() {
        System.out.println("I am on the login page");
        Driver.get().navigate().to(ConfigurationReader.getProperty("login_url"));
    }

    @Then("user logs in as events CRM manager")
    public void user_logs_in_as_events_CRM_manager() {
        System.out.println("Login as event CRM manager");
        String userName = ConfigurationReader.getProperty("user_name");
        String password = ConfigurationReader.getProperty("password");
        loginPage.login(userName, password);
    }
    @Then("user navigates to {string} module then clicks on {string} submodule")
    public void user_navigates_to_module_then_clicks_on_submodule(String string, String string2) {
     //   customersPage.navigateTo()addCustomer;

    }

    @Then("user creates a Customers contact")
    public void user_creates_a_Customers_contact() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
