package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class StatsServiceTest {

    @Test
    public void sumSales() {
        StatsService service = new StatsService();

        long[] arrMonth = {15, 20, 18, 4, 34, 30, -1};

        long expectedSales = 120;
        long actualSales = service.sumSales(arrMonth);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void averageSales() {
        StatsService service = new StatsService();

        long[] arrMonth = {15, 20, 18, 4, 34, 30, -1};

        long expectedSales = 17;
        long actualSales = service.averageSales(arrMonth);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void maxMonthSales() {
        StatsService service = new StatsService();

        long[] arrMonth = {15, 20, 18, 4, 34, 30, -1};

        long expectedSales = 5;
        long actualSales = service.maxSales(arrMonth);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void minMonthSales() {
        StatsService service = new StatsService();

        long[] arrMonth = {15, 20, 18, 4, 34, 30, -1};

        long expectedSales = 7;
        long actualSales = service.minSales(arrMonth);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void underAverageSales() {
        StatsService service = new StatsService();

        long[] arrMonth = {15, 20, 18, 4, 34, 30, -1};

        long expectedSales = 3;
        long actualSales = service.underAverageSales(arrMonth);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test

    public void overAverageSales() {
        StatsService service = new StatsService();

        long[] arrMonth = {15, 20, 18, 4, 34, 30};

        long expectedSales = 2;
        long actualSales = service.overAverageSales(arrMonth);

        Assertions.assertEquals(expectedSales, actualSales);
    }
}
