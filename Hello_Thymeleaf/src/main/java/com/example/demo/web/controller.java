package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controller {
 @RequestMapping("/ex1")
public String greeting(@RequestParam(name="name") String name, Model model) {
 model.addAttribute("name", name);
 return "hello";
 }
}