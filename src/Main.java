import bm_Hamming.Hamming;
import bo_Pangram.PangramChecker;
import bq_EliudsEggs.EliudsEggs;

public class Main {
    public static void main(String[] args) {
       ProteinTranslator proteinTranslator = new ProteinTranslator();
       System.out.println(proteinTranslator.translate("UAA"));
    }
};