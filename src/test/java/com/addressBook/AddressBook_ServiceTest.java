package com.addressBook;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Create Class for Defining the AddressBook Test
 */
public class AddressBook_ServiceTest {
    /**
     * Create Method for Testing the Contacts in AddressBook
     */
    @Test
    public void givenContact_WhenAddedToAddressBook_ShouldReturnTrue() {
        ContactPerson contactPerson = new ContactPerson("Krishna","BalaRama","B Town Street",
                "Ravulapalem","AP",533274,"maddimsetti.143@gmail.com","9666917945");
        AddressBook addressBook = new AddressBook();
        boolean result = addressBook.add(contactPerson);
        Assertions.assertTrue(result);
    }
}
