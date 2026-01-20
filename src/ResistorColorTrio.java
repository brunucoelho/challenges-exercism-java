class ResistorColorTrio {
    int label(String[] colors) {
        int firstDigit = 0;
        int secondDigit = 0;
        int thirdDigit = 0;
        String solutionStg;
        //int solutionInt = 0;
        String[] colorCodes = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

             for (int i = 0; i < colorCodes.length; i++) {
                 if (colorCodes[i].equals(colors[0])) {
                     firstDigit = i;
                     for (int j = 0; j < colorCodes.length; j++) {
                         if (colorCodes[j].equals(colors[1])) {
                             secondDigit = j;
                             for (int k = 0; k < colorCodes.length; k++) {
                                 if (colorCodes[k].equals(colors[2])) {
                                     thirdDigit = k;
                                 }
                             }
                         }
                     }
                 }
             }
        solutionStg = String.valueOf(firstDigit * 10 + secondDigit) + "0".repeat(thirdDigit) + " ohms";

        return Integer.parseInt(solutionStg);
    };
    
}