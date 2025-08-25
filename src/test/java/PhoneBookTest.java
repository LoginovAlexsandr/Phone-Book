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
        assertEquals(1, pb.add("Alice", "999")); // Должен не добавлять, размер остается 1
    }
}