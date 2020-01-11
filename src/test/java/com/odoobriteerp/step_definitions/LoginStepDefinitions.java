package com.odoobriteerp.step_definitions;


import com.odoobriteerp.pages.LoginPage;
import com.odoobriteerp.utilities.BrowserUtils;
import com.odoobriteerp.utilities.ConfigurationReader;
import com.odoobriteerp.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import javax.imageio.stream.ImageInputStream;

public class LoginStepDefinitions<CrmModule> {
    // Write code here that turns the phrase above into concrete actions
    LoginPage loginPage = new LoginPage();//created login page object
    //CrmModule crmModule = new CrmModule();



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
    //  And user verifies that "Dashboard" page subtitle is displayed
    @Then("user verifies that {string} page subtitle is displayed")
    public void user_verifies_that_page_subtitle_is_displayed(String string) {
        loginPage.waitUntilLoaderMaskDisappear();
        BrowserUtils.wait(2);
        Assert.assertEquals(string, loginPage.getPageSubTitle());
        System.out.println("Verifying page subtitle: " + string);
    }

    @Then("user logs in as driver")
    public void user_logs_in_as_driver() {
        System.out.println("Login as driver");
    }


    @Then("user logs in as sales manager")
    public void user_logs_in_as_sales_manager() {
        System.out.println("Login as sales manager");
    }

    //Then user enters "storemanager85" username and "wrong" password
    @Then("user enters {string} username and {string} password")
    public void user_enters_username_and_password(String string, String string2) {
        System.out.println("Login with "+string+" username and "+string2+" password.");
    }

    @Then("user verifies that {string} message is displayed")
    public void user_verifies_that_message_is_displayed(String string) {
        System.out.println("Verified that warning message is displayed: "+string);
    }


//    //@Given("user is on the login page")
//   // public void user_is_on_the_login_page() {
//        System.out.println("im on the login page");
//   Driver.get().get(ConfigurationReader.getProperty("url"));
//
//    }
//
//    @Then("user logs in as {string}")
//    public void user_logs_in_as(String string) {
//        System.out.println("logs as manager");
//
//    }

    @Then("user navigates to {string}")
    public void user_navigates_to(String string) {
        //crmModule.navigate

    }

    @Then("user goes to {string} under tha {string} module")
    public void user_goes_to_under_tha_module(String string, String string2) {

    }

    @Then("user create and save a new tag {string}")
    public void user_create_and_save_a_new_tag(String string) {

    }

    @Then("user verifies that message displayed is equal to {string}")
    public void user_verifies_that_message_displayed_is_equal_to(String string) {


    }

}
