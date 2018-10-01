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
	//����group����
	@Test
	public void saveGroup(){
		try {
			Group group=new Group("�ڰ���",null);
			mapper.saveGroup(group);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//����user����
	@Test
	public void saveUser(){
		Group group=new Group("�ڰ���",null);
		User user=new User("�ֿ���",20,"lanchi62","18455",group);
		mapper.saveGroup(group);
		mapper.saveUser(user);
	}
	//��ѯ��groupid��userǶ�׽����ѯ
	@Test
	public void selectganduById(){
		Group group=mapper.selectganduById(4);
		System.out.println(group);
	}
	//��ѯ��groupid��userǶ���Ӳ�ѯ
	@Test
	public void selectqanduById2(){
		Group group=mapper.selectqanduById2(4);
		System.out.println(group);
	}
	//��ѯ��userid��groupǶ�׽����ѯ
	@Test
	public void selectuandgById(){
		Set<User> users=mapper.selectuandgById(4);
		//users.forEach(System.out::println);
		for (User user : users) {
			System.out.println(user);
		}
	}
	//��ѯ��userid��groupǶ���Ӳ�ѯ
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


