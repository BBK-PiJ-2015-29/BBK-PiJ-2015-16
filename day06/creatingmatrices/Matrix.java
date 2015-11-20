package creatingmatrices;

public class Matrix {

    private int[][] myArray;

    private void Matrix(int x, int y) {
        myArray = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                myArray[i][j] = 1;
            }
        }
    }

    private void prettyPrint() {
        System.out.println();
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[0].length; j++) {
                System.out.print(myArray[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void setElement(int x, int y, int newValue) {
        if (isValid(x, y)) {
            myArray[x][y] = newValue;
        }
    }

    private void setRow(int x, String str) {
        //return if string not number comma format
        if (!isValid(str)) {
            return;
        }
        //return if string has wrong number of numbers for array
        if (countNumbers(str) != myArray[0].length) {
            return;
        }
        //make the string into an array of numbers
        int[] inputArray;
        inputArray = new int[countNumbers(str)];
        inputArray = makeNumberArray(str);
        //place the new row in the matrix
        for (int i = 0; i < myArray[0].length; i++) {
            myArray[x][i] = inputArray[i];
        }
    }

    private void setColumn(int x, String str) {
        //return if string not number comma format
        if (!isValid(str)) {
            return;
        }
        //return if string has wrong number of numbers for array
        if (countNumbers(str) != myArray.length) {
            return;
        }
        //make the string into an array of numbers
        int[] inputArray;
        inputArray = new int[countNumbers(str)];
        inputArray = makeNumberArray(str);
        //place the new row in the matrix
        for (int i = 0; i < myArray.length; i++) {
            myArray[i][x] = inputArray[i];
        }
    }

    private boolean isValid(int x, int y) {
        if (x < myArray.length && y < myArray[0].length) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isValid(String str) {
        if (str == "") {
            return false;
        }
        int i = 0;
        boolean valid = false;
        if (Character.isDigit(str.charAt(0)) &&
                Character.isDigit(str.charAt(str.length() - 1))) {
            valid = true;
        }
        while (valid && i < str.length()) {
            if (Character.isDigit(str.charAt(i)) ||
                    str.charAt(i) == ',') {
                valid = true;
            } else {
                valid = false;
            }
            i++;
        }
        return valid;
    }

    private int countNumbers(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ',') {
                result++;
            }
        }
        return result + 1;
    }

    private int[] makeNumberArray(String str) {
        int[] resultArray;
        resultArray = new int[countNumbers(str)];
        //get each number
        int j = 0;
        for (int i = 0; i < countNumbers(str); i++) {
            String strNum = "";
            while (str.charAt(j) != ',') {
                strNum = strNum + str.charAt(j);
                j++;
                if (j == str.length()) {
                    break;
                }
            }
            j++;
            resultArray[i] = Integer.parseInt(strNum);
        }
        return resultArray;
    }

    private String toAString() {
        String result = "[";
        String k;
        for (int i = 0; i < myArray.length; i++) {

            for (int j = 0; j < myArray[0].length; j++) {
                k = Integer.toString(myArray[i][j]);
                result += k;
                if (j < myArray[0].length - 1) {
                    result += ",";
                }
            }
            if (i < myArray.length - 1) {
                result += ";";
            }
        }
        result += "]";
        return result;
    }


}
