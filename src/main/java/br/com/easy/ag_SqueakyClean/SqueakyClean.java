package main.java.br.com.easy.ag_SqueakyClean;

public class SqueakyClean {
    static String clean(String identifier) {
        if (identifier.contains("-")) {
        String wordReplace = identifier.substring(identifier.indexOf("-"),identifier.indexOf("-")+2);
        String wordfinal = identifier.substring(identifier.indexOf("-")+1,identifier.indexOf("-")+2).toUpperCase();
    return identifier.replace(wordReplace, wordfinal)
            .replace(' ', '_')
            .replace("1", "l")
            .replace("3", "e")
            .replace("4", "a")
            .replace("7", "t")
            .replace("0", "o")
            .replace("¡", "")
            .replace("$", "")
            .replace("#", "")
            .replace(".", "")
            .replace("!", "")
            .replace("-", "");
        }
        return identifier.replace(' ', '_')
            .replace("1", "l")
            .replace("3", "e")
            .replace("4", "a")
            .replace("7", "t")
            .replace("0", "o")
            .replace("¡", "")
            .replace("$", "")
            .replace("#", "")
            .replace(".", "")
            .replace("!", "")
            .replace("-", "");
    }
}

