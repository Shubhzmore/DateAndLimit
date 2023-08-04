package com.Numetry.DateAndLimit.Repository;

import com.Numetry.DateAndLimit.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    List<Employee> findByRecordDateBetween(Date startDate, Date endDate);
}

