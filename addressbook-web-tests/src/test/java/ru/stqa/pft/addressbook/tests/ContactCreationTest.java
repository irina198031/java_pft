package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTest extends TestBase {


    @Test
    public void testContactCreation() {
        app.goToContactPage();
        app.fillContactForm(new ContactData("test3", "test4", "test5", "test6", "test7", "test8"));
        app.submitContactCreation();
        app.returnToHomePage();
    }


}
