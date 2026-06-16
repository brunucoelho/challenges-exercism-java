package main.java.br.com.medium.ck_Proverb;

public class Proverb {
    
  String finalProverb;
  String[] words;
  String[] proverb;

  Proverb(String[] words) {
      this.words = words;
      this.proverb = new String[words.length];
  }

String recite() {
  if (words.length > 1) {
  for (int i = 0; i < proverb.length - 1; i++) {
      proverb[i] = "For want of a " + words[i] + " the " + words[i+1] + " was lost.";
          }
      proverb[words.length - 1] = "And all for the want of a " + words[0] +".";
      finalProverb = String.join("\n", proverb);
  } else if (words.length == 0) {
    finalProverb = "";
  }else {
      finalProverb =  "And all for the want of a " + words[0] +".";
  }
return finalProverb;
}

}