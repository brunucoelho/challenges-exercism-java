package ax_ReverseString;

public class ReverseString {
    String reverse(String inputString) {
        String reversed = new StringBuilder(inputString).reverse().toString();
        return reversed;
        }
    }