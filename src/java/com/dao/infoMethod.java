/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.pojo.Employee;
import java.util.List;

/**
 *
 * @author APCL
 */
public interface infoMethod {
    
    public boolean doInsert(Employee emp);
    public boolean doUpdate(Employee emp);
    public boolean doDelete(Employee emp);
    public List<Employee> ListEmpAll();
    public List<Employee> ListEmpById(int id);
    
}
