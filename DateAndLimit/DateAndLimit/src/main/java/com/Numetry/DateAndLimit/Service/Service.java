package com.Numetry.DateAndLimit.Service;

import com.Numetry.DateAndLimit.Entity.Employee;
import com.Numetry.DateAndLimit.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> findByRecordDateBetween(Date startDate, Date endDate) {
        return employeeRepository.findByRecordDateBetween(startDate,endDate);
    }





}
