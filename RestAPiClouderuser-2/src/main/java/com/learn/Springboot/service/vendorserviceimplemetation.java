package com.learn.Springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.learn.Springboot.Repository.VendorRepo;
import com.learn.Springboot.entity.Vendor;



@Service
public class vendorserviceimplemetation implements VendorService {

	VendorRepo vrepo;
	
	
	
	public vendorserviceimplemetation(VendorRepo vrepo) {
		super();
		this.vrepo = vrepo;
	}

	@Override
	public String createvendor(Vendor v) {
		// TODO Auto-generated method stub
		vrepo.save(v);
		return "sucess savedd";
	}

	@Override
	public String updatevendor(Vendor v) {
		// TODO Auto-generated method stub
		vrepo.save(v);

		return "sucess updated";
	}

	@Override
	public String deletevendor(String vid) {
		// TODO Auto-generated method stub
		vrepo.deleteById(vid);
		return "sucess";
	}

	@Override
	public Vendor getvendor(String v) {
		// TODO Auto-generated method stub
		return vrepo.findById(v).get();
		
	}

	@Override
	public List<Vendor> getallvendor() {
		// TODO Auto-generated method stub
		
		return vrepo.findAll();
	}

}
