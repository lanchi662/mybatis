package com.briup.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.briup.dao.ISpecialMapper;
import com.briup.special.Gender;
import com.briup.special.User1;
import com.briup.util.MyBatisSqlSessionFactory;

public class SpecailTest {
	
	SqlSession sqlSession=null;
	ISpecialMapper mapper=null;
	@Test
	public void specail(){
		User1 user1=new User1(3,"À²À²3",Gender.FEMALE);
		mapper.saveUser1(user1);
	}
	
	@Before
	public void before() {
		try {
			sqlSession=MyBatisSqlSessionFactory.getSqlSession();
			mapper=sqlSession.getMapper(ISpecialMapper.class);
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
