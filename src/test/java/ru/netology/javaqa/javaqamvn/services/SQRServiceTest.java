package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/SQRService.csv")

    public void numberOfSquares(int expected, int minValue, int maxValue) {
        SQRService service = new SQRService();
        int actual = service.calcSQR(minValue, maxValue);

        Assertions.assertEquals(expected, actual);
    }
}
