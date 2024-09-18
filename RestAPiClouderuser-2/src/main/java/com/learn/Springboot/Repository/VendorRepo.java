package com.learn.Springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.Springboot.entity.Vendor;

public interface VendorRepo extends JpaRepository<Vendor,String> {

}
