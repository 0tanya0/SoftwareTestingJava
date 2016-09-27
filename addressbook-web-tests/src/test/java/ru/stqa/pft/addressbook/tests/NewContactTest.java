package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.NewContactData;

public class NewContactTest extends TestBase{

    @Test
    public void testNewContactCreation() {

        app.getNavigationHelper().gotoAddNewPage();
        app.getContactHelper().fillAddNewForm(new NewContactData("Tanya", "Jr", "Loz", "user", "Home", "Canada", "+14169937617", "+14325678488", "+54636666666", "+44444444443", "loz@gmail.com", "www.test.ru", "4", "April", "1983", "7", "May", "2000", "[none]", "Russia", "test", "blabla"));
        app.getContactHelper().submitNewContact();
    }


}
