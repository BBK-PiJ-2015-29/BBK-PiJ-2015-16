print("Enter a number: ");
String str = System.console().readLine();
int input = Integer.parseInt(str);

boolean done = false;
int count = 1;
int testUp, testDown;
boolean primeUp, primeDown;
int allNums;


while (!done) {

    // get numbers to test
    testUp = input + count;
    testDown = input - count;

    //test for primes
    primeUp = true;
    allNums = 2;
    while (allNums < testUp) {
        if (testUp % allNums == 0) {
            primeUp = false;
            break;
        }
        allNums++;
    }

    primeDown = true;
    allNums = 2;
    while (allNums < testDown) {
        if (testDown % allNums == 0) {
            primeDown = false;
            break;
        }
        allNums++;
    }
    // output answer
    if (primeUp && primeDown) {
        System.out.println("BOTH DIRECTIONS");
        done = true;
    }
    if (primeUp) {
        System.out.println("Up: " + testUp);
        done = true;
    }
    if (primeDown) {
        System.out.println("Down: " + testDown);
        done = true;
    }

    count++;
}	