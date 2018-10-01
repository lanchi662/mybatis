package com.briup.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.briup.bean.Husband;
import com.briup.bean.Wife;
import com.briup.dao.IOne2OneMapper;
import com.briup.util.MyBatisSqlSessionFactory;

public class O2OTest {
	SqlSession sqlSession=null;
	IOne2OneMapper mapper=null;
	
	@Test
	public void saveWife() {
		Wife wife=new Wife("张三wife");
		mapper.saveWife(wife);
	}
	@Test
	public void saveHus(){
		try {
			Wife wife=new Wife(1,"张三wife");
			Husband husband=new Husband("乌云",wife);
			mapper.saveHus(husband);
			System.out.println(husband);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//查询wife
	@Test
	public void selectWife() {
		try {
			Wife wife=mapper.selectWifeById(1);
			System.out.println(wife);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//查询Husband不包含wife
	@Test
	public void selectHusId(){
		try {
			Husband husband=mapper.selectHusId(22);
			System.out.println(husband);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//1.1查询Husband包含wife
	@Test
	public void selectHusandWifeId(){
		Husband husband=mapper.selectHusandWifeId(22);
		System.out.println(husband);
	}
	//1.2查询Husband包含wife
	@Test
	public void selectHusandWifeId12(){
		Husband husband=mapper.selectHusandWifeId12(23);
		System.out.println(husband);
	}
	//查询Husband包含wife嵌套子查询
	@Test
	public void selectHusandWifeId2(){
		Husband husband=mapper.selectHusandWifeId2(23);
		System.out.println(husband);
	}
	@Before
	public void before() {
		try {
			sqlSession=MyBatisSqlSessionFactory.getSqlSession();
			mapper=sqlSession.getMapper(IOne2OneMapper.class);
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
