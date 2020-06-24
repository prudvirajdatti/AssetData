package com.assetdata.app.bean;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name="aum")
public class AssetDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cal_date")
	private Date calDate;
	
	@Column(name="name")
	private String name;
	
	@Column(name="industry")
	private String industry;
	
	@Column(name="currency")
	private String currency;
	
	@Column(name="ccyrate")
	private double ccyRate;
	
	@Column(name="rm")
	private String rm;
	
	@Column(name="product")
	private String product;
	
	@Column(name="head")
	private String head;
	
	@Column(name="volume")
	private long volume;
	
}
