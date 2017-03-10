/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.pojo.Employee;
import com.util.NHibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author APCL
 */
public class MyDao implements infoMethod {

    @Override
    public boolean doInsert(Employee emp) {
        boolean b = false;
        Session session = NHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(emp);
        session.getTransaction().commit();
        b = true;

        return b;
    }

    @Override
    public boolean doUpdate(Employee emp) {

        boolean b = false;
        Session session = NHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(emp);
        session.getTransaction().commit();
        b = true;

        return b;
    }

    @Override
    public boolean doDelete(Employee emp) {

        boolean b = false;
        Session session = NHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(emp);
        session.getTransaction().commit();
        b = true;

        return b;
    }

    @Override
    public List<Employee> ListEmpAll() {
        List<Employee> list = new ArrayList<Employee>();
        Session session  = NHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from Employee");
        list = query.list();
        if(list.size()>0){
            return list;
        }else {
            return null;
        }   
    }

    @Override
    public List<Employee> ListEmpById(int id) {
        List<Employee> list = new ArrayList<Employee>();
        Session session  = NHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from Employee where id=:e_id");
        query.setInteger("e_id", id);
        list = query.list();
        if(list.size()>0){
            return list;
        }else {
            return null;
        } 
    }

    public static void main(String[] args) {
        MyDao db = new MyDao();
//        Employee e = new Employee(1);
        if (db.ListEmpById(3).equals("")) {
            System.out.println("Sorry no list");
        } else {
            System.out.println("Ok");
        }
    }

}
