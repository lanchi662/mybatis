package com.briup.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.briup.dao.IM2MMapper;
import com.briup.m2m.Student;
import com.briup.m2m.Teacher;
import com.briup.util.MyBatisSqlSessionFactory;

public class M2MTest {
	SqlSession sqlSession=null;
	IM2MMapper mapper=null;
	
	
	@Test
	public void select(){
		//��ѯ1��ѧ����������ʦ��Ϣ
//		List<Teacher> list=mapper.selectstuteaId(1);
//		list.forEach(System.out::println);
		//��ѯ1����ʦ������ѧ��
//		List<Student> list=mapper.selectteastuId(1);
//		list.forEach(System.out::println);
		//��ѯѧ����Ϣ������ʦ��Ϣ
//		List<Student> list=mapper.selectstuandtea();
//		list.forEach(System.out::println);
		//��ѯ��ʦ��Ϣ����ѧ����Ϣ
//		List<Teacher> list=mapper.selectteaandstu();
//		list.forEach(System.out::println);
		//��ѯ��ʦ��Ϣ����ѧ����ϢǶ�׽����
		List<Teacher> list=mapper.select();
		list.forEach(System.out::println);
	}
	
	@Before
	public void before() {
		try {
			sqlSession=MyBatisSqlSessionFactory.getSqlSession();
			mapper=sqlSession.getMapper(IM2MMapper.class);
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
