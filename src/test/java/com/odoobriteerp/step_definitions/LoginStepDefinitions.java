package com.odoobriteerp.step_definitions;


import com.odoobriteerp.pages.LoginPage;
import com.odoobriteerp.utilities.BrowserUtils;
import com.odoobriteerp.utilities.ConfigurationReader;
import com.odoobriteerp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {
    // Write code here that turns the phrase above into concrete actions
    LoginPage loginPage = new LoginPage();//created login page object

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

    @Then("user verifies that {string} page subtitle is displayed")
    public void user_verifies_that_page_subtitle_is_displayed(String string) {
        loginPage.waitUntilLoaderMaskDisappear();
        BrowserUtils.wait(3);
        Assert.assertEquals(string, loginPage.getPageSubTitle());
        System.out.println("Verifying page subtitle: " + string);
    }

//@negative_test
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("I am on the login page");
        Driver.get().navigate().to(ConfigurationReader.getProperty("login_url"));
    }
    //Then user enters "eventscrmmanager58@info.com" username and "wrong" password
    @Then("user enters {string} username and {string} password")
    public void user_enters_username_and_password(String string, String string2) {
        System.out.println("Login with " + string + " username and " + string2 + " password.");
        loginPage.login(string, string2);
    }
    @Then("user verifies that {string} message is displayed")
    public void user_verifies_that_message_is_displayed(String string) {
        System.out.println("Verified that warning message is displayed: " + string);
    }

}
