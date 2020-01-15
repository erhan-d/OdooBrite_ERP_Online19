package com.odoobriteerp.pages;


import com.odoobriteerp.utilities.BrowserUtils;
import com.odoobriteerp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


//everything that is in common among pages
//can go here
//for example top menu elements don't belong to specific page
//top menu appears on every single page
//so we can keep them here
public class BasePage {


        @FindBy(css = "#user-menu > a")
        public WebElement userName;

        @FindBy(linkText = "Logout")
        public WebElement logOutLink;

        @FindBy(linkText = "My User")
        public WebElement myUser;

        public BasePage() {
            //this method requires to provide webdriver object for @FindBy and page class
            PageFactory.initElements(Driver.get(), this);
        }

        /**
         * @return true if loader mask is gone, false if something went wrong
         */
        public boolean waitUntilLoaderMaskDisappear() {
            WebDriverWait wait = new WebDriverWait(Driver.get(), 30);
            try {
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[class='loader-mask shown']")));
                return true;
            } catch (NoSuchElementException e) {
                System.out.println("Loader mask not found!");
                e.printStackTrace();
                return true; // no loader mask, all good, return true
            } catch (WebDriverException e) {
                e.printStackTrace();
            }
            return false;
        }

        /**
         * This method stands for navigation in Odoo Brite ERP app
         * provide tab name, for example "Purchases" as a String
         * then based on these value, locator will be created
         *
         * @param moduleName
         */
        public void navigateTo(String moduleName) {

            String moduleLocator = "//*[normalize-space()='" + moduleName + "' and @class='oe_menu_text']";
            WebDriverWait wait = new WebDriverWait(Driver.get(), 10);

            WebElement module = Driver.get().findElement(By.xpath(moduleLocator));
            wait.until(ExpectedConditions.visibilityOf(module));
            wait.until(ExpectedConditions.elementToBeClickable(module));
            module.click();
        }

        /**
         * @return page subTitle name, for example: Requests for Quotation
         */
        public String getPageSubTitle(String titleName) {
            String titleNameLocator = "//*[normalize-space()='" + titleName + "' and @class='active']";
            WebDriverWait wait = new WebDriverWait(Driver.get(), 10);
            WebElement moduleTitleName = Driver.get().findElement(By.xpath(titleNameLocator));
            wait.until(ExpectedConditions.visibilityOf(moduleTitleName));
            return moduleTitleName.getText();

        }

        public String getUserName() {
            waitUntilLoaderMaskDisappear();
            BrowserUtils.waitForVisibility(userName, 5);
            return userName.getText();
        }

        public void logOut() {
            BrowserUtils.wait(2);
            BrowserUtils.clickWithJS(userName);
            BrowserUtils.clickWithJS(logOutLink);
        }

        public void goToMyUser() {
            waitUntilLoaderMaskDisappear();
            BrowserUtils.waitForClickablility(userName, 5).click();
            BrowserUtils.waitForClickablility(myUser, 5).click();
        }

        public void waitForPageSubTitle(String pageSubtitleText) {
            new WebDriverWait(Driver.get(), 10).until(ExpectedConditions.textToBe(By.cssSelector("h1[class='oro-subtitle']"), pageSubtitleText));
        }
    }