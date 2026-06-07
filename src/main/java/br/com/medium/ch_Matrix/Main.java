package main.java.br.com.medium.ch_Matrix;

public class Main {
    public static void main(String[] args) {

        String matrixAsString = "89 1903 3\n18 3 1\n9 4 800";

        Matrix matrix = new Matrix(matrixAsString);

        System.out.println(matrix.getRow(2));

        // int rowNumber = 2;

        // String[] element = matrixAsString.split("\n");

        // String[] matrixAsStringList = new String[element.length];
        // //criação da matrix e insert;
        // for (int i = 0; i < matrixAsStringList.length; i++ ) {
        //     matrixAsStringList[i] = element[i];
        // }
        
        // String[] stringsDeNumeros = matrixAsStringList[rowNumber - 1].split(" ");

        // int[] intRow = new int[stringsDeNumeros.length];

        // for (int j = 0; j <stringsDeNumeros.length; j++) {
        //     intRow[j] = Integer.parseInt(stringsDeNumeros[j]);
        // }

        // System.out.println(intRow);



    }}



