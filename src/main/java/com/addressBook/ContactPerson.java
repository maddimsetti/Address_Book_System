package com.addressBook;

public class ContactPerson {
    //variables
    String firstName, lastName, address, city, state, eMail, phoneNumber;
    int zipCode;

    /**
     * Create Constructor for Initializing the objects
     */
    public ContactPerson(String firstName, String lastName, String address, String city, String state,
                       int zipCode, String eMail, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "ContactPerson{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", eMail='" + eMail + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
