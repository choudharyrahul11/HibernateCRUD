package com.rahul.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactoryUtil {

	private static StandardServiceRegistry standardServiceRegistry;
	private static SessionFactory sessionFactory;

	static {

		if (sessionFactory == null) {
			Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
			StandardServiceRegistryBuilder sb = new StandardServiceRegistryBuilder();

			sb.applySettings(cfg.getProperties());
			standardServiceRegistry = sb.build();
			sessionFactory = cfg.buildSessionFactory(standardServiceRegistry);
		}

	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
