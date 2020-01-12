package com.odoobriteerp.step_definitions;

import com.odoobriteerp.pages.ActivityTypesPage;
import com.odoobriteerp.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class ActivityTypesStepDefinitions {
               ActivityTypesPage activityTypesPage=new ActivityTypesPage();

    @Then("user verifies Activity Types table column names are displayed")
    public void user_verifies_Activity_Types_table_column_names_are_displayed(List<String> dataTable) {
        BrowserUtils.wait(3);
        Assert.assertEquals(dataTable,activityTypesPage.getActivityTypesColumn());

        System.out.println(" Activity Types table column names are: "+dataTable);

    }
}
