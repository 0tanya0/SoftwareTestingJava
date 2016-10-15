package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.pft.addressbook.model.ModifyContactData;
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

    public void selectCheckboxFirstContact() {
        click(By.xpath(".//*[@id='maintable']//tr[2]//input"));
    }

    public void submitContactDelete() {
        click(By.xpath(".//input[@value='Delete']"));
    }

    public void closeDeleteAlert() {
        wd.switchTo().alert().accept();
    }

    public void submitFirstContactEdit() {
        click(By.xpath(".//*[@id='maintable']//tr[2]//img[@title='Edit']"));
    }

    public void submitUpdateContact() {
        click(By.xpath(".//input[@value='Update'][1]"));
    }

    public void changeContact(ModifyContactData modifyContactData) {
        type(By.name("firstname"), modifyContactData.getFirstName());

        type(By.name("middlename"), modifyContactData.getMiddleName());

        type(By.name("lastname"), modifyContactData.getLastName());

        type(By.name("nickname"), modifyContactData.getNickName());

        type(By.name("company"), modifyContactData.getCompany());

        type(By.name("address"), modifyContactData.getAddress());

        type(By.name("home"), modifyContactData.getHomePhone());

        type(By.name("mobile"), modifyContactData.getMobilePhone());

        type(By.name("work"), modifyContactData.getWorkPhone());

        type(By.name("fax"), modifyContactData.getFax());

        type(By.name("email"), modifyContactData.getEmail());

        type(By.name("homepage"), modifyContactData.getHomepage());

        selectDropDownList(By.xpath(".//*[@id='content']/form/select[1]"), modifyContactData.getbDay());

        selectDropDownList(By.xpath(".//*[@id='content']/form/select[2]"), modifyContactData.getbMouth());

        type(By.name("byear"), modifyContactData.getbYear());

        selectDropDownList(By.xpath(".//*[@id='content']/form/select[3]"), modifyContactData.getaDay());

        selectDropDownList(By.xpath(".//*[@id='content']/form/select[4]"), modifyContactData.getaMonth());


        type(By.name("ayear"), modifyContactData.getaYear());

        type(By.name("address2"), modifyContactData.getAddress2());

        type(By.name("phone2"), modifyContactData.getPhone2());

        type(By.name("notes"), modifyContactData.getNotes());
    }
}
