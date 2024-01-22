package org.example.data_type;

public class Person {
    private String firstName, secondName;
    private int passportId;

    public String getFirstName() {
        return firstName;
    }

    public int getPassportId() {
        return passportId;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}