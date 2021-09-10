package com.olive.model;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
	private Integer eid;
	private String ename;
	private Double esal;
	private String eaddress;
	
}
