package com.odoobriteerp.step_definitions;


import com.odoobriteerp.utilities.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook {

    @Before
    public void setup(){
        System.out.println("Test setup!");
        Driver.get().manage().window().maximize();
    }

    @After
    public void teardown(Scenario scenario){
        //if test failed - do this
        if(scenario.isFailed()){
            System.out.println("Test failed!");
            //if test is failed, it is getting the image/screenshot of the failed test and shows on the report.
            // If scenario passed, it will not take the screenshot.
            byte[] screenshot = ((TakesScreenshot)Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }else{
            System.out.println("Cleanup!");
            System.out.println("Test completed!");
        }
     //after every test, closes the window
        Driver.close();
    }
}