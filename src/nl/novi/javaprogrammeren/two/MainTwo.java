package nl.novi.javaprogrammeren.two;

import java.util.Random;

public class MainTwo {
    public static void main(String[] args) {
        int totalSum = 0;
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
//            totalSum = totalSum + random.nextInt();
            totalSum += random.nextInt();
        }
        System.out.println("De som van alle random-getallen is: " + totalSum);
    }
}
