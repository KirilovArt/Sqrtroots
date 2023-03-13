package ru.netology.javaqa.sqrtroots.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SqrtServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/counter.csv")
    public void testSqrtcounter(int expected, int lowervalue, int uppervalue) {
        SqrtService service = new SqrtService();

        int actual = service.calcSqrt(lowervalue, uppervalue);
        Assertions.assertEquals(expected, actual);
    }
}
