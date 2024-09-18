package com.learn.Springboot.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.Springboot.entity.Vendor;
import com.learn.Springboot.service.VendorService;

@RestController
@RequestMapping("/cloudvendor")
public class vendorControl {
VendorService vrs;
	
	

	
	
	public vendorControl(VendorService vrs) {
		super();
		this.vrs = vrs;
		
	}
	@GetMapping("{vendorid}")
	public  Vendor getdata(@PathVariable("{vendorid}")   String vendorid) {
	return	vrs.getvendor(vendorid);
		
		
	}
	@GetMapping()
	public List< Vendor >getdataall() {
	return	vrs.getallvendor();
		
		
	}
	//
	@PostMapping
	public String cloudvendordetails(@RequestBody Vendor v) {
		vrs.createvendor(v);
		return "vendor is created";
	}
	@PutMapping
	public String updatevendor(@RequestBody Vendor v) {
		vrs.updatevendor(v);
		return "vendor updated";
		
	}
	
	@DeleteMapping("{vendorid}")
	public String delete(@PathVariable   String vendorid) {
		vrs.deletevendor(vendorid);
		return "delete vendor";
		
	}
}
