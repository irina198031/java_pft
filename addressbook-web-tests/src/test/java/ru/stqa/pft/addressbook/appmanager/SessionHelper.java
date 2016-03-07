package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by irina on 3/6/2016.
 */
public class SessionHelper extends BaseHelper {



    public SessionHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void login(String username, String password) {
        type(By.name("user"), username);
        type(By.name("pass"),password);
        click(By.cssSelector("input[type=\"submit\"]"));
    }
}
