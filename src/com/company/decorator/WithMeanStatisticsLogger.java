package com.company.decorator;

import java.util.List;

public class WithMeanStatisticsLogger implements StatisticsLogger {

    //Zadanie 7 - decorator
    //Dla klasy ExecutionTimesBaseStatistics, wykorzystując interfejs StatisticsLogger, stwórz dwa dekoratory, które dodają następującą funkcjonalność:
    //
    //WithMeanStatisticsLogger, który wyświetla średnią wyników (wartości listy executionTimes w ExecutionTimesBaseStatistics) przed wyświetleniem poszczególnych wyników
    //WithSummaryStatisticsLogger, która przed wyświetleniem poszczególnych wyników, wyświetla następujące statystyki:
    //liczba rekordów
    //suma
    //wartość minimalna
    //wartość maksymalna

    private final StatisticsLogger statisticsLogger;

    public WithMeanStatisticsLogger(final StatisticsLogger statisticsLogger) {
        this.statisticsLogger = statisticsLogger;
    }

    @Override
    public void displayStatistics() {
        final double mean = getExecutionTimes().stream().mapToDouble(x -> x).sum() / getExecutionTimes().size();
        System.out.println("Mean is " + mean);
        statisticsLogger.displayStatistics();
    }

    @Override
    public List<Double> getExecutionTimes() {
        return statisticsLogger.getExecutionTimes();
    }
}