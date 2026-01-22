package abi;
class ResistorColorTrio {
    String label(String[] colors) {
        int firstDigit = 0;
        int secondDigit = 0;
        int thirdDigit = 0;
        String[] colorCodes = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

             for (int i = 0; i < colorCodes.length; i++) {
                 if (colorCodes[i].equals(colors[0])) {
                     firstDigit = i;}}
                     for (int j = 0; j < colorCodes.length; j++) {
                         if (colorCodes[j].equals(colors[1])) {
                             secondDigit = j;}}
                             for (int k = 0; k < colorCodes.length; k++) {
                                 if (colorCodes[k].equals(colors[2])) {
                                     thirdDigit = k;
                                 }
                             }
        int solutionInt = (firstDigit * 10 + secondDigit) * (int) Math.pow(10, thirdDigit);

        if (solutionInt >= 100_000_000) {
            return 99 + " gigaohms";
    } else if (solutionInt > 1_000_000) {
            return solutionInt/1_000_000 + " megaohms";
    } else if (solutionInt >= 1_000) { 
            return solutionInt/1_000 + " kiloohms";
    }
        return solutionInt + " ohms";
    
}}