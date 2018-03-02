package Ciphers;

import Algorithms.Matrix;

public class Hamming {

    public static double[][] encrypt(double[][] matrix){

        final double[][] generatorMatrix = {
                {1,1,1,0,0,0,0},
                {1,0,0,1,1,0,0},
                {0,1,0,1,0,1,0},
                {1,1,0,1,0,0,1}};

        matrix = Matrix.mod(Matrix.multiply(matrix, generatorMatrix),2);
        return matrix;
    }

    public static double[][] decrypt(double[][] matrix){

        final double[][] parityCheckMatrix = {
                {0,0,1},
                {0,1,0},
                {0,1,1},
                {1,0,0},
                {1,0,1},
                {1,1,0},
                {1,1,1}
        };

       double[][] syndrome =  Matrix.mod(Matrix.multiply(matrix, parityCheckMatrix),2);

       matrix = findError(matrix,syndrome);

       return matrix;
    }

    private static double[][] findError(double[][] matrix, double[][] syndrome){
        int errorBit = 0;
        if(syndrome[0][0] == 1){
            errorBit += 4;
        }

        if(syndrome[0][1] == 1){
            errorBit += 2;
        }

        if(syndrome[0][2] == 1){
            errorBit += 1;
        }

        if (errorBit != 0){
            matrix[0][errorBit-1] = (matrix[0][errorBit-1]+1)%2;
        }

        return matrix;
    }

}
