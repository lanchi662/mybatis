package com.briup.dao;

import java.util.List;

import com.briup.m2m.Student;
import com.briup.m2m.Teacher;

public interface IM2MMapper {
	public List<Teacher> selectstuteaId(int id);
	public List<Student> selectteastuId(int id);
	public List<Student> selectstuandtea();
	public List<Teacher> selectteaandstu();
	public List<Teacher> select();

}
