package main.java.br.com.medium.ch_Matrix;

public class Matrix {

  String matrixAsString;
  int rowNumber;
  int columnNumber;
  
  Matrix(String matrixAsString) {
    this.matrixAsString = matrixAsString;
  }
  
  int[] getRow(int rowNumber) {
    String[] element = matrixAsString.split("\n");

        String[] matrixAsStringList = new String[element.length];
        //criação da matrix e insert;
        for (int i = 0; i < matrixAsStringList.length; i++ ) {
            matrixAsStringList[i] = element[i];
        }

        String[] stringsDeNumeros = matrixAsStringList[rowNumber - 1].split(" ");

        int[] intRow = new int[stringsDeNumeros.length];

        for (int j = 0; j <stringsDeNumeros.length; j++) {
            intRow[j] = Integer.parseInt(stringsDeNumeros[j]);
        }

        return intRow;
  }

  int[] getColumn(int columnNumber) {
    String[] element = matrixAsString.split("\n");

        String[] matrixAsStringList = new String[element.length];
        //criação da matrix e insert;
        for (int i = 0; i < matrixAsStringList.length; i++ ) {
            matrixAsStringList[i] = element[i];
        }

        int[] intColumn = new int[element.length];

        for (int j = 0; j < element.length; j++) {
            String[] stringsDeNumeros = matrixAsStringList[j].split(" ");

            intColumn[j] = Integer.parseInt(stringsDeNumeros[columnNumber - 1]);
        }

      return intColumn;
  }
}
