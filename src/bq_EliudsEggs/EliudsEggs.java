package bq_EliudsEggs;


public class EliudsEggs {

    public int number;
    public int sum = 0;
    public String binario;
    
    public int eggCount(int number) {
        binario = Integer.toBinaryString(number);
        for (int i = 0; i < binario.length(); i++) {
            if (binario.charAt(i) == '1')
                sum++;
        }
    return sum;
}    
}

