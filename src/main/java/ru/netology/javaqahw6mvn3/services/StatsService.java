package ru.netology.javaqahw6mvn3.services;

public class StatsService {
    //Сумма
    public static int getSummarySales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    //Среднее значение
    public int getAverageSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;

        }
        int average = sum / sales.length;

        return average;
    }

    //Максимум в каком месяце
    public int getMaxMonth(int[] sales) {
        int maxMonth = 0;
        for (int n = 0; n < sales.length; n++) {
        if (sales[n] > sales[maxMonth] ) {
            maxMonth = n;
         }
       }
        return maxMonth + 1;
     }


    // Минимум в каком месяце

    public int getMinMonth(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1

    }

    //Ниже среднего
    public static int countMonthsBelowAverageSales(int[] sales) {
        int sum = 0;
        for (int b = 0; b < sales.length; b++) {
            sum += sales[b];
        }
        double average = (double) sum / sales.length;
        int count = 0;
        for (int b = 0; b < sales.length; b++) {
            if (sales[b] < average) {
                count++;
            }
        }
        return count;
    }

    //Выше среднего
    public static int countMonthsHigherAverageSales(int[] sales) {
        int sum = 0;
        for (int h = 0; h < sales.length; h++) {
            sum += sales[h];
        }
        double average = (double) sum / sales.length;
        int count = 0;
        for (int h = 0; h < sales.length; h++) {
            if (sales[h] < average) {
                count++;
            }
        }
        return count;
    }
}

