package bh_ResistorColorDuo;
class ResistorColorDuo {

    int value(String[] colors) {
        int firstDigit = 0;
        int secondDigit = 0;
        String[] colorCodes = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        
             for (int i = 0; i < colorCodes.length; i++) {
                 if (colorCodes[i].equals(colors[0])) {
                     firstDigit = i;
                     for (int j = 0; j < colorCodes.length; j++) {
                         if (colorCodes[j].equals(colors[1])) {
                             secondDigit = j;
                         }
                     }
                 }
             }
                             return firstDigit * 10 + secondDigit;
    };
    
}
