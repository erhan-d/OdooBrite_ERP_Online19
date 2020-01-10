package com.odoobriteerp.step_definitions;

import com.odoobriteerp.pages.CreateSalesChannelPage;
import com.odoobriteerp.utilities.BrowserUtils;
import com.odoobriteerp.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class CreateSalesChannelStepDefinitions {


    CreateSalesChannelPage createSalesChannelPage = new CreateSalesChannelPage();


    @Then("user navigates to Sales Channel sub module")
    public void user_navigates_to_Sales_Channel_sub_module() {
        BrowserUtils.wait(3);
        createSalesChannelPage.crm.click();
        BrowserUtils.wait(3);
        createSalesChannelPage.salesChannel.click();
        BrowserUtils.wait(3);

    }

    @Then("user creates a Bugterminators Sales Channel")
    public void user_creates_a_Bugterminators_Sales_Channel() {
        Actions actions=new Actions(Driver.get());
        createSalesChannelPage.createSalesChannel.click();
        BrowserUtils.wait(2);
        createSalesChannelPage.salesTeamName.sendKeys("Bugterminators");
        BrowserUtils.wait(2);
        actions.moveToElement(createSalesChannelPage.channelLeader).click();
        BrowserUtils.wait(2);
        createSalesChannelPage.channelLeader.sendKeys("bugterminator");
       // actions.moveToElement(createSalesChannelPage.admin).click();
        BrowserUtils.wait(2);
        createSalesChannelPage.eMail.sendKeys("bugterminator@somemail.com");
        BrowserUtils.wait(2);
        createSalesChannelPage.archived.click();


    }

    @Then("user verifies that Sales Channel is created")
    public void user_verifies_that_Sales_Channel_is_created() {
        BrowserUtils.wait(2);
        String actualMessage = createSalesChannelPage.message.getText();
        BrowserUtils.wait(2);
        String expectedMessage = "Sales Channel created";
        Assert.assertEquals(expectedMessage,actualMessage);
    }


}
