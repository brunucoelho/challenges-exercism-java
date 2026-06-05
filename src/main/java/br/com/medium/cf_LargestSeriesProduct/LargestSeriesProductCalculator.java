package main.java.br.com.medium.cf_LargestSeriesProduct;

public class LargestSeriesProductCalculator {

  String inputNumber;
  int numberOfDigits;
  
  LargestSeriesProductCalculator(String inputNumber) {
    this.inputNumber = inputNumber;
      for (int i = 0; i < inputNumber.length(); i++) {
    char c = inputNumber.charAt(i);

    if (Character.isLetter(c)) {
        throw new IllegalArgumentException("String to search may only contain digits.");
    }
}
  }
  
  long calculateLargestProductForSeriesLength(int numberOfDigits) {
    if (numberOfDigits > inputNumber.length()) {
        throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
    }

    String[] sequenceNumber = new String[inputNumber.length()];

    long largestValue = 0;

    for (int i = 0; i <= (inputNumber.length() - numberOfDigits); i++) {
      sequenceNumber[i] = inputNumber.substring(i, numberOfDigits + i);
    }
    
    int valorNumeric = 0;
    for (String stringProduct : sequenceNumber) {
      if (stringProduct == null) {
        continue;
      }

      long productCurrent = 1;
      
      for ( int j = 0; j < stringProduct.length(); j++) {
        char valorChar;
        if (!(stringProduct.charAt(j) >= '0' && stringProduct.charAt(j) <= '9')) {
            valorChar = '1';
        } else {
            valorChar = stringProduct.charAt(j);
        }

        valorNumeric = Character.getNumericValue(valorChar);

        productCurrent *= valorNumeric;
      }

      if (productCurrent > largestValue)
        largestValue = productCurrent;
    }
    return largestValue;

  }
}

