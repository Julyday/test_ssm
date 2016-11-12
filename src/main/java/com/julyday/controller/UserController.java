package com.julyday.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.julyday.domain.User;
import com.julyday.service.UserService;

@RequestMapping("/user")
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/find/{userId}")
	public String find1(@PathVariable("userId") Integer id,Model model){
		User user = userService.find(id);
		model.addAttribute("user", user);
		return "success";
	}
	
	@RequestMapping("/find")
	public String find2(User user,Model model){
		System.out.println(user.toString());
		List<User> list = userService.getList(user);
		model.addAttribute("user",list.get(0));
		return "success";
	}
	
	@RequestMapping("/findAll")
	@ResponseBody
	public String findAll(){
		List<User> list = userService.getList(new User());
		return JSONObject.toJSONString(list);
	}
	
	
}
