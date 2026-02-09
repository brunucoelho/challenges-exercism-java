package bo_PerfectNumbers;
class NaturalNumber {
    
    public int number;
    public int sum = 0;
    
    NaturalNumber(int number) {
        this.number = number;
        if (number <= 0)
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
    }

    Classification getClassification() {
        for (int i=1; i<(number-1);i++) {
            if (number%i == 0)
                sum = sum + i;
        }
        return (sum == number) ? Classification.PERFECT :
            (sum > number) ? Classification.ABUNDANT :
                        Classification.DEFICIENT;
    }
}