package ru.netology.javaqa.javaqamvn.services;

public class SQRService {

    public int calcSQR(int x, int y) {

        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= x) {
                if (i * i <= y)
                    counter++;

            }
        }
    return counter;
    }
}
