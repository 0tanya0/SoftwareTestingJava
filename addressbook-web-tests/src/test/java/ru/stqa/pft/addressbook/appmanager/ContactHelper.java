package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.pft.addressbook.model.NewContactData;

/**
 * Created by 0tanya0 on 9/26/2016.
 */
public class ContactHelper extends HelperBase {

    public ContactHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void submitNewContact() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
        }

    public void fillAddNewForm(NewContactData newContactData) {

        type(By.name("firstname"), newContactData.getFirstName());

        type(By.name("middlename"), newContactData.getMiddleName());

        type(By.name("lastname"), newContactData.getLastName());

        type(By.name("nickname"), newContactData.getNickName());

        type(By.name("company"), newContactData.getCompany());

        type(By.name("address"), newContactData.getAddress());

        type(By.name("home"), newContactData.getHomePhone());

        type(By.name("mobile"), newContactData.getMobilePhone());

        type(By.name("work"), newContactData.getWorkPhone());

        type(By.name("fax"), newContactData.getFax());

        type(By.name("email"), newContactData.getEmail());

        type(By.name("homepage"), newContactData.getHomepage());

        selectDropDownList(By.xpath(".//*[@id='content']/form/select[1]"), newContactData.getbDay());

        selectDropDownList(By.xpath(".//*[@id='content']/form/select[2]"), newContactData.getbMouth());

        type(By.name("byear"), newContactData.getbYear());

        selectDropDownList(By.xpath(".//*[@id='content']/form/select[3]"), newContactData.getaDay());

        selectDropDownList(By.xpath(".//*[@id='content']/form/select[4]"), newContactData.getaMonth());


        type(By.name("ayear"), newContactData.getaYear());

        selectDropDownList(By.xpath(".//*[@id='content']/form/select[5]"), newContactData.getGroup());

//        Select selectGroup = new Select(wd.findElement(By.xpath(".//*[@id='content']/form/select[5]")));
//        selectGroup.selectByIndex(1);

        type(By.name("address2"), newContactData.getAddress2());

        type(By.name("phone2"), newContactData.getPhone2());

        type(By.name("notes"), newContactData.getNotes());

    }

}
