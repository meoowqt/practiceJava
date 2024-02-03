package org.example.data_type;

public class Person {
    private String firstName, lastName;
    private int passportId;
    private Gender gender;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Person(int passportId) {
        this.passportId = passportId;
    }

    public Person(String firstName, String lastName, int passportId) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.passportId = passportId;
    }

    public Person(String firstName, String lastName, int passportId, Gender gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.passportId = passportId;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getPassportId() {
        return passportId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}