/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ice4;

/**
 *
 * @author jeffpollock
 */
public class ContactManager {

    public ContactManager() {
    }
    
    public Contact[] contactList;

    /*
	Locate a Contact record that matches the email address provided.
	Returns the Contact record if found, null if not found.
    */
    public Contact findContact(String emailAddress) {
    for (int i = 0; i < contactList.length; i++) {
        if (contactList[i] != null && contactList[i].getEmailAddress()
                .equals(emailAddress)) {
            return contactList[i]; // Return the Contact if a match is found
        }
    }
    return null; // Return null if no match is found
}


    /*
	 Removes all contacts
    */
	public void clearContacts() {
       for (int i = 0; i < contactList.length; i++) {
        contactList[i] = null;
    }
}


    
}
