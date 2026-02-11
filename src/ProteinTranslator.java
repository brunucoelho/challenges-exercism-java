import java.util.List;
import java.util.ArrayList;

class ProteinTranslator {

    public String rnaSequence;
    public int responser;
    public List<String> protein = new ArrayList<String>();
    public List<String> codon = List.of(
        "AUG",
        "UUU", "UUC",
        "UUA", "UUG",
        "UCU", "UCC", "UCA", "UCG",
        "UAU", "UAC",
        "UGU", "UGC",
        "UGG",
        "UAA", "UAG", "UGA"
        );
    public List<String> aminoAcid = List.of(
        "Methionine",
        "Phenylalanine", "Phenylalanine",
        "Leucine", "Leucine",
        "Serine", "Serine", "Serine", "Serine",
        "Tyrosine", "Tyrosine",
        "Cysteine", "Cysteine",
        "Tryptophan",
        "STOP", "STOP", "STOP"
        );
    
    List<String> translate(String rnaSequence) {
        responser = codon.indexOf(rnaSequence);
        if (!codon.contains(rnaSequence)) {
            //protein.add("");
            return protein;
        }
        protein.add(aminoAcid.get(responser));
        return protein;
        }
    }

