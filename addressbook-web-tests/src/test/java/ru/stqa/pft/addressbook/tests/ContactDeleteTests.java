package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by 0tanya0 on 10/14/2016.
 */
public class ContactDeleteTests extends TestBase{

    @Test
    public void testContactDelete(){
        app.getContactHelper().selectCheckboxFirstContact();
        app.getContactHelper().submitContactDelete();
        app.getContactHelper().closeDeleteAlert();
    }

}
