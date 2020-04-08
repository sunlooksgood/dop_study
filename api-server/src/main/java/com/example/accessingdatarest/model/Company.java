package com.example.accessingdatarest.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Company {
	@Id
	private String name;
	private Employee[] emp;
}
