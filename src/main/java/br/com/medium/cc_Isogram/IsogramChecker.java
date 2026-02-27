package main.java.br.com.medium.cc_Isogram;

public class IsogramChecker {

    boolean isIsogram(String phrase) {
        if (phrase == null) {
            return false;
        }

        String cleanedPhrase = phrase.replaceAll("[^a-zA-Z]", "").toLowerCase();

        for (int i = 0; i < cleanedPhrase.length(); i++) {
            char c = cleanedPhrase.charAt(i);
            if (cleanedPhrase.indexOf(c) != cleanedPhrase.lastIndexOf(c)) {
                return false;
            }
        }

        return true;
    }

}

