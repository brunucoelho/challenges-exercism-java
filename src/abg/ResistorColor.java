package abg;
class ResistorColor {
    int colorCode(String color) {
        int value = 0;
        switch(color) {
                case("black") -> value = 0;
                case("brown") -> value = 1;
                case("red") -> value = 2;
                case("orange") -> value = 3;
                case("yellow") -> value = 4;
                case("green") -> value = 5;
                case("blue") -> value = 6;
                case("violet") -> value = 7;
                case("grey") -> value = 8;
                case("white") -> value = 9;
        };
    return value;
    }

    String[] colors() {
        return new String[] {
            "black", "brown", "red", "orange", "yellow",
            "green", "blue", "violet", "grey", "white"
        };
    }
}
