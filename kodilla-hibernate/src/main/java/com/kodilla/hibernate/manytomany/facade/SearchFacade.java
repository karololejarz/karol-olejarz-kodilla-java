package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchFacade {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    public List<Employee> retrieveLastNameFromAnyString(String string) throws SearchNotFoundException {
        List<Employee> result = employeeDao.retrieveLastNameFromAnyString(string);
        if(result.size()==0) throw new SearchNotFoundException();
        return result;
    }

    public List<Company> retrieveCompanyFromAnyString(String string) throws SearchNotFoundException {
        List<Company> result = companyDao.retrieveCompanyFromAnyString(string);
        if(result.size()==0) throw new SearchNotFoundException();
        return result;
    }

    public void createEmployee(Employee employee) {
        employeeDao.save(employee);
    }

    public void createCompany(Company company) {
        companyDao.save(company);
    }
}
