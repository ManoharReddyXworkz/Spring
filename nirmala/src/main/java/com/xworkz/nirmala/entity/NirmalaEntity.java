package com.xworkz.nirmala.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name ="nirmala_details")
public class NirmalaEntity {

	private Integer  id;
	private String location;
	private String gender;
	private String type;
	private double cost;
	private double duration;
	private String createdBy;
	private Date updatedDate;
	private Date createdate;
	private String updateBy;
	
}
