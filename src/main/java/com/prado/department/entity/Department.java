package com.prado.department.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long departmentId;
	private String departmentName;
	private String departmentCode;
	private String departmentAddress;
	private int departmentEmployees;
}
