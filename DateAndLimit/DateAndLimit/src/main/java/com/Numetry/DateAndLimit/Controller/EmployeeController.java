package com.Numetry.DateAndLimit.Controller;

import com.Numetry.DateAndLimit.Entity.Employee;
import com.Numetry.DateAndLimit.Repository.EmployeeRepository;
import com.Numetry.DateAndLimit.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.GeneratedValue;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private Service service;


    @GetMapping("/date")
    public List<Employee> getRecordsBetweenDates(
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate
    ) {
        return service.findByRecordDateBetween(startDate, endDate);
    }



}
