package com.runli.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

final public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	//使用线程局部模式
	private static ThreadLocal<Session> threadLocal = new ThreadLocal<>();
	private HibernateUtil() {};
	
	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}
	
	//获取全新的session
	public static Session openSession() {
		return sessionFactory.openSession();
	}
	
	//获取和线程关联的session
	public static Session getCurrentSession() {
		
		Session session = threadLocal.get();
		if(session == null) {
			session =sessionFactory.openSession();
			threadLocal.set(session);
		}	
		
		return session;
	}
	
}
