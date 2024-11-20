/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.ice4.Contact;
import com.mycompany.ice4.ContactManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jeffpollock
 */
public class ContactManagerTest {
    
     ContactManager contactManager;
    
    
    public ContactManagerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        // Initialize the ContactManager and its contactList with sample data
        contactManager = new ContactManager();
        contactManager.contactList = new Contact[]{
            new Contact("Jeff", "Pollock", "jeff@example.com"),
            new Contact("Bob", "Fish", "bob@example.com"),
            new Contact("Cool", "Guy", "cool@example.com"),
            null
        };
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
    // check to make sure it can find an email and return it, expecting True
    @Test
    public void testFindContactExists() {
        // Test for an existing contact
        Contact result = contactManager.findContact("bob@example.com");
        assertNotNull(result);
    }

    // check if email does not exist, return True
    @Test
    public void testFindContactDoesNotExist() {
        // Test for a non-existing contact
        Contact result = contactManager.findContact("nonexistent@example.com");
        assertNull(result);
    }
    
    // check if its an empty list expecting True
    @Test
    public void checkFindContactEmptyList(){
        contactManager.contactList = new Contact[0];
        Contact result = contactManager.findContact("jeff@example.com");
        assertNull(result);
    }
    
    // Test finding the contact at the start of the list expecting True
    @Test
    public void testFindContactAtBeginningOfList() {
        Contact result = contactManager.findContact("jeff@example.com");
        assertNotNull(result);
    }
    
    // Test finding contact at end of list, expecting True
    @Test
    public void testFindContactAtEndOfList() {
        Contact result = contactManager.findContact("cool@example.com");
        assertNotNull(result);
    }
        
}

