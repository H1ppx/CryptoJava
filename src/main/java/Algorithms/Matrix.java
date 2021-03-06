package Algorithms;

public class Matrix {

    public static double[][] multiply(double[][] m1, double[][] m2) {
        int m1ColLength = m1[0].length; // m1 columns length
        int m2RowLength = m2.length;    // m2 rows length
        if(m1ColLength != m2RowLength) return null; // matrix multiplication is not possible
        int mRRowLength = m1.length;    // m result rows length
        int mRColLength = m2[0].length; // m result columns length
        double[][] mResult = new double[mRRowLength][mRColLength];
        for(int i = 0; i < mRRowLength; i++) {         // rows from m1
            for(int j = 0; j < mRColLength; j++) {     // columns from m2
                for(int k = 0; k < m1ColLength; k++) { // columns from m1
                    mResult[i][j] += (m1[i][k] * m2[k][j]);
                }
            }
        }
        return mResult;
    }

    public static double[][] mod(double[][] matrix, int modulo){
        double[][] mResult = new double[matrix.length][matrix[0].length];
        for(int i = 0; i < matrix.length; i++) {         // rows from m1
            for(int j = 0; j < matrix[0].length; j++) {     // columns from m2
                    mResult[i][j] += matrix[i][j]%2;
            }
        }
        return mResult;
    }

    public static String toString(double[][] m) {
        String result = "";
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                result += String.format("%11.2f", m[i][j]);
            }
            result += "\n";
        }
        return result;
    }




}
