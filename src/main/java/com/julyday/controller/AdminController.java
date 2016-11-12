package com.julyday.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.julyday.dao.AdminDao;
import com.julyday.entity.Admin;

@RequestMapping("/admin")
@Controller
public class AdminController {
	
	@Autowired
	private AdminDao adminDao;
	
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/find/{userId}")
	public String find1(@PathVariable("userId") Integer id,Model model){
		Admin admin = adminDao.findById(id);
		model.addAttribute("user", admin);
		return "success";
	}
	
	@RequestMapping("/find")
	public String find2(Admin admin,Model model){
		List<Admin> list = adminDao.findByNameAndPassword(admin.getName(),admin.getPassword());
		model.addAttribute("user", list.get(0));
		return "success";
	}
}
