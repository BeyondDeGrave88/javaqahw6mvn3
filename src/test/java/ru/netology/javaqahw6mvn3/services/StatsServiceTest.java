package ru.netology.javaqahw6mvn3.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindSummarySales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSummary = 180;
        long actualSummary = service.getSummarySales(sales);
        Assertions.assertEquals(expectedSummary, actualSummary);
        System.out.println(expectedSummary + " == ? == " + actualSummary);


    }

    @Test
    public void shouldFindAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverage = 15;
        long actualAverage = service.getAverageSales(sales);
        Assertions.assertEquals(expectedAverage, actualAverage);
        System.out.println(expectedAverage + " == ? == " + actualAverage);

    }

    @Test
    public void shouldFindMaxMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 6;
        int actualMonth = service.getMaxMonth(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
        System.out.println(expectedMonth + " == ? == " + actualMonth);

    }


    @Test
    public void shouldFindMinMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.getMinMonth(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
        System.out.println(expectedMonth + " == ? == " + actualMonth);

    }

    @Test
    public void shouldFindBelowAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonths = 5;
        long actualMonths = StatsService.countMonthsBelowAverageSales(sales);
        Assertions.assertEquals(expectedMonths, actualMonths);
        System.out.println(expectedMonths + " == ? == " + actualMonths);
    }

    @Test
    public void shouldFindAboveAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonths = 5;
        long actualMonths = StatsService.countMonthsAboveAverageSales(sales);
        Assertions.assertEquals(expectedMonths, actualMonths);
        System.out.println(expectedMonths + " == ? == " + actualMonths);

    }
}
