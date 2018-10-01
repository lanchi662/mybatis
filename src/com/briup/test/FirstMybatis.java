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
		//1.��ȡSqlSession����
		SqlSession session=null;
		SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
		//����SqlsessionFactoryʱ��ȡmybatis�������ļ�
		SqlSessionFactory sessionFactory=builder.build(new FileReader("src/mybatis-cinfig.xml"));
		session=sessionFactory.openSession();
		//2.��ȡIStidentMapper�ӿ����͵Ķ���
		IStudentMapper iStudentMapper=session.getMapper(IStudentMapper.class);
		// iStudentMapper������ñ���ѧ���ķ���
		Student student=new Student(1,"xia",1,"�ձ�");
		iStudentMapper.saveStudent(student);
		//4.�ύ����  �ֶ��ύ
		session.commit();
		//5.�ر���Դ
		session.close();
	}

}
