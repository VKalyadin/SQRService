package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/SQRService.csv")

    public void numberOfSquares(int expected, int x, int y) {
        SQRService service = new SQRService();
        int actual = service.calcSQR(x,y);

        Assertions.assertEquals(expected,actual);
    }
}
