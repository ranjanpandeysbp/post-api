package com.mycompany.postapi.api.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class User {

	public User(long id, String name, String dob) {
		this.id = id;
		this.name = name;
		this.dateOfBirth = LocalDate.parse(dob);
	}
	
	@ApiModelProperty(hidden = true)
	@JsonIgnore
	private Long id;
	
	private String name;
	
	@JsonFormat(pattern="dd MMM yyyy")
	private LocalDate dateOfBirth;
	
	@JsonFormat(pattern="dd MMM yyyy hh:mm:ss")
	private LocalDateTime lastLogin;
	
	@JsonFormat(pattern = "yyyy-MM-dd@HH:mm:ss.SSSXXX", locale = "en_SG", timezone = "Asia/Singapore")
	private ZonedDateTime zonedDateTime;

}
