package employee

// get names and IDs of employees, each in an array.
// 10 employees.
// loop through both and print names and ids of those starting with J or S


String[] empName;
empName = new String[10];
int[] idNum;
idNum = new int[10];

System.out.println();
System.out.println("Enter the employees & their IDs");
for (i = 0; i <= 9; i++) {
    System.out.print("Employee " + (i + 1) + " Name: ");
    empName[i] = System.console().readLine();
    System.out.print("ID number: ");
    idNum[i] = Integer.parseInt(System.console().readLine());
}

System.out.println();
System.out.println("Staff with names starting J or S");
System.out.println();

for (i = 0; i <= empName.length; i++) {
    if (empName[i].charAt(0) == 'J' || empName[i].charAt(0) == 'S') {
        System.out.println("- " + empName[i] + " ID: " + idNum[i]);
    }
}
