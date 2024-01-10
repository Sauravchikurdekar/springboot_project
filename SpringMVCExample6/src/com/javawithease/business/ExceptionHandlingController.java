package com.javawithease.business;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExceptionHandlingController {
   @RequestMapping(value = "/student", method = RequestMethod.GET)
   public ModelAndView student() {
      return new ModelAndView("student", "command", new Student());
   }
   
   @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
   @ExceptionHandler({SpringException.class})
   public String addStudent(@ModelAttribute("SpringWeb")Student student, 
   ModelMap model) {
      if(student.getName().length() < 5 ){
         throw new SpringException("Student name should contain atleast 5 characters.");
      }else{
    	  model.addAttribute("name", student.getName());
      }
      
      model.addAttribute("className", student.getClassName());     
      model.addAttribute("rollNo", student.getRollNo());
      
      return "welcome";
   }
}
