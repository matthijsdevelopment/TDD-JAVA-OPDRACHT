import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ContactsManagerTest {

    ContactsManager SUT;

    @Before
    public void setup() {
        SUT = new ContactsManager();
    }

    @Test
    public void addContact_contactAdded_returnedInt() {
        // Create a new Contact object for James
        Contact friendJames = new Contact();
        // Set the fields
        friendJames.name = "James";
        friendJames.phoneNumber = "0012223333";
        // Add James Contact to the ContactsManager
        SUT.addContact(friendJames);
        int result = SUT.getFriendsCount();
        assertEquals(result, 1);
    }

    @Test
    public void searchContact_NameFound_returnedName() {
        // Create a new Contact object for James
        Contact friendJames = new Contact();
        // Set the fields
        friendJames.name = "James";
        friendJames.phoneNumber = "0012223333";
        // Add James Contact to the ContactsManager
        SUT.addContact(friendJames);
        String resultNaam = friendJames.getName();
        assertEquals(resultNaam, "James");
    }

    @Test
    public void searchContact_numberFound_returnedNumber() {
        // Create a new Contact object for James
        Contact friendJames = new Contact();
        // Set the fields
        friendJames.name = "James";
        friendJames.phoneNumber = "0012223333";
        // Add James Contact to the ContactsManager
        SUT.addContact(friendJames);
        String resultNumber = friendJames.getPhoneNumber();
        assertEquals(resultNumber, "0012223333");
    }
}