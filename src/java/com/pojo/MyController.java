/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pojo;

import com.dao.MyDao;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



/**
 *
 * @author APCL
 */
@Controller
public class MyController {
    
    MyDao db;
    @RequestMapping(value = "/submit.htm", method = RequestMethod.POST)
    public ModelAndView showData(@ModelAttribute("emp") Employee e){
    db = new MyDao();
    db.doInsert(e);
    ModelAndView model = new ModelAndView("show");
    return model;
    }  
    
    @RequestMapping(value = "/showAll.htm", method = RequestMethod.POST)
    public ModelAndView showAllDataFromDataBase(@ModelAttribute("emp") Employee e, Model m){
        List<Employee> empList = new ArrayList<Employee>();
        db = new MyDao();
        empList = db.ListEmpAll();
        m.addAttribute("mymodel", empList);
        ModelAndView model = new ModelAndView("showAll");
        return model;
    }
    
    @RequestMapping(value = "/goToForm.htm", method = RequestMethod.GET)
    public ModelAndView returnForm(){
        ModelAndView model = new ModelAndView("myForm");
        return model;
    }
    
    @RequestMapping(value = "/deleteItem.htm", method = RequestMethod.GET)
    public ModelAndView forDelete(@ModelAttribute("dlt")  Employee e){
        db.doDelete(e);
        ModelAndView model = new ModelAndView("myForm");
        return model;
    }
    
    @RequestMapping(value = "/editeItem.htm") //method = RequestMethod.GET
    public String forEdit(@ModelAttribute("edit")  Employee e, Model m){
       
        
        return "updatePage";
    }
   
    @RequestMapping(value = "/edite.htm") //method = RequestMethod.GET
    public ModelAndView actionEdit(@ModelAttribute("edit")  Employee e, Model m){
       List<Employee> empList = new ArrayList<Employee>();
        db = new MyDao();
        db.doUpdate(e);
        empList = db.ListEmpAll();
        m.addAttribute("mymodel", empList);
        ModelAndView model = new ModelAndView("showAll");
        return model;
    }
    
}
