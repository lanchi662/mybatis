package com.briup.bean;
/*
 * dao层接口
 */

public interface IStudentMapper {
	/*
	 *保存学生信息 
	 * 
	 */
	public void saveStudent(Student student);
	public void insertStudent();

}
