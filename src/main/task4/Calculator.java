package task4;

public class Calculator {

   
    public int add(int a, int b) {
        return a + b;
    }

   
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Делитель не может быть равен нулю");
        }
        return (double) a / b;
    }

   

    public double calculateDiscount(double purchaseAmount, double discountPercentage) {
        if (purchaseAmount < 0 || discountPercentage < 0 || discountPercentage > 100) {
            throw new ArithmeticException("Некорректные аргументы");
        }
        double discountAmount = purchaseAmount * (discountPercentage / 100);
        return purchaseAmount - discountAmount;
    }
}

