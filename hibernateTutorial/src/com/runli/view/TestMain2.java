package com.runli.view;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.runli.domain.Employee;
import com.runli.util.MySessionFactory;

public class TestMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		
	}

	private static void deleteEmp() {
		Session session = MySessionFactory.getSessionFactory().openSession();
		Transaction ts = session.beginTransaction();
		Employee emp = (Employee) session.load(Employee.class, 3);
		session.delete(emp);
		ts.commit();
		session.close();
	}

	private static void updateEmp() {
		Session session = MySessionFactory.getSessionFactory().openSession();
		Transaction ts = session.beginTransaction();
		Employee emp = (Employee)session.load(Employee.class, 3);
		emp.setName("abc2");
		emp.setEmail("abc@gmail.com");
		ts.commit();
		session.close();
	}

	private static void addEmployee() {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		Employee emp1 = new Employee();
		emp1.setName("runli");
		emp1.setEmail("lirunliruntc@gmail.com");
		emp1.setHiredate(new Date());
		session.save(emp1);
		t.commit();
		session.close();
	}

}
