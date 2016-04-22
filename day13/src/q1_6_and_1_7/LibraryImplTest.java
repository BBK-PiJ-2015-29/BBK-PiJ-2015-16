package q1_6_and_1_7;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class LibraryImplTest {

    //test from BookImplTest

    User u;

    //tests from UserImplTest
    User z;
    Library bbk;

    @Test
    public void testBookConstructorAndGetters() {
        Book b = new BookImpl("Food", "Mark");
        assertEquals("Mark", b.getAuthor());
        assertEquals("Food", b.getTitle());
    }

    @Before
    public void setUp() {
        u = new UserImpl("Anna");
        z = new UserImpl("Mark");
        bbk = new LibraryImpl("Birkbeck", 3);
    }

    // tests for 1.1 and 1.2

    @Test
    public void testConstructorAndGetterForName() {
        assertEquals("Anna", u.getName());
    }

    @Test
    public void testGetterForIDBeforeIDSet() {
        assertEquals(0, u.getID());
    }

    @Test
    public void testGetterForIDAfterIDSet() {
        u.setID(11);
        assertEquals(11, u.getID());
    }

    // additional tests for 1.3

    @Test
    public void testGetLibrary() {
        u.register(bbk);
        assertEquals(bbk, u.getLibrary());
    }

    @Test
    public void testRegisterGetsTheUserID1() {
        u.register(bbk);
        assertEquals(1, u.register(bbk));
        assertEquals(1, u.getID());
    }

    //additional tests for 1.4 Library's constructor

    @Test
    public void testsSettingNameOfLibraryInConstructor() {
        assertEquals("Birkbeck", bbk.getLibrary());
    }

    @Test
    public void testSettingMaxNumberOfBooksToThreeInConstructor() {
        assertEquals(3, bbk.getMaxNumberOfBooks());
    }

    @Test
    public void testSettingMaxNumberOfBooksToFiveAtAnyTime() {
        bbk.setMaxNumberOfBooks(5);
        assertEquals(5, bbk.getMaxNumberOfBooks());
    }

    //additional tests for 1.5 getId(String) in Library

    @Test
    public void testsCreatingANewIDForANewUser() {
        assertEquals(1, bbk.getID("Mark"));
        assertEquals(2, bbk.getID("Ellie"));
    }

    @Test
    public void testsGettingAnIDForAnExistingUser() {
        u.register(bbk);
        z.register(bbk);
        assertEquals(1, bbk.getID("Anna"));
        assertEquals(2, bbk.getID("Mark"));
    }

    @Test
    public void testsSubsequentIDSame() {
        u.register(bbk);
        z.register(bbk);
        assertEquals(1, bbk.getID("Anna"));
        assertEquals(2, bbk.getID("Mark"));
        assertEquals(1, bbk.getID("Anna"));
    }


    // tests for 1.6 - add, take and return book

    @Test
    public void testAddNewBookAndTakeAvailableBook() {
        bbk.addBook("Monkeys", "John");
        assertEquals("John", bbk.takeBook("Monkeys").getAuthor());
    }

    @Test
    public void testAddTwoNewBookAndTakeBothAvailableBooks() {
        bbk.addBook("Monkeys", "John");
        bbk.addBook("Rugby", "Tom");
        assertEquals("John", bbk.takeBook("Monkeys").getAuthor());
        assertEquals("Tom", bbk.takeBook("Rugby").getAuthor());
    }


    @Test
    public void testTakeNonAvailableBookGetNull() {
        bbk.addBook("Monkeys", "John");
        bbk.addBook("Rugby", "Tom");
        Book borrowedBook1 = bbk.takeBook("Monkeys");
        assertEquals("John", borrowedBook1.getAuthor());
        assertNull(bbk.takeBook("Monkeys"));
    }


    @Test
    public void testTakBookThatHasBeenReturned() {
        bbk.addBook("Monkeys", "John");
        bbk.addBook("Rugby", "Tom");
        Book borrowedBook1 = bbk.takeBook("Monkeys");
        bbk.returnBook(borrowedBook1);
        assertEquals("John", bbk.takeBook("Monkeys").getAuthor());
    }

    @Test
    public void testsGettingReaderCountatZero() {
        assertEquals(0, bbk.getReaderCount());
    }

    @Test
    public void testsGettingReaderCountatTwo() {
        u.register(bbk);
        z.register(bbk);
        assertEquals(2, bbk.getReaderCount());
    }

    @Test
    public void testsGettingBookCountatZero() {
        assertEquals(0, bbk.getBookCount());
    }

    @Test
    public void testsGettingBookCountatTwo() {
        bbk.addBook("Monkeys", "John");
        bbk.addBook("Rugby", "Tom");
        assertEquals(2, bbk.getBookCount());
    }

    @Test
    public void testsGettingBookBorrowedCountatZeroEmptyLibrary() {
        assertEquals(0, bbk.getBookBorrowedCount());
    }

    @Test
    public void testsGettingBookBorrowedCountatNonEmptyLibrary() {
        bbk.addBook("Monkeys", "John");
        bbk.addBook("Rugby", "Tom");
        assertEquals(0, bbk.getBookBorrowedCount());
    }

    @Test
    public void testsGettingBookBorrowedCountAfterBorrow() {
        bbk.addBook("Monkeys", "John");
        bbk.addBook("Rugby", "Tom");
        Book borrowedBook1 = bbk.takeBook("Monkeys");
        assertEquals(1, bbk.getBookBorrowedCount());
    }

    @Test
    public void testsGettingBookBorrowedCountAfterBorrowAndReturn() {
        bbk.addBook("Monkeys", "John");
        bbk.addBook("Rugby", "Tom");
        Book borrowedBook1 = bbk.takeBook("Monkeys");
        bbk.returnBook(borrowedBook1);
        assertEquals(0, bbk.getBookBorrowedCount());
    }

}	









































