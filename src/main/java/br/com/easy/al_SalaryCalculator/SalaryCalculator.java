package main.java.br.com.easy.al_SalaryCalculator;

public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        double value = daysSkipped >= 5 ? 0.85 : 1.0;
        return value;
    }

    public int bonusMultiplier(int productsSold) {
        int valueMultiplier = productsSold >= 20 ? 13 : 10;
        return valueMultiplier;
    }

    public double bonusForProductsSold(int productsSold) {
        int productFinalSold = bonusMultiplier(productsSold) == 13 ? productsSold*13 : productsSold*10;
        return productFinalSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double resultFirst = salaryMultiplier(daysSkipped) * 1000;
        double rawSalary = bonusForProductsSold(productsSold);
        double valueFinale = (resultFirst + rawSalary) > 2000 ? 2000 : (resultFirst + rawSalary);
        return valueFinale;
    }
}
