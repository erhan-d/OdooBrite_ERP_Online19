package com.odoobriteerp.step_definitions;


import com.odoobriteerp.pages.LoginPage;
import com.odoobriteerp.utilities.BrowserUtils;
import com.odoobriteerp.utilities.ConfigurationReader;
import com.odoobriteerp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStepDefinitions {
    // Write code here that turns the phrase above into concrete actions
    LoginPage loginPage = new LoginPage();//created login page object in order to use some methods

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("I am on the login page");
        Driver.get().get(ConfigurationReader.getProperty("url"));
    }

    @Then("user logs in as store manager")
    public void user_logs_in_as_store_manager() {
        System.out.println("Login as store manager");
        //we read username and password from properties file
        //usually in java we use camel case for naming variables
        String userName = ConfigurationReader.getProperty("user_name");
        String password = ConfigurationReader.getProperty("password");
        loginPage.login(userName, password);
    }

    //any string in "word" will become a parameter for step definition method
    //  And user verifies that "Requests for Quotation" page subtitle is displayed
    @Then("user verifies that {string} page subtitle is displayed")
    public void user_verifies_that_page_subtitle_is_displayed(String string) {
          BrowserUtils.wait(3);
        Assert.assertEquals(string,loginPage.getPageSubTitle(string));
        System.out.println("User verified page subtitle: " + string);
    }

    @Then("user logs in as postmanager")
    public void user_logs_in_as_posmanager() {
        System.out.println("Login as post manager");
    }

    @Then("user logs in as events crm manager")
    public void user_logs_in_as_events_crm_manager() {
        System.out.println("Login as events crm manager");
    }

    @Then("user logs in as events CRM manager")
    public void user_logs_in_as_events_CRM_manager() {
        System.out.println("Login as events CRM manager");
    }

    //Then user enters "posmanager45@info.com" username and "wrong" password
    //OR  Then user enters "wrong username" username and "posmanager" password
    @Then("user enters {string} username and {string} password")
    public void user_enters_username_and_password(String userName, String password) {
        loginPage.login(userName,password);
        System.out.println("User entered "+ userName+ " as a username and, "+ password+ " as a password");


    }

    @Then("user verifies that {string} message is displayed")
    public void user_verifies_that_message_is_displayed(String string) {
        String warningMassage= loginPage.warningMessage.getText();
        Assert.assertEquals(string,warningMassage);
        System.out.println("Verified that warning message is displayed: "+string);
    }


    @Then("click sign in button")
    public void click_sign_in_button() {
        loginPage.SignInButton.click();
        System.out.println("User clicked sign in button");
    }
    @Then("click {string} module")
    public void click_module(String string) {
        loginPage.navigateTo(string);
        BrowserUtils.wait(2);
        System.out.println("User clicked " + string + " module");
    }
}