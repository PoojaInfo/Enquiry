package com.cjc.main.model;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import com.cjc.main.enums.EnquiryStatues;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EnquiryDetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int enquiryId;
	private String customefullName;
	private String emailId;
	private long contactNumber;
	private String pancardNumber;
	private int age;
	@CreationTimestamp
	private Date registerOn;
	@Enumerated(EnumType.STRING)
	private EnquiryStatues enquiryStatues; //"REGISTER","PRIMARY_VERIFIED","REJECTED","APROVED"
	@OneToOne(cascade = CascadeType.MERGE.REFRESH.REMOVE.DETACH)
	private CibilDetails cibilDetails;
}
