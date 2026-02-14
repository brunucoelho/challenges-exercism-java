package aw_Leap;

public class Leap {
        boolean isLeapYear(int year) {
            boolean divPor4 = (year % 4 == 0);
            boolean divPor100 = (year % 100 == 0);
            boolean divPor400 = (year % 400 == 0);
        
            return divPor4 && (!divPor100 || divPor400);
        }
}