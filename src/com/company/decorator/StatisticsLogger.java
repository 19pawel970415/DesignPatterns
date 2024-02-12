package com.company.decorator;

import java.util.List;

public interface StatisticsLogger {
    void displayStatistics();
    List<Double> getExecutionTimes();
}