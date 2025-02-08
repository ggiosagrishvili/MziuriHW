package project;

import java.io.*;

class Contact implements Serializable {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

    public Contact(String firstName, String lastName, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void updateFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void updateLastName(String lastName) {
        this.lastName = lastName;
    }

    public void updatePhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void updateEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Contact Information: " +
                " First Name: " + firstName + " " +
                " Last Name: " + lastName + " " +
                " Phone: " + phoneNumber + " " +
                " Email: " + email;
    }
}
