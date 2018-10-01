package com.briup.test;
import java.io.FileReader;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import com.briup.bean.Student;

public class MybatisBase {
	//查询信息
	@Test
	public  void selectStudent() {
		SqlSession session=null;
		try {
			SqlSessionFactoryBuilder sBuilder=new SqlSessionFactoryBuilder();
			SqlSessionFactory sessionFactory=sBuilder.build(new FileReader("src/mybatis-cinfig.xml"));
			session=sessionFactory.openSession();
			Student student=new Student();
			student.setId(1);
			Student student2=session.selectOne("selectStudent",student.getId());
			System.out.println(student2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(session!=null){
				session.rollback();
			}
			if(session!=null){
				session.close();
			}
		}
	}
	@Test
	public void saveStudent(){
		SqlSession session=null;
		try {
			SqlSessionFactoryBuilder sBuilder=new SqlSessionFactoryBuilder();
			InputStream inputStream=Resources.getResourceAsStream("mybatis-cinfig.xml");
			SqlSessionFactory sessionFactory=sBuilder.build(inputStream);
			 session=sessionFactory.openSession();
			//1.直接使用映射文件 保存信息
			session.insert("com.briup.bean.IStudentMapper.insertStudent");
			
			//手动提交
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(session!=null){
				session.rollback();
			}
			if(session!=null){
				session.close();
			}
		}
		
	}

}
