package ru.netology.javaqahw6mvn3.services;


public class StatsService {

    // Сумма
    public static long getSummarySales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    // Среднее значение
    public static long getAverageSales(long[] sales) {
        long sum = getSummarySales(sales);
        long average = sum / sales.length;
        return average;
    }

    // Максимум в каком месяце
    public int getMaxMonth(int[] sales) {
        int maxMonth = 0;
        for (int n = 0; n < sales.length; n++) {
            if (sales[n] > sales[maxMonth]) {
                maxMonth = n;
            }
        }
        return maxMonth + 1;
    }

    // Минимум в каком месяце
    public int getMinMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    // Ниже среднего
    public static int countMonthsBelowAverageSales(long[] sales) {
        long average = getAverageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    // Выше среднего
    public static int countMonthsAboveAverageSales(long[] sales) {
        long average = getAverageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}

