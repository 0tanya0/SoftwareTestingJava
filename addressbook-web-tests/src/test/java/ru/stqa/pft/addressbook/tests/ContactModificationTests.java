package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ModifyContactData;
import ru.stqa.pft.addressbook.model.NewContactData;

/**
 * Created by 0tanya0 on 10/15/2016.
 */
public class ContactModificationTests extends TestBase{

    @Test
    public void testContactModification(){
        app.getContactHelper().submitFirstContactEdit();
        app.getContactHelper().changeContact(new ModifyContactData("Tanya", "Jr", "Loz", "user", "Home", "Canada", "+14169937617", "+14325678488", "+54636666666", "+44444444443", "loz@gmail.com", "www.test.ru", "4", "April", "1983", "7", "May", "2000", "Russia", "test", "blabla"));
        app.getContactHelper().submitUpdateContact();
    }
}
