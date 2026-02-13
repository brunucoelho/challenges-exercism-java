package bt_Say;

public class Say {
    public long number;
    public String longNumber;
    public String say(long number) {
        this.number = number;
        this.longNumber = String.valueOf(number);
        if (number < 0 || number > 999_999_999_999L) {
            throw new IllegalArgumentException("Number out of range");
        }
        if (number == 0) {
            return "zero";
        }
        String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] thousands = {"", "thousand", "million", "billion"};
        StringBuilder result = new StringBuilder();
        int thousandIndex = 0;
        while (number > 0) {
            int chunk = (int) (number % 1000);
            if (chunk > 0) {
                StringBuilder chunkResult = new StringBuilder();
                if (chunk >= 100) {
                    chunkResult.append(units[chunk / 100]).append(" hundred");
                    chunk %= 100;
                }
                if (chunk >= 20) {
                    chunkResult.append(chunkResult.length() > 0 ? " " : "").append(tens[chunk / 10]);
                    chunk %= 10;
                } else if (chunk >= 10) {
                    chunkResult.append(chunkResult.length() > 0 ? "-" : "").append(teens[chunk - 10]);
                    chunk = 0;
                }
                if (chunk > 0) {
                    chunkResult.append(chunkResult.length() > 0 ? "-" : "").append(units[chunk]);
                }
                if (thousandIndex > 0) {
                    chunkResult.append(" ").append(thousands[thousandIndex]);
                }
                result.insert(0, chunkResult.toString() + (result.length() > 0 ? " " : ""));
            }
            number /= 1000;
            thousandIndex++;
        }
        return result.toString().trim();
    }
}