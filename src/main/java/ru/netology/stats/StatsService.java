package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] arrMonth) {

        long sum = 0;

        for (long oneMonth : arrMonth) {

            sum += oneMonth;

        }
        return sum;
    }

    public long averageSales(long[] arrMonth) {

        long sum = 0;
        for (long oneMonth : arrMonth) {

            sum += oneMonth;
        }
        return sum / arrMonth.length;

    }

    public int maxSales(long[] arrMonth) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : arrMonth) {

            if (sale >= arrMonth[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long underAverageSales(long[] arrMonth) {

        long sum = 0;
        long countMonth = 0;
        for (long oneMonth : arrMonth) {
            sum += oneMonth;
        }
        long average = sum / arrMonth.length;

        for (long oneMonth : arrMonth) {
            if (oneMonth < average) {
                countMonth += 1;
            }
        }
        return countMonth;

    }

    public long overAverageSales(long[] arrMonth) {

        long sum = 0;
        long countMonth = 0;
        for (long oneMonth : arrMonth) {
            sum += oneMonth;
        }
        long average = sum / arrMonth.length;

        for (long oneMonth : arrMonth) {
            if (oneMonth > average) {
                countMonth += 1;
            }
        }
        return countMonth;

    }

}
