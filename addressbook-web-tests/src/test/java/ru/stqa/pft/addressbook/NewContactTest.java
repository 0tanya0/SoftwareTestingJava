package ru.stqa.pft.addressbook;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class NewContactTest {
    FirefoxDriver wd;

    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/");
        login("admin", "secret");
    }

    private void login(String username, String password) {
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(username);
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(password);
        wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    }

    @Test
    public void testNewContactCreation() {

        gotoAddNewPage();
        fillAddNewForm(new NewContactData("Tanya", "Jr", "Loz", "user", "Home", "Canada", "+14169937617", "+14325678488", "+54636666666", "+44444444443", "loz@gmail.com", "www.test.ru", "4", "April", "1983", "7", "May", "2000", "Russia", "test", "blabla"));
        submitNewContact();
    }

    private void submitNewContact() {
        wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    }

    private void fillAddNewForm(NewContactData newContactData) {
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys(newContactData.getFirstName());

        wd.findElement(By.name("middlename")).click();
        wd.findElement(By.name("middlename")).clear();
        wd.findElement(By.name("middlename")).sendKeys(newContactData.getMiddleName());

        wd.findElement(By.name("lastname")).click();
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys(newContactData.getLastName());

        wd.findElement(By.name("nickname")).click();
        wd.findElement(By.name("nickname")).clear();
        wd.findElement(By.name("nickname")).sendKeys(newContactData.getNickName());

        wd.findElement(By.name("company")).click();
        wd.findElement(By.name("company")).clear();
        wd.findElement(By.name("company")).sendKeys(newContactData.getCompany());

        wd.findElement(By.name("address")).click();
        wd.findElement(By.name("address")).clear();
        wd.findElement(By.name("address")).sendKeys(newContactData.getAddress());

        wd.findElement(By.name("home")).click();
        wd.findElement(By.name("home")).clear();
        wd.findElement(By.name("home")).sendKeys(newContactData.getHomePhone());

        wd.findElement(By.name("mobile")).click();
        wd.findElement(By.name("mobile")).clear();
        wd.findElement(By.name("mobile")).sendKeys(newContactData.getMobilePhone());

        wd.findElement(By.name("work")).click();
        wd.findElement(By.name("work")).clear();
        wd.findElement(By.name("work")).sendKeys(newContactData.getWorkPhone());

        wd.findElement(By.name("fax")).click();
        wd.findElement(By.name("fax")).clear();
        wd.findElement(By.name("fax")).sendKeys(newContactData.getFax());

        wd.findElement(By.name("email")).click();
        wd.findElement(By.name("email")).clear();
        wd.findElement(By.name("email")).sendKeys(newContactData.getEmail());

        wd.findElement(By.name("homepage")).click();
        wd.findElement(By.name("homepage")).clear();
        wd.findElement(By.name("homepage")).sendKeys(newContactData.getHomepage());

        Select selectBDay = new Select(wd.findElement(By.xpath(".//*[@id='content']/form/select[1]")));
        selectBDay.selectByVisibleText(newContactData.getbDay());

        Select selectBMonth = new Select(wd.findElement(By.xpath(".//*[@id='content']/form/select[2]")));
        selectBMonth.selectByVisibleText(newContactData.getbMouth());

        wd.findElement(By.name("byear")).click();
        wd.findElement(By.name("byear")).clear();
        wd.findElement(By.name("byear")).sendKeys(newContactData.getbYear());

        Select selectADay = new Select(wd.findElement(By.xpath(".//*[@id='content']/form/select[3]")));
        selectADay.selectByVisibleText(newContactData.getaDay());

        Select selectAMonth = new Select(wd.findElement(By.xpath(".//*[@id='content']/form/select[4]")));
        selectAMonth.selectByVisibleText(newContactData.getaMonth());


        wd.findElement(By.name("ayear")).click();
        wd.findElement(By.name("ayear")).clear();
        wd.findElement(By.name("ayear")).sendKeys(newContactData.getaYear());

        Select selectGroup = new Select(wd.findElement(By.xpath(".//*[@id='content']/form/select[5]")));
        selectGroup.selectByIndex(1);

        wd.findElement(By.name("address2")).click();
        wd.findElement(By.name("address2")).clear();
        wd.findElement(By.name("address2")).sendKeys(newContactData.getAddress2());

        wd.findElement(By.name("phone2")).click();
        wd.findElement(By.name("phone2")).clear();
        wd.findElement(By.name("phone2")).sendKeys(newContactData.getPhone2());

        wd.findElement(By.name("notes")).click();
        wd.findElement(By.name("notes")).clear();
        wd.findElement(By.name("notes")).sendKeys(newContactData.getNotes());
    }

    private void gotoAddNewPage() {
        wd.findElement(By.linkText("add new")).click();
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
