package symmetry;

public class MatrixChecker {

    public int[] makeRow() {
        int[] rowToTest = {1, 2, 3, 3, 2, 1};
        return rowToTest;
    }

    private boolean isSymmetrical(int[] rowToTest) {
        for (int i = 0; i < rowToTest.length; i++) {
            if (rowToTest[i] != rowToTest[rowToTest.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }


    public boolean isSymmetrical(int[][] arrayToTest) {
        for (int i = 0; i < arrayToTest.length; i++) {
            for (int j = 0; j < arrayToTest[0].length; j++) {
                if (arrayToTest[i][j] != arrayToTest[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isTriangular(int[][] arrayToTest) {
        for (int i = 0; i < arrayToTest.length; i++) {
            for (int j = 0; j < arrayToTest[0].length; j++) {
                if (i > j && arrayToTest[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}