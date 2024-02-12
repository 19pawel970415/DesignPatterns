package com.company.decorator;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        final StatisticsLogger statisticsLogger = new WithMeanStatisticsLogger(
                new WithSummaryStatisticsLogger(
                        new ExecutionTimesBaseStatistics(List.of(1.2, 2.2, 3.4))));
        statisticsLogger.displayStatistics();

    }
}
