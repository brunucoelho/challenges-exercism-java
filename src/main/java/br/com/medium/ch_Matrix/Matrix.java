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
      throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
  }
}
