package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by irina on 3/14/2016.
 */
public class ContactDeletionTest extends TestBase {

    @Test(enabled = false)
    public void testContactDeletion() {

        app.getNavigationHelper().goToHomePage();
        int before = app.getContactHelper().getContactCount();
        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("test3", "test4", "test5", "test6", "test7", "test8", "test1"));
        }

        app.getContactHelper().selectContact(before - 1);
        app.getContactHelper().deleteSelectedContacts();
        app.getContactHelper().closeAlertWindow();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before - 1);


    }
}
