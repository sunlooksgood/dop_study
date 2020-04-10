package com.example.accessingdatarest.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
public class Employee implements Serializable{
	
	@Id
	private String name;
	private int age;
}
