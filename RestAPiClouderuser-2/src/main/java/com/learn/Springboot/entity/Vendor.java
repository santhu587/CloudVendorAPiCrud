package com.learn.Springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="vendor_info")
public class Vendor {
	
@Id
	String vendorid;
	String vendorname;
	String place;
	public Vendor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vendor(String vendorid, String vendorname, String place) {
		super();
		this.vendorid = vendorid;
		this.vendorname = vendorname;
		this.place = place;
	}
	public String getVendorid() {
		return vendorid;
	}
	public void setVendorid(String vendorid) {
		this.vendorid = vendorid;
	}
	public String getVendorname() {
		return vendorname;
	}
	public void setVendorname(String vendorname) {
		this.vendorname = vendorname;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
	
}
