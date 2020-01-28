import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BookTest {

    Book SUT;

    @Before
    public void setup() {
        SUT = new Book("Eragon", "Christopher Paolini");
    }

    @Test
    public void borrowBook() {
        SUT.borrowBook();
        assertEquals(SUT.isBookBorrowed(), true);
    }

    @Test
    public void returnBook() {
        SUT.borrowBook();
        SUT.returnBook();
        assertEquals(SUT.isBookBorrowed(), false);
    }
}