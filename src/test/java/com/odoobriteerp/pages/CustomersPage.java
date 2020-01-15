package com.odoobriteerp.pages;

import com.odoobriteerp.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CustomersPage extends BasePage {

    @FindBy(xpath = "//a[@data-menu='272'] ") //done
    public WebElement createBtn;

    @FindBy(xpath = "//button[@accesskey='s']")//done
    public WebElement saveBtn;

    @FindBy(xpath = "//input[@placeholder=\"Name\"]") //done
    public WebElement name;

    @FindBy(xpath = "//input[@id='o_field_input_1661']") //done
    public WebElement company;

    @FindBy(xpath = "//input[@name=\"function\"]") //done
    public WebElement jobPosition;

    @FindBy(xpath = "//input[@name=\"phone\"]") //done
    public WebElement phone;

    @FindBy(xpath = "//input[@name=\"mobile\"]") //done
    public WebElement mobile;

    @FindBy(xpath = "//input[@name=\"email\"]") //done
    public WebElement email;

    @FindBy(xpath = "//input[@name=\"website\"]") //done
    public WebElement website;

    @FindBy(xpath = "//input[@id='o_field_input_1678']") //done
    public WebElement title;

    public void CreateCustomersContact(String addCustomer) {
        BrowserUtils.wait(2);
        createBtn.click();
        BrowserUtils.wait(2);
        name.sendKeys("John Doe");

        Select select1 = new Select(company);
        select1.selectByVisibleText("CybrCo");
        BrowserUtils.wait(2);

        jobPosition.sendKeys("Sales Coordinator");
        phone.sendKeys("932-123-4354");
        mobile.sendKeys("981-212-3212");
        email.sendKeys("john.doe@aol.com");
        website.sendKeys("johndoe.com");

        Select select2 = new Select(title);
        select2.selectByVisibleText("Coordinator");
        BrowserUtils.wait(2);

        saveBtn.click();
        BrowserUtils.wait(3);

    }
    }