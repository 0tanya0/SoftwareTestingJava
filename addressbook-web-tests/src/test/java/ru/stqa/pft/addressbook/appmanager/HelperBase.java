package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by 0tanya0 on 9/26/2016.
 */
public class HelperBase {

    protected FirefoxDriver wd;

    public HelperBase(FirefoxDriver wd) {
        this.wd = wd;
    }

    protected void click(By locator) {
        wd.findElement(locator).click();
    }

    protected void type(By locator, String text) {
        WebElement element = wd.findElement(locator);
        element.clear();
        element.sendKeys(text);
    }

    protected void selectDropDownList(By locator, String text) {
        Select selectBDay = new Select(wd.findElement(locator));
        selectBDay.selectByVisibleText(text);
    }
    public boolean isAlertPresent() {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
