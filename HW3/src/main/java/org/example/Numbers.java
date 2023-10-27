package org.example;

public class Numbers {
    // Метод для проверки числа на четность.
    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    // Метод для проверки попадания числа в интервал.
    public boolean numberInInterval(int n) {
        return n >= 25 && n <= 100;
    }
    
}
