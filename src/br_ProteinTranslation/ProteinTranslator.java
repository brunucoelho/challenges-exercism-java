package br_ProteinTranslation;

import java.util.List;
import java.util.ArrayList;
class ProteinTranslator {
    public String rnaSequence;
    public int responser;
    public String[] recorte;
    public List<String> codon = List.of(
        "AUG","UUU", "UUC", "UUA", "UUG", "UCU", "UCC", "UCA", "UCG",
        "UAU", "UAC", "UGU", "UGC","UGG","UAA", "UAG", "UGA"
        );
    public List<String> aminoAcid = List.of(
        "Methionine", "Phenylalanine", "Phenylalanine", "Leucine", "Leucine",
        "Serine", "Serine", "Serine", "Serine", "Tyrosine", "Tyrosine",
        "Cysteine", "Cysteine", "Tryptophan", "STOP", "STOP", "STOP"
        );
    
List<String> translate(String rnaSequence) {
    List<String> protein = new ArrayList<>();
    if (rnaSequence.isEmpty()) {
        return protein;
    }
    String[] recorte = rnaSequence.split("(?<=\\G.{3})");
    for (String c : recorte) {
        int index = codon.indexOf(c);
        if (index == -1 || c.length() < 3) {
            throw new IllegalArgumentException("Invalid codon");
        }
        String result = aminoAcid.get(index);
        if (result.equals("STOP")) {
            return protein;
        }
        protein.add(result);
    }
    return protein;
}
}