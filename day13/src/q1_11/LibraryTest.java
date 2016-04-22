package q1_11;

public class LibraryTest {

    public static void main(String[] args) {
        //make library with books and registered users
        Library bbk = new LibraryImpl("Birkbeck Library", 2);
        bbk.addBook("Monkeys", "John");
        bbk.addBook("Rugby", "Tom");
        bbk.addBook("Ballet", "Cathy");
        bbk.addBook("Java", "Bill");
        bbk.addBook("Cooking", "Mum");
        User u = new UserImpl("Anna");
        User w = new UserImpl("Ellie");
        User z = new UserImpl("Mark");
        u.register(bbk);
        w.register(bbk);
        z.register(bbk);


        //Anna.. borrow a book and return it
        System.out.println("=======================");
        System.out.println("anna.. borrow a book and return it..");
        Book borrowedBook1 = u.takeBook("Ballet");
        System.out.println("Ballet loaned to: " + bbk.userLoanedTo("Ballet"));
        System.out.println("Book returned");
        bbk.returnBook(borrowedBook1);
        System.out.println("Ballet loaned to: " + bbk.userLoanedTo("Ballet"));
        System.out.println("=======================");
        //try to borrow too many books, return one to get a new one
        System.out.println("anna.. try borrow three books, but max is 2");
        borrowedBook1 = u.takeBook("Ballet");
        Book borrowedBook2 = u.takeBook("Monkeys");
        Book borrowedBook3 = u.takeBook("Rugby");
        String[] annaBooks = u.getTitlesBorrowedArray();
        for (int i = 0; i < annaBooks.length; i++) {
            System.out.println("Book " + i + " is " + annaBooks[i]);
        }
        System.out.println("return one and then borrow a new one");
        bbk.returnBook(borrowedBook1);

        borrowedBook3 = u.takeBook("Rugby");
        annaBooks = u.getTitlesBorrowedArray();
        for (int i = 0; i < annaBooks.length; i++) {
            System.out.println("Book " + i + " is " + annaBooks[i]);
        }
        bbk.returnBook(borrowedBook2);
        bbk.returnBook(borrowedBook3);
        System.out.println("=======================");
        //several users borrow books. ask the library who has cooking.
        borrowedBook1 = u.takeBook("Monkeys");
        borrowedBook2 = u.takeBook("Rugby");
        Book borrowedBook4 = z.takeBook("Java");
        Book borrowedBook5 = z.takeBook("Cooking");
        System.out.println("Cooking loaned to: " + bbk.userLoanedTo("Cooking"));
        System.out.println("Ballet loaned to: " + bbk.userLoanedTo("Ballet"));
        System.out.println("=======================");
        //change max books to one, then zero then back to two.
        bbk.returnBook(borrowedBook4);
        System.out.println("reduce max to 1 (=> chase Anna)");
        String[] readersChase = bbk.setMaxNumberOfBooks(1);
        for (int i = 0; i < readersChase.length; i++) {
            System.out.println("Chase " + i + " is " + readersChase[i]);
        }
        System.out.println("reduce max to 0 (=> chase Anna & Mark)");
        readersChase = bbk.setMaxNumberOfBooks(0);
        for (int i = 0; i < readersChase.length; i++) {
            System.out.println("Chase " + i + " is " + readersChase[i]);
        }
        System.out.println("put max back to 2 (=> no chases)");
        readersChase = bbk.setMaxNumberOfBooks(2);
        for (int i = 0; i < readersChase.length; i++) {
            System.out.println("Chase " + i + " is " + readersChase[i]);
        }


    }


}