package com.excellence.springboot_thymeleaf_crud_pagination_sorting_webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.excellence.springboot_thymeleaf_crud_pagination_sorting_webapp.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
