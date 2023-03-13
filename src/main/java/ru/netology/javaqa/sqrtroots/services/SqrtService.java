package ru.netology.javaqa.sqrtroots.services;

public class SqrtService {
    public int calcSqrt(int lowervalue, int uppervalue) {
        int result = 0;
        for (int i = 10; i <= 999; i++) {
            if ((i * i >= lowervalue) & (i * i <= uppervalue)) {
                result = result + 1;
            }
        }
        return result;
    }
}

