package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"1","John","Smith"},
            {"2","Ivone","Novak"},
            {"3","Jessie","Pinkman"},
            {"4","Walter","While"},
            {"5","Clara","Lanson"}};

    private double[] salaries = {
            1100.00, 2200.00, 3300.00, 4400.00, 5500.00};

    public String getWorker(int n) {
        if(n>salaries.length) {
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", salary: " + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
