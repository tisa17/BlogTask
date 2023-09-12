package com.tunde.springSNVA.StudenCRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tunde.springSNVA.StudenCRUD.domain.Student;
import com.tunde.springSNVA.StudenCRUD.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService service;
	
	@GetMapping("/")
	public String viewHomPage(Model model) {
		List<Student> listStudent=service.listAll();
		model.addAttribute("listStudent", listStudent);
		System.out.println("Get/");
		return "index";
		
	}
	
	public String add(Model model) {
		
		model.addAttribute("student", new Student());
		return "new";
	}
	

}
