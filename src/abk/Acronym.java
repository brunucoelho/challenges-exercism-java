package abk;
class Acronym {

    public String phrase;
    
    Acronym(String phrase) {
        this.phrase = phrase;
    }
    
    String get() {
        String out = "";
        String[] inputSplit = phrase.split("[\\p{Zs}-_]+");
        for (String str : inputSplit) {
            out += str.toUpperCase().charAt(0);
        }
        return out;
    }
}