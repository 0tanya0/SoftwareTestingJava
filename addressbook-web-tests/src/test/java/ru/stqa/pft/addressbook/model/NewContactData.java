package ru.stqa.pft.addressbook.model;

public class NewContactData {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String nickName;
    private final String company;
    private final String address;
    private final String homePhone;
    private final String mobilePhone;
    private final String workPhone;
    private final String fax;
    private final String email;
    private final String homepage;
    private final String bDay;
    private final String bMouth;
    private final String bYear;
    private final String aDay;
    private final String aMonth;
    private final String aYear;
    private final String address2;
    private final String phone2;
    private final String notes;

    public NewContactData(String firstName, String middleName, String lastName, String nickName, String company, String address, String homePhone, String mobilePhone, String workPhone, String fax, String email, String homepage, String bDay, String bMouth, String bYear, String aDay, String aMonth, String aYear, String address2, String phone2, String notes) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.company = company;
        this.address = address;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.workPhone = workPhone;
        this.fax = fax;
        this.email = email;
        this.homepage = homepage;
        this.bDay = bDay;
        this.bMouth = bMouth;
        this.bYear = bYear;
        this.aDay = aDay;
        this.aMonth = aMonth;
        this.aYear = aYear;
        this.address2 = address2;
        this.phone2 = phone2;
        this.notes = notes;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public String getFax() {
        return fax;
    }

    public String getEmail() {
        return email;
    }

    public String getHomepage() {
        return homepage;
    }

    public String getbDay() {
        return bDay;
    }

    public String getbMouth() {
        return bMouth;
    }

    public String getbYear() {
        return bYear;
    }

    public String getaDay() {
        return aDay;
    }

    public String getaMonth() {
        return aMonth;
    }

    public String getaYear() {
        return aYear;
    }

    public String getAddress2() {
        return address2;
    }

    public String getPhone2() {
        return phone2;
    }

    public String getNotes() {
        return notes;
    }
}
