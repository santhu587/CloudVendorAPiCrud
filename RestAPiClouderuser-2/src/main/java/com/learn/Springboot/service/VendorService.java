package com.learn.Springboot.service;

import java.util.List;

import com.learn.Springboot.entity.Vendor;

public interface VendorService {

	public String createvendor(Vendor v);
	public String updatevendor(Vendor v);
	public String deletevendor(String  vid);
	public Vendor getvendor(String v);
	public List<Vendor> getallvendor();


}
