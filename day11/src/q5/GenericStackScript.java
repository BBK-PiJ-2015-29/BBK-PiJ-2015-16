package q5;

public class GenericStackScript {

    public static void main(String[] args) {
        GenericStackScript gsc = new GenericStackScript();
        //use Integers
        gsc.launch1();

        //use Doubles
        gsc.launch2();

        //use Strings - so won't compile:
//		gsc.launch3();

    }

    public void launch1() {

        Stack<Integer> gs1 = new Stack<>();
        gs1.push(1);
        gs1.push(2);
        gs1.push(3);
        gs1.push(4);

        if (!gs1.isEmpty()) {
            System.out.println("pop: " + gs1.pop());
        } else {
            System.out.println("Stack empty");
        }
        if (!gs1.isEmpty()) {
            System.out.println("pop: " + gs1.pop());
        } else {
            System.out.println("Stack empty");
        }
        if (!gs1.isEmpty()) {
            System.out.println("pop: " + gs1.pop());
        } else {
            System.out.println("Stack empty");
        }

        gs1.push(5);
        gs1.push(6);

        if (!gs1.isEmpty()) {
            System.out.println("pop: " + gs1.pop());
        } else {
            System.out.println("Stack empty");
        }
        if (!gs1.isEmpty()) {
            System.out.println("pop: " + gs1.pop());
        } else {
            System.out.println("Stack empty");
        }
        if (!gs1.isEmpty()) {
            System.out.println("pop: " + gs1.pop());
        } else {
            System.out.println("Stack empty");
        }

        if (!gs1.isEmpty()) {
            System.out.println("pop: " + gs1.pop());
        } else {
            System.out.println("Stack empty");
        }

        gs1.push(7);
        gs1.push(8);

        if (!gs1.isEmpty()) {
            System.out.println("pop: " + gs1.pop());
        } else {
            System.out.println("Stack empty");
        }
        System.out.println("=== END ===");
    }

    public void launch2() {

        Stack<Double> gs1 = new Stack<>();
        gs1.push(1.1);
        gs1.push(2.2);
        gs1.push(3.3);
        gs1.push(4.4);

        if (!gs1.isEmpty()) {
            System.out.println("pop: " + gs1.pop());
        } else {
            System.out.println("Stack empty");
        }
        if (!gs1.isEmpty()) {
            System.out.println("pop: " + gs1.pop());
        } else {
            System.out.println("Stack empty");
        }
        if (!gs1.isEmpty()) {
            System.out.println("pop: " + gs1.pop());
        } else {
            System.out.println("Stack empty");
        }

        gs1.push(5.5);
        gs1.push(6.6);

        if (!gs1.isEmpty()) {
            System.out.println("pop: " + gs1.pop());
        } else {
            System.out.println("Stack empty");
        }
        if (!gs1.isEmpty()) {
            System.out.println("pop: " + gs1.pop());
        } else {
            System.out.println("Stack empty");
        }
        if (!gs1.isEmpty()) {
            System.out.println("pop: " + gs1.pop());
        } else {
            System.out.println("Stack empty");
        }

        if (!gs1.isEmpty()) {
            System.out.println("pop: " + gs1.pop());
        } else {
            System.out.println("Stack empty");
        }

        gs1.push(7.7);
        gs1.push(8.8);

        if (!gs1.isEmpty()) {
            System.out.println("pop: " + gs1.pop());
        } else {
            System.out.println("Stack empty");
        }
        System.out.println("=== END ===");
    }


//	launch3() means class will not compile as Node types restricted to numbers
/*	public void launch3() {

		Node<String> gs1 = new <String>Node();
		gs1.push("one");
		gs1.push("two");

		if(!gs1.isEmpty()) {
			System.out.println("pop: " + gs1.pop());
		} else {
			System.out.println("Stack empty");
		}
			
		System.out.println("=== END ===");
	}
*/


}