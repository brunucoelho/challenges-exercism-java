package main.java.br.com.medium.ck_Proverb;

public class Main {
    public static void main(String[] args) {

        String proverbFinal;
        String[] words = new String[]{ "nail", "shoe", "horse", "rider", "message", "battle", "kingdom" };

        String[] proverbs = new String[words.length];

        for (int i = 0; i < proverbs.length-1; i++) {
            proverbs[i] = "For want of a " + words[i] + " the "+ words[i+1] + " was lost.";
            System.out.println(proverbs[i]);
        }

        // System.out.println("-----------------------");
        // proverbs[words.length] = "teste";
        // System.out.println(proverbs[words.length - 1]);
        // System.out.println("-----------------------");

        // proverbFinal = String.join("\n", proverbs);

        // System.out.println(proverbFinal);
        System.out.println(proverbs[words.length-1]);

    }}



