package org.example;

import ru.netology.javaqa.sqrtroots.services.SqrtService;

public class Main {
    public static void main(String[] args) {
        int lowervalue = -100;
        int uppervalue = 100;
        SqrtService service = new SqrtService();
        System.out.println("Колличество чисел: " + service.calcSqrt(lowervalue, uppervalue));
    }
}