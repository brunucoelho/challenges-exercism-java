public class Main {
    public static void main(String[] args) {
        String out = "";
        String input = "The Road _Not_ Taken";
        String[] inputSplit = input.split("[\\p{Zs}-_]+");
        for (String str : inputSplit) {
            out += str.toUpperCase().charAt(0);
        }
        System.out.println(out);
        
        // Acronym acronym = new Acronym("Liquid-crystal display");
        // System.out.println(acronym.get());
    }
};