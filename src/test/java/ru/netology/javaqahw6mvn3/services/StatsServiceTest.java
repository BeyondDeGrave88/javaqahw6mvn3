package ru.netology.javaqahw6mvn3.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindSummarySales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSummary = 180;
        int actualSummary = service.getSummarySales(sales);
        Assertions.assertEquals(expectedSummary, actualSummary);

    }

    @Test
    public void shouldFindAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = service.getAverageSales(sales);
        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void shouldFindMaxMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

         int expectedMonth = 6;
         int actualMonth = service.getMaxMonth(sales);
         Assertions.assertEquals(expectedMonth, actualMonth);
    }


    @Test
    public void shouldFindMinMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.getMinMonth(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindBelowAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 5;
        int actualAverage = StatsService.countMonthsBelowAverageSales(sales);
        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void shouldFindHigherAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 5;
        int actualAverage = StatsService.countMonthsHigherAverageSales(sales);
        Assertions.assertEquals(expectedAverage, actualAverage);

        //@Test
        //public void shouldFindMinSales() {
        //StatsService service = new StatsService();

        //int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        //int expectedSales = 7;
        //int actualSales = service.getMinSales(sales);
        //Assertions.assertEquals(expectedSales, actualSales);
        // }
        //@Test
        //public void shouldFindMaxSales() {
        //StatsService service = new StatsService();

        //int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        //int expectedSales = 20;
        //int actualSales = service.getMaxSales(sales);
        //Assertions.assertEquals(expectedSales, actualSales);
        // }


    }
}
