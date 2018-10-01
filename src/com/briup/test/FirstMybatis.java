package com.briup.test;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.briup.bean.IStudentMapper;
import com.briup.bean.Student;

public class FirstMybatis {
	public static void main(String[] args) throws FileNotFoundException {
		//1.获取SqlSession对象
		SqlSession session=null;
		SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
		//建造SqlsessionFactory时读取mybatis的配置文件
		SqlSessionFactory sessionFactory=builder.build(new FileReader("src/mybatis-cinfig.xml"));
		session=sessionFactory.openSession();
		//2.获取IStidentMapper接口类型的对象
		IStudentMapper iStudentMapper=session.getMapper(IStudentMapper.class);
		// iStudentMapper对象调用保存学生的方法
		Student student=new Student(1,"xia",1,"日本");
		iStudentMapper.saveStudent(student);
		//4.提交事务  手动提交
		session.commit();
		//5.关闭资源
		session.close();
	}

}
