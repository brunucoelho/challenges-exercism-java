package bs_Raindrops;

class RaindropConverter {

    String pling = "";
    String plang = "";
    String plong = "";
    String convertStg = "";
    
    String convert(int number) {
        convertStg = String.valueOf(number);
        
        if (number%3 == 0) 
            pling = "Pling";
        if (number%5 == 0)
            plang = "Plang";
        if (number%7 == 0)
            plong = "Plong";
        return (pling+plang+plong).equals("") ? convertStg : pling+plang+plong;
    }
}
