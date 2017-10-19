package com.kodilla.patterns2.adapter.company;

import com.kodilla.patterns2.adapter.company.oldhrsystem.Workers;
import org.junit.Assert;
import org.junit.Test;

public class AdapterTestSuite {
    @Test
    public void testTotalSalary() {
        Workers workers = new Workers();
        SalaryAdapter salaryAdapter = new SalaryAdapter();

        double totalSalary = salaryAdapter.TotalSalary(workers.getWorkers(),workers.getSalaries());

        System.out.println("Total salary is: " + totalSalary);
        Assert.assertEquals(totalSalary,16500,0);
    }
}
