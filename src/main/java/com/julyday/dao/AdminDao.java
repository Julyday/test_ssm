package com.julyday.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.julyday.entity.Admin;

@Repository
public interface AdminDao extends JpaRepository<Admin,Integer>,JpaSpecificationExecutor<Admin>{
	Admin findById(int id);
	
	List<Admin> findByNameAndPassword(String name,String password);
	
	Page<Admin> findAll(Pageable pageable);
}
