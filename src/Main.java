public class Main {
    public static void main(String[] args) {
    RnaTranscription rnaTranscription = new RnaTranscription();
        String dnaStrand = "GCTA";
        String rnaStrand = rnaTranscription.transcribe(dnaStrand);
        System.out.println("DNA Strand: " + dnaStrand);
        System.out.println("RNA Strand: " + rnaStrand);
    };
                
    }