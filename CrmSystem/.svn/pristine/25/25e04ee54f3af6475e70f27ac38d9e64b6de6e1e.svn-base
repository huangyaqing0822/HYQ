package com.lxit.crmsystem;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ZymTest {
	private static ApplicationContext ac;

	public static void main(String[] args) {
		ac = new ClassPathXmlApplicationContext("spring.xml");
		SqlSessionFactory sessionFactory = ac.getBean(SqlSessionFactory.class);
		sessionFactory.openSession().selectList("");
	}
}
