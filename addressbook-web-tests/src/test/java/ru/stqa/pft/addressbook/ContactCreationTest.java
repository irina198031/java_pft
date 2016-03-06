package ru.stqa.pft.addressbook;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class ContactCreationTest extends TestBase {


    @Test
    public void testContactCreation() {
        goToContactPage();
        fillContactForm(new ContactData("test3", "test4", "test5", "test6", "test7", "test8"));
        submitContactCreation();
        returnToHomePage();
    }


}
