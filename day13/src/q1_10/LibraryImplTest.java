package q1_10;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
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
        u.register(bbk);
        bbk.addBook("Monkeys", "John");
        assertEquals("John", u.takeBook("Monkeys").getAuthor());
    }

    @Test
    public void testAddTwoNewBookAndTakeBothAvailableBooks() {
        u.register(bbk);
        bbk.addBook("Monkeys", "John");
        bbk.addBook("Rugby", "Tom");
        assertEquals("John", u.takeBook("Monkeys").getAuthor());
        assertEquals("Tom", u.takeBook("Rugby").getAuthor());
    }


    @Test
    public void testTakeNonAvailableBookGetNull() {
        u.register(bbk);
        bbk.addBook("Monkeys", "John");
        bbk.addBook("Rugby", "Tom");
        Book borrowedBook1 = u.takeBook("Monkeys");
        assertEquals("John", borrowedBook1.getAuthor());
        assertNull(u.takeBook("Monkeys"));
    }


    @Test
    public void testTakBookThatHasBeenReturned() {
        u.register(bbk);
        bbk.addBook("Monkeys", "John");
        bbk.addBook("Rugby", "Tom");
        Book borrowedBook1 = u.takeBook("Monkeys");
        bbk.returnBook(borrowedBook1);
        assertEquals("John", u.takeBook("Monkeys").getAuthor());
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
        u.register(bbk);
        bbk.addBook("Monkeys", "John");
        bbk.addBook("Rugby", "Tom");
        Book borrowedBook1 = u.takeBook("Monkeys");
        assertEquals(1, bbk.getBookBorrowedCount());
    }

    @Test
    public void testsGettingBookBorrowedCountAfterBorrowAndReturn() {
        u.register(bbk);
        bbk.addBook("Monkeys", "John");
        bbk.addBook("Rugby", "Tom");
        Book borrowedBook1 = u.takeBook("Monkeys");
        bbk.returnBook(borrowedBook1);
        assertEquals(0, bbk.getBookBorrowedCount());
    }

    @Test
    public void testsArrayOfTitleOfBooksBorrowedByAUser() {
        u.register(bbk);
        bbk.addBook("Monkeys", "John");
        bbk.addBook("Rugby", "Tom");
        Book borrowedBook1 = u.takeBook("Monkeys");
        Book borrowedBook2 = u.takeBook("Rugby");
        String[] expected;
        expected = new String[2];
        expected[0] = "Monkeys";
        expected[1] = "Rugby";
        assertArrayEquals(expected, u.getTitlesBorrowedArray());
    }

    @Test
    public void testsArrayOfTitleOfBooksBorrowedByAUserWhenNone() {
        u.register(bbk);
        bbk.addBook("Monkeys", "John");
        bbk.addBook("Rugby", "Tom");
        assertNull(u.getTitlesBorrowedArray());
    }

    @Test
    public void testsArrayOfTitleOfBooksBorrowedByAUserAfterAReturn() {
        u.register(bbk);
        bbk.addBook("Monkeys", "John");
        bbk.addBook("Rugby", "Tom");
        Book borrowedBook1 = u.takeBook("Monkeys");
        Book borrowedBook2 = u.takeBook("Rugby");
        bbk.returnBook(borrowedBook1);
        String[] expected;
        expected = new String[1];
        expected[0] = "Rugby";
        assertArrayEquals(expected, u.getTitlesBorrowedArray());
    }

    @Test
    public void testsArrayOfAllUsers() {
        u.register(bbk);
        z.register(bbk);
        String expected[];
        expected = new String[5];
        expected[0] = "Anna";
        expected[1] = "Mark";
        assertArrayEquals(expected, bbk.userArray());
    }

    @Test
    public void testsArrayOfUsersCurrentlyBorrowingBooks() {
        u.register(bbk);
        z.register(bbk);
        bbk.addBook("Monkeys", "John");
        bbk.addBook("Rugby", "Tom");
        Book borrowedBook1 = u.takeBook("Monkeys");
        Book borrowedBook2 = z.takeBook("Rugby");
        String expected[];
        expected = new String[5];
        expected[0] = "Anna";
        expected[1] = "Mark";
        assertArrayEquals(expected, bbk.userBorrowingArray());
    }


    @Test
    public void testsWhoIsBorrowingRugbyBook() {
        u.register(bbk);
        z.register(bbk);
        bbk.addBook("Monkeys", "John");
        bbk.addBook("Rugby", "Tom");
        Book borrowedBook1 = u.takeBook("Monkeys");
        Book borrowedBook2 = z.takeBook("Rugby");
        String expected = "Mark";
        assertEquals(expected, bbk.userLoanedTo("Rugby"));
    }

    @Test
    public void testsWhoIsBorrowingRugbyBookNoOne() {
        u.register(bbk);
        z.register(bbk);
        bbk.addBook("Monkeys", "John");
        bbk.addBook("Rugby", "Tom");
        Book borrowedBook1 = u.takeBook("Monkeys");
        assertNull(bbk.userLoanedTo("Rugby"));
    }

    @Test
    public void testsWhoIsBorrowingBalletBookDoesntExist() {
        assertNull(bbk.userLoanedTo("Ballet"));
    }

    @Test
    public void testMaxNumberOfBooksTwo() {
        u.register(bbk);
        z.register(bbk);
        bbk.addBook("Monkeys", "John");
        bbk.addBook("Rugby", "Tom");
        bbk.addBook("Ballet", "Cathy");
        bbk.addBook("Java", "Bill");
        bbk.addBook("booka", "adssa");
        Book borrowedBook1 = u.takeBook("Monkeys");
        Book borrowedBook2 = u.takeBook("Rugby");
        Book borrowedBook3 = u.takeBook("Ballet");
        Book borrowedBook4 = z.takeBook("Java");
        Book borrowedBook5 = z.takeBook("booka");
        String[] expected = new String[5];
        expected[0] = "Anna";
        assertArrayEquals(expected, bbk.setMaxNumberOfBooks(2));
    }

    @Test
    public void testMaxNumberOfBooksOne() {
        u.register(bbk);
        z.register(bbk);
        bbk.addBook("Monkeys", "John");
        bbk.addBook("Rugby", "Tom");
        bbk.addBook("Ballet", "Cathy");
        bbk.addBook("Java", "Bill");
        bbk.addBook("booka", "adssa");
        Book borrowedBook1 = u.takeBook("Monkeys");
        Book borrowedBook2 = u.takeBook("Rugby");
        Book borrowedBook3 = u.takeBook("Ballet");
        Book borrowedBook4 = z.takeBook("Java");
        Book borrowedBook5 = z.takeBook("booka");
        String[] expected = new String[5];
        expected[0] = "Anna";
        expected[1] = "Mark";
        assertArrayEquals(expected, bbk.setMaxNumberOfBooks(1));
    }

    @Test
    public void testMaxNumberOfBooksZero() {
        u.register(bbk);
        z.register(bbk);
        bbk.addBook("Monkeys", "John");
        bbk.addBook("Rugby", "Tom");
        bbk.addBook("Ballet", "Cathy");
        bbk.addBook("Java", "Bill");
        bbk.addBook("booka", "adssa");
        Book borrowedBook1 = u.takeBook("Monkeys");
        Book borrowedBook2 = u.takeBook("Rugby");
        Book borrowedBook3 = u.takeBook("Ballet");
        Book borrowedBook4 = z.takeBook("Java");
        Book borrowedBook5 = z.takeBook("booka");
        String[] expected = new String[5];
        expected[0] = "Anna";
        expected[1] = "Mark";
        assertArrayEquals(expected, bbk.setMaxNumberOfBooks(0));
    }

    @Test
    public void testMaxNumberOfBooksEmpty() {
        u.register(bbk);
        z.register(bbk);
        bbk.addBook("Monkeys", "John");
        bbk.addBook("Rugby", "Tom");
        bbk.addBook("Ballet", "Cathy");
        bbk.addBook("Java", "Bill");
        bbk.addBook("booka", "adssa");
        Book borrowedBook3 = u.takeBook("Ballet");
        Book borrowedBook4 = z.takeBook("Java");
        Book borrowedBook5 = z.takeBook("booka");
        String[] expected = new String[5];
        assertArrayEquals(expected, bbk.setMaxNumberOfBooks(2));
    }


}	









































