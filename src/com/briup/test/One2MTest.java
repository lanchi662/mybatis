package com.briup.test;

import java.util.Set;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.briup.dao.IOne2MMapper;
import com.briup.one2m.Group;
import com.briup.one2m.User;
import com.briup.util.MyBatisSqlSessionFactory;

public class One2MTest {
	SqlSession sqlSession=null;
	IOne2MMapper mapper=null;
	//保存group对象
	@Test
	public void saveGroup(){
		try {
			Group group=new Group("第八组",null);
			mapper.saveGroup(group);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//保存user对象
	@Test
	public void saveUser(){
		Group group=new Group("第八组",null);
		User user=new User("贾俊红",20,"lanchi62","18455",group);
		mapper.saveGroup(group);
		mapper.saveUser(user);
	}
	//查询用groupid查user嵌套结果查询
	@Test
	public void selectganduById(){
		Group group=mapper.selectganduById(4);
		System.out.println(group);
	}
	//查询用groupid查user嵌套子查询
	@Test
	public void selectqanduById2(){
		Group group=mapper.selectqanduById2(4);
		System.out.println(group);
	}
	//查询用userid查group嵌套结果查询
	@Test
	public void selectuandgById(){
		Set<User> users=mapper.selectuandgById(4);
		//users.forEach(System.out::println);
		for (User user : users) {
			System.out.println(user);
		}
	}
	//查询用userid查group嵌套子查询
	@Test
	public void selectuandgById2(){
		try {
			Set<User> users=mapper.selectuandgById2(3);
			users.forEach(System.out::println);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Before
	public void before() {
		try {
			sqlSession=MyBatisSqlSessionFactory.getSqlSession();
			mapper=sqlSession.getMapper(IOne2MMapper.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@After
	public void commitSession() {
		try {
			sqlSession.commit();
			sqlSession.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}


