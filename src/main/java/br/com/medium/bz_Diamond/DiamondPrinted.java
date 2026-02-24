package main.java.br.com.medium.bz_Diamond;

import java.util.*;

class DiamondPrinter {

    public int sum = 0;
    public char a;
    public int qntLinhas;
    public String orderIndex;
    List<String> diamond = new ArrayList<String>();
    List<String> diamondReverse = new ArrayList<String>();
    List<String> alfabet = List.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
     "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");
    String espaco = " ";
    String middleLeft = "";
    String middleRight = "";

    List<String> printToList(char a) {
        char upperCase = Character.toUpperCase(a);
        orderIndex = String.valueOf(upperCase);
        qntLinhas = (alfabet.indexOf(orderIndex) + 1); 
        //qntFacetas = (qntLinhas * 2) - 1;
        if (upperCase == 'A') {
            diamond.add("A");
        } else {
            while (qntLinhas > 1) {
            
                    String bordaEspaco = espaco.repeat(qntLinhas - 1);

                    if (sum <= 0) {
                        diamond.add(bordaEspaco + middleLeft + alfabet.get(sum) + middleRight + bordaEspaco);
                    } else {
                        middleLeft = alfabet.get(sum);
                        middleRight = alfabet.get(sum);
                        diamond.add(bordaEspaco + middleLeft + espaco.repeat(sum * 2 - 1) + middleRight + bordaEspaco);
                    }

            sum++;
            qntLinhas--;
        }

        diamond.add(orderIndex + espaco.repeat(sum * 2 - 1) + orderIndex);
}

        diamondReverse = new ArrayList<>(diamond);
        Collections.reverse(diamondReverse);
        diamondReverse.remove(0);
        diamond.addAll(diamondReverse);        

        return diamond;
}}

