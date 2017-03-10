/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author APCL
 */

@Entity
public class Employee {
    
    @Id
    private int id;
    private String name;
    private String email;
    private String dob;

    
    
    
    public Employee(int id) {
        this.id = id;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee() {
    }

    public Employee(int id, String name, String email, String dob) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    
     @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", email=" + email + ", dob=" + dob + '}';
    }
    
}
