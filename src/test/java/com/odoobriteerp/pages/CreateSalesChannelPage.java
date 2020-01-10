package com.odoobriteerp.pages;

import com.odoobriteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateSalesChannelPage {

    public CreateSalesChannelPage(){
        PageFactory.initElements(Driver.get(),this);
    }


    @FindBy(linkText = "CRM")
    public WebElement crm;

    @FindBy(xpath = "//a[@data-menu='267']")
    public WebElement salesChannel;


    @FindBy(xpath = "//button[@accesskey=\"c\"]")
    public WebElement createSalesChannel;

    @FindBy(css = "input[placeholder='Salesteam name...']")
    public WebElement salesTeamName;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[1]")
    public WebElement channelLeader;

    @FindBy(css = "input[class='o_field_char o_field_widget o_input oe_inline']")
    public WebElement eMail;

    @FindBy(xpath = "//div[@class='o_thread_message_content']")
    public WebElement message;

    @FindBy(xpath = "//div[@class='fa fa-fw o_button_icon fa-archive']")
    public WebElement archived;

    @FindBy(xpath = "//a[contains(text(),'Administrator')]")
    public WebElement admin;



}
