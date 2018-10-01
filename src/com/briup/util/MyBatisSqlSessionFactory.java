package com.briup.util;
import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisSqlSessionFactory {
	private static SqlSessionFactory sessionFactory;
	static{
		try {
			SqlSessionFactoryBuilder sBuilder=new SqlSessionFactoryBuilder();
			InputStream inputStream=Resources.getResourceAsStream("mybatis-cinfig.xml");
			sessionFactory=sBuilder.build(inputStream);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public static SqlSession getSqlSession(){
		SqlSession session=null;
		try {
			if(sessionFactory!=null){
				session = sessionFactory.openSession();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		else{
//			try {
//				SqlSessionFactoryBuilder sBuilder=new SqlSessionFactoryBuilder();
//				InputStream inputStream=Resources.getResourceAsStream("mybatis-cinfig.xml");
//				sessionFactory=sBuilder.build(inputStream);
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
	
		return session;
	}
//	public static SqlSessionFactory getFactory(){
//		SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
//		Configuration configuration=new Configuration();
//		
//		
//	}

}
