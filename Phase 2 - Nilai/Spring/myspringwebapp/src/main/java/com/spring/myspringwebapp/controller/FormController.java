package com.spring.myspringwebapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.myspringwebapp.model.Student;

@Controller
public class FormController {

	@RequestMapping(method = RequestMethod.GET, name="/StudentForm" )
	public String goForm(){
		return "StudentForm";
	}
	
	
	@RequestMapping(method = RequestMethod.POST, name="/StudentDetailsUpper")
	public String getDetailsInUpperCase(HttpServletRequest request, Model theModel ) {
		String message = "Hi "+(request.getParameter("fname")).toUpperCase();
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		String department = request.getParameter("dept");
		theModel.addAttribute("M", (Student)new Student(firstName,lastName,department));
		
		return "StudentDetails";
	}
	

}
