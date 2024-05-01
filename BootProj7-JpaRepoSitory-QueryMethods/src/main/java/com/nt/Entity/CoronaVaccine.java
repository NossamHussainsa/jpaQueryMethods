package com.nt.Entity;

import java.io.Serializable;

import jakarta.persistence.Column;

//import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
//@RequiredArgsConstructor if required
//@Table(name = "CoronaInfo")//optional
public class CoronaVaccine implements Serializable {
	@Id
//	@Column(name = "regNo")//optional
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long  regNo;
	@Column(length =  20)
	private String name;
	@Column(length =  20)
	private String  company;
	@Column(length =  20)
	private String  country;
	private Double price;
	private Integer dose;
	

}
