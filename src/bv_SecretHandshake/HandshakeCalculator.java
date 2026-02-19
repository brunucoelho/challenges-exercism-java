package bv_SecretHandshake;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

class HandshakeCalculator {

    public int number;
    public String interetion;
    List<String> potenciaDe10 = new ArrayList<>();
    List<Signal> listEnuList = new ArrayList<>();


    List<Signal> calculateHandshake(int number) {
        String intString = Integer.toBinaryString(number);
        StringBuilder sb = new StringBuilder(intString);
        interetion = sb.reverse().toString();
        for (int i = 0; i < intString.length(); i++) {
            if (interetion.charAt(i) == '1') //{
                potenciaDe10.add(String.valueOf((int) Math.pow(10, i)));
        }

        for (String string : potenciaDe10) {
            if (string.equals(String.valueOf(Signal.WINK.getValue()))) {
                listEnuList.add(Signal.WINK);
            } else if (string.equals(String.valueOf(Signal.DOUBLE_BLINK.getValue()))) {
                listEnuList.add(Signal.DOUBLE_BLINK);
            } else if (string.equals(String.valueOf(Signal.CLOSE_YOUR_EYES.getValue()))) {
                listEnuList.add(Signal.CLOSE_YOUR_EYES);
            } else if (string.equals(String.valueOf(Signal.JUMP.getValue()))) {
                listEnuList.add(Signal.JUMP);
            }
        }

        if (interetion.length() > 4 && interetion.charAt(4) == '1') {
            Collections.reverse(listEnuList);
        }

        return listEnuList;
    }

}