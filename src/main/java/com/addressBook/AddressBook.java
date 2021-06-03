package com.addressBook;

import java.util.ArrayList;
import java.util.List;

/**
 * Create Class for Defining the AddressBook
 */
public class AddressBook {
    private List<ContactPerson> contactPersonList = new ArrayList<>();

    /**
     * Create Method for adding Contacts in the Address Book
     * @return
     */
    public boolean add(ContactPerson contactPerson) {
        return this.contactPersonList.add(contactPerson);

    }

    /**
     * Create Main Method for Implementing the Address Book
     */
    public static void main(String[] args) {
        System.out.println("Welcome To AddressBook Program in AddressBook Main Class on Master Program");
    }
}
