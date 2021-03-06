package ru.stqa.pft.addressbook.model;

public class ContactData {
    private final String firstname;
    private final String lastname;
    private final String company;
    private final String address;
    private final String home;
    private final String address2;
    private String group;

    public ContactData(String firstname, String lastname, String company, String address, String home, String address2, String group) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.company = company;
        this.address = address;
        this.home = home;
        this.address2 = address2;
        this.group = group;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getHome() {
        return home;
    }

    public String getAddress2() {
        return address2;
    }

    public String getGroup() {
        return group;
    }
}
