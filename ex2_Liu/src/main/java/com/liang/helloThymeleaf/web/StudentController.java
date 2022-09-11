package com.liang.helloThymeleaf.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.liang.helloThymeleaf.domain.Student;

@Controller
public class StudentController {
	@RequestMapping("/students")
	public String greeting(Model model) {
		Student st1 = new Student("liang", "liu");
		Student st2 = new Student("dong", "liu");
		Student st3 = new Student("shaoqi", "liu");
		List<Student> students= new ArrayList<Student>();
		students.add(st1);
		students.add(st2);
		students.add(st3);
		model.addAttribute("student",students);
		return "students";
	}
}
