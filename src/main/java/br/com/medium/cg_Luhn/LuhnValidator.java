package main.java.br.com.medium.cg_Luhn;

public class LuhnValidator {

  boolean isValid(String candidate) {

    String candidateCorrect;
    if (candidate.contains(" ")) {
      candidateCorrect = candidate.replace(" ", "");
    } else {
    candidateCorrect = candidate;
    }

    boolean rule1st = true;
    boolean rule2rd = true;
    boolean rule3rd = true;

    rule1st = candidateCorrect.length() > 1;

    for (int i = 0; i < candidateCorrect.length(); i++) {
        char c = candidateCorrect.charAt(i);
            if (!Character.isDigit(c)) {
                rule2rd = false;
                break;
  }}
    //
    String revestAlgorithmLuhh = "";
      for (int j = candidateCorrect.length() - 1; j >= 0; j--) {
    revestAlgorithmLuhh += candidateCorrect.charAt(j);
}
      char[] algorithmLuhh = revestAlgorithmLuhh.toCharArray();

      for (int k = 1; k < algorithmLuhh.length; k += 2) {
          int numero = Character.getNumericValue(algorithmLuhh[k]);
            int dobro = numero * 2;

            if (dobro > 9) {
                dobro -= 9;
            }

            algorithmLuhh[k] = (char) (dobro + '0');
        }

      String algorithmLuhhFinale = new String(algorithmLuhh);

      int sum = 0;
      int valorNumeric = 0;
      for ( int l = 0; l < algorithmLuhhFinale.length(); l++) {
          char valorChar;
          if (!(algorithmLuhhFinale.charAt(l) >= '0' && algorithmLuhhFinale.charAt(l) <= '9')) {
              valorChar = '1';
          } else {
              valorChar = algorithmLuhhFinale.charAt(l);
          }

          valorNumeric = Character.getNumericValue(valorChar);

          sum += valorNumeric;
      }

      //
      rule3rd = (sum%10 == 0);
  
    return (rule1st && rule2rd && rule3rd) ? true : false;
      
  }}

