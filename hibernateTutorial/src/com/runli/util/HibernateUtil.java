package com.runli.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

final public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	//ʹ���ֲ߳̾�ģʽ
	private static ThreadLocal<Session> threadLocal = new ThreadLocal<>();
	private HibernateUtil() {};
	
	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}
	
	//��ȡȫ�µ�session
	public static Session openSession() {
		return sessionFactory.openSession();
	}
	
	//��ȡ���̹߳�����session
	public static Session getCurrentSession() {
		
		Session session = threadLocal.get();
		if(session == null) {
			session =sessionFactory.openSession();
			threadLocal.set(session);
		}	
		
		return session;
	}
	
}
