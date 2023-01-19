package ru.netology.sgr;

public class SQRService {
    public int calculateSQR(int minNumber, int maxNumber) {
        int x = 0;
        for (int i = 10; i <= 99; i++) {
            if (minNumber <= i * i & i * i <= maxNumber) {
                x = x + 1;
            }
        }
               return x;
    }
}
