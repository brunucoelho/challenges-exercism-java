package bo_Pangram;
public class PangramChecker {

    int sum = 0;

    public boolean isPangram(String input) {
        String test = "abcdefghijklmnopqrstuvxzyw";
        input = input.toLowerCase();
        for (int i = 0; i < test.length(); i++) {
            if (test.charAt(i) >= 'a' && test.charAt(i) <= 'z' && input.indexOf(test.charAt(i)) != -1)
                sum++;
        }
        return (sum == 26) ? true : false;
}}
