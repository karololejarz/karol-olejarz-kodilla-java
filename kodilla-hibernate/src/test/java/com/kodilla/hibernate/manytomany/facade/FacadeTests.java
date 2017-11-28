package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTests {
    @Autowired
    SearchFacade searchFacade;

    @Test
    public void shouldSearchBySubString() throws SearchNotFoundException {
        Employee joshSmyth = new Employee("Josh", "Smyth");
        Employee stephenClarkson = new Employee("Stephen", "Clarkson");
        Employee lyndaKovalski = new Employee("Lynda", "Kovalski");

        Company softwareMachines = new Company("Software Machines");
        Company dataMasters = new Company("Data Masters");
        Company greyMatters = new Company("Grey Matters");

        searchFacade.createEmployee(joshSmyth);
        searchFacade.createEmployee(stephenClarkson);
        searchFacade.createEmployee(lyndaKovalski);

        searchFacade.createCompany(softwareMachines);
        searchFacade.createCompany(dataMasters);
        searchFacade.createCompany(greyMatters);

        String string1 = "smy";
        String string2 = "rks";
        String string3 = "ski";
        int found1 = searchFacade.retrieveLastNameFromAnyString(string1).size();
        int found2 = searchFacade.retrieveLastNameFromAnyString(string2).size();
        int found3 = searchFacade.retrieveLastNameFromAnyString(string3).size();
        Assert.assertEquals(1,found1);
        Assert.assertEquals(1,found2);
        Assert.assertEquals(1,found3);

        String string4 = "Mach";
        String string5 = "ters";
        int found4 = searchFacade.retrieveCompanyFromAnyString(string4).size();
        int found5 = searchFacade.retrieveCompanyFromAnyString(string5).size();
        Assert.assertEquals(1,found4);
        Assert.assertEquals(2,found5);

        try {
            searchFacade.companyDao.delete(softwareMachines);
            searchFacade.companyDao.delete(dataMasters);
            searchFacade.companyDao.delete(greyMatters);
            searchFacade.employeeDao.delete(joshSmyth);
            searchFacade.employeeDao.delete(stephenClarkson);
            searchFacade.employeeDao.delete(lyndaKovalski);
        } catch (Exception e) {
        }
    }

    @Test
    public void shouldThrowException() throws SearchNotFoundException {
        Employee joshSmyth = new Employee("Josh", "Smyth");
        Company softwareMachines = new Company("Software Machines");
        searchFacade.createEmployee(joshSmyth);
        searchFacade.createCompany(softwareMachines);

        String searchString = "nic";

        try {
            int found1 = searchFacade.retrieveLastNameFromAnyString(searchString).size();
            Assert.assertEquals(0, found1);
            } catch (SearchNotFoundException s) {
        }

        try {
            int found2 = searchFacade.retrieveCompanyFromAnyString(searchString).size();
            Assert.assertEquals(0, found2);
            } catch (SearchNotFoundException s) {
        }

        try {
            searchFacade.companyDao.delete(softwareMachines);
            searchFacade.employeeDao.delete(joshSmyth);
            }
            catch (Exception e) {
        }
    }
}
