package com.odoobriteerp.pages;


import com.odoobriteerp.utilities.BrowserUtils;
import com.odoobriteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CRM extends BasePage {

    @FindBy(xpath = "/html/body/div/main/div/form/div[3]/button")
    public WebElement login;
    @FindBy(xpath = "/html/body/nav/div[2]/ul[1]/li[5]/a/span")
    public WebElement crmModule;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[5]/ul[3]/li[3]/a/span")
    public WebElement leadsTab;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[5]/ul[3]/li[3]/ul/li[1]/a/span")
    public WebElement leadsTagTab;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/button[1]")
    public WebElement createButton;
    @FindBy(xpath = "//*[@id=\"o_field_input_164\"]")
    public WebElement TagNameInput;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[2]/button[1]")
    public WebElement saveButton;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody/tr[1]/td[1]/label")
    public WebElement newTagName;

    public void Wait() {
        wait = new WebDriverWait(Driver.get(), 10);
    }

    public WebDriverWait wait;

    public void navigateToCrmModule() {
//        wait.until(ExpectedConditions.visibilityOf(crmModule));
//        wait.until(ExpectedConditions.elementToBeClickable(crmModule));
        BrowserUtils.wait(2);
        crmModule.click();
    }
    public void clickCreateButton(){
        lastcreateButton.click();

    }
    public WebElement lastcreateButton;

    public void createNewTag(String newTag){
        BrowserUtils.wait(3);
        createButton.click();
        BrowserUtils.wait(1);
        tagNameInput.sendKeys(newTag);
        saveButton.click();
    }
    public WebElement tagNameInput;
}


