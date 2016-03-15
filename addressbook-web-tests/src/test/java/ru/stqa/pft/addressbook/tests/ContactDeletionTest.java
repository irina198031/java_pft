package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by irina on 3/14/2016.
 */
public class ContactDeletionTest extends TestBase {

    @Test
    public void testContactDeletion() {
        app.getNavigationHelper().goToHomePage();
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContacts();
        app.getContactHelper().closeAlertWindow();
        

    }
}
