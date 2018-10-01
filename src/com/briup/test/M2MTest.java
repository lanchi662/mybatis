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
		//查询1号学生的所有老师信息
//		List<Teacher> list=mapper.selectstuteaId(1);
//		list.forEach(System.out::println);
		//查询1号老师的所有学生
//		List<Student> list=mapper.selectteastuId(1);
//		list.forEach(System.out::println);
		//查询学生信息包含老师信息
//		List<Student> list=mapper.selectstuandtea();
//		list.forEach(System.out::println);
		//查询老师信息包含学生信息
//		List<Teacher> list=mapper.selectteaandstu();
//		list.forEach(System.out::println);
		//查询老师信息包含学生信息嵌套结果集
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
