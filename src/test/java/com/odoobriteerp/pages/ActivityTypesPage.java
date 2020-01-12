package com.odoobriteerp.pages;

import com.odoobriteerp.utilities.BrowserUtils;
import com.odoobriteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ActivityTypesPage {

    @FindBy(xpath = "//div[@class='table-responsive']/table/thead/tr/th")
    public List<WebElement> ActivityTypesColumnName;

  public ActivityTypesPage() {
      PageFactory.initElements(Driver.get(), this);
  }


    public List<String> getActivityTypesColumn() {

        return BrowserUtils.getListOfString(ActivityTypesColumnName);
    }
}
