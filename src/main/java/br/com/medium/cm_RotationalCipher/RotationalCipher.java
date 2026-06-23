package main.java.br.com.medium.cm_RotationalCipher;

public class RotationalCipher {

    private int shiftKey;

    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(String data) {
        StringBuilder result = new StringBuilder();
        for (char c : data.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                int shifted = (c - base + shiftKey) % 26;
                result.append((char) (base + shifted));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

}