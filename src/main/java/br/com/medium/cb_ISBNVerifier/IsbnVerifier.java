package main.java.br.com.medium.cb_ISBNVerifier;

public class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        if (stringToVerify == null) {
            return false;
        }

        String isbn = stringToVerify.replaceAll("-", "");

        if (isbn.length() != 10) {
            return false;
        }

        int sum = 0;

        for (int i = 0; i < isbn.length(); i++) {
            char c = isbn.charAt(i);

            if (c >= '0' && c <= '9') {
                sum += (c - '0') * (10 - i);
            } else if (c == 'X' && i == 9) {
                sum += 10;
            } else {
                return false;
            }
        }

        return sum % 11 == 0;
    }

}
