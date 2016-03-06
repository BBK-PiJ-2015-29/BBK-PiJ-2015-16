package codeflow;

/*

user input is 0

10 	- remove the 1
11 	get(0)... prints "2"
12	- remove the 2
13 	get(0)... prints "3"
14 	- remove the 3
15	get(0)... prints "4"
16	- remove the 4
17	get(0)... prints "5"
18 	- remove the 5
19 	get(0)... prints "6"
20 - remove the 6
21	get(0)... BANG - prints Stack Trace

user input is 2

10	- remove the 1
11 	get(2)... prints the "4"
12	- remove the 2
13	get(2)... prints the "5"
14	- remove the 3
15	get(2)... prints the "6"
16	- remove the 4
17	get(2)... BANG - prints Stack Trace


user input is 4

10 	- remove the 1
11	get(4)... prints the "6"
12	- remove the 2
13	get(4)... BANG - prints Stack Trace

user input is 6

10	- remove the 1
11	get(6)... BANK - prints Stack Trace


*/


import java.util.ArrayList;
import java.util.List;

public class CodeFlow {

    public static void main(String... args) {
        CodeFlow cf = new CodeFlow();
        cf.launch(6);
    }

    public void launch(int userInput) {

        List<Integer> intList = new ArrayList<>();
        for (int i = 1; i < 7; i++)
            intList.add(i);

        try {
            // designed to break
            for (int i = 1; i < 10; i++)
                intList.remove(0);
            System.out.println(intList.get(userInput));
        } catch (IndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }
    }
}