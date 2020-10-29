package miniProjects.miniProject2.model;

import miniProjects.miniProject2.controller.Formatter;

public class Contact {

    private String fullName;

    private String email;

    private Long mobilePhoneNumber;

    private Long workPhoneNumber;

    private Long homePhoneNumber;

    private String city;

    public Contact(String fullName, Long mobilePhoneNumber, Long workPhoneNumber, Long homePhoneNumber, String city) {
        this.fullName = fullName;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.workPhoneNumber = workPhoneNumber;
        this.homePhoneNumber = homePhoneNumber;
        this.city = city;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public String getMobileFormated() {
        Formatter format = new Formatter();
        return format.phoneNumberCanada(this.mobilePhoneNumber);
    }

    public void setMobilePhoneNumber(Long mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public Long getWorkPhoneNumber() {
        return workPhoneNumber;
    }

    public String getWorkFormated() {
        Formatter format = new Formatter();
        return format.phoneNumberCanada(this.workPhoneNumber);
    }

    public void setWorkPhoneNumber(Long workPhoneNumber) {
        this.workPhoneNumber = workPhoneNumber;
    }

    public Long getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public String getHomeFormated() {
        Formatter format = new Formatter();
        return format.phoneNumberCanada(this.homePhoneNumber);
    }

    public void setHomePhoneNumber(Long homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public String printDetailContact() {
        StringBuilder builder = new StringBuilder();

        builder.append("<" + fullName + "> ");
        builder.append("(mobile = " + getMobileFormated());
        if (workPhoneNumber != null) {
            builder.append(", work = " + getWorkFormated());
        }
        if (homePhoneNumber != null) {
            builder.append(", home = " + getHomeFormated());
        }
        if (city != null) {
            builder.append(", city = " + city);
        }
        builder.append(")");

        return builder.toString();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Name = " + fullName + "\n");
        builder.append("mobile = " + getMobileFormated() + "\n");
        if (workPhoneNumber != null) {
            builder.append("work = " + getWorkFormated() + "\n");
        }
        if (homePhoneNumber != null) {
            builder.append("home = " + getHomeFormated() + "\n");
        }
        if (city != null) {
            builder.append("city = " + city);
        }
        return builder.toString();
    }
}
