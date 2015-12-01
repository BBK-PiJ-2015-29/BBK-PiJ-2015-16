package q3;

public class Driver {
    public static void main(String[] args) {
        System.out.println("\nExercise 3");
        Company company = new Company();
        company.niNumbers.addItem(123);
        company.niNumbers.addItem(1234566);
        company.niNumbers.addItem(456);
        company.niNumbers.addItem(789);
        company.employeeNames.addItem("Tom");
        company.employeeNames.addItem("Dick");
        company.employeeNames.addItem("Matilda");
        company.employeeNames.addItem("Harry");
        company.niNumbers.deleteItem(1234566);
        company.employeeNames.deleteItem("Matilda");
        company.niNumbers.printList();
        company.employeeNames.printList();
    }
}
