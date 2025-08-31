import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {
    @Test
    void testAddNewContact() {
        PhoneBook pb = new PhoneBook();
        assertEquals(1, pb.add("Alice", "123"));
        assertEquals(2, pb.add("Bob", "456"));
    }

    @Test
    void testAddDuplicateName() {
        PhoneBook pb = new PhoneBook();
        pb.add("Alice", "123");
        assertEquals(1, pb.add("Alice", "999"));
    }

    @Test
    void testFindByNumber() {
        PhoneBook pb = new PhoneBook();
        pb.add("Alice", "123");
        pb.add("Bob", "456");
        assertEquals("Alice", pb.findByNumber("123"));
        assertEquals("Bob", pb.findByNumber("456"));
    }

    @Test
    void testFindByNumberNotFound() {
        PhoneBook pb = new PhoneBook();
        assertNull(pb.findByNumber("999"));
    }

    @Test
    void testFindByName() {
        PhoneBook pb = new PhoneBook();
        pb.add("Alice", "123");
        pb.add("Bob", "456");
        assertEquals("123", pb.findByName("Alice"));
        assertEquals("456", pb.findByName("Bob"));
    }

    @Test
    void testFindByNameNotFound() {
        PhoneBook pb = new PhoneBook();
        assertNull(pb.findByName("Charlie"));
    }

    @Test
    void testPrintAllNames() {
        PhoneBook pb = new PhoneBook();
        pb.add("Bob", "456");
        pb.add("Alice", "123");
        pb.add("Charlie", "789");
        assertEquals("Alice\nBob\nCharlie", pb.printAllNames());
    }

    @Test
    void testPrintAllNamesEmpty() {
        PhoneBook pb = new PhoneBook();
        assertEquals("", pb.printAllNames());
    }
}