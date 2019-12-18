package com.abd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.abd.model.Student;
import com.abd.services.Stuservice;

@Controller
public class Mycontroller {

	@Autowired
	Stuservice stuser;

	@GetMapping("/home")
	public String myMethod(Model model) {

		List<Student> stu = stuser.getStudentListSer();
		// System.out.println(stu);
		model.addAttribute("student", stu);
		return "list";
	}

	@GetMapping("/showform")
	public String myForm(Model model) {

		Student stu = new Student();
		model.addAttribute("student", stu);
		return "regform";
	}

	@PostMapping("/saveStudent")
	public String SaveStudent2DB(@ModelAttribute("student") Student thestudent) {

		System.out.println("====" + stuser);
		stuser.saveCustomer(thestudent);

		return "redirect:/home";
	}

	@GetMapping("/updateForm")
	public String updateStudent2DB(@RequestParam("studentId") int theid, Model theModel) {

		Student stu = stuser.getstudent(theid);
		theModel.addAttribute("student", stu);
		return "regform";
	}
	
	@GetMapping("/deleteStudent")
	public String deleteStudent2DB(@RequestParam("studentId") int theid, Model theModel) {

		stuser.delstudent(theid);
		
		return "redirect:/home";
	}
	
	
}
