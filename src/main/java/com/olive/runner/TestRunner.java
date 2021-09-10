package com.olive.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.olive.model.Employee;
import com.olive.repo.ProductRepo;
@Component
public class TestRunner implements CommandLineRunner{
	@Autowired
	private ProductRepo repo;

	public void run(String... args) throws Exception {
		System.out.println("Runner Class Started............");
        repo.save(new Employee(1, "Ravi", 4500.0, "Hyd"));
        repo.save(new Employee(2, "Manoj", 600.0, "Hyd"));
        repo.save(new Employee(3, "Komal", 800.0, "Hyd"));
        repo.save(new Employee(4, "Karan", 300.0, "Hyd"));
       System.out.println("Product Data Save into MongoDB");
       System.out.println("***************************************");
       List<Employee> list = repo.findAll();
               list.stream()
               .forEach(System.out::println);
	}

}
