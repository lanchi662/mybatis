package com.briup.dao;

import java.util.Set;

import com.briup.one2m.Group;
import com.briup.one2m.User;

public interface IOne2MMapper {
	public void saveGroup(Group group);
	public void saveUser(User user);
	public Group selectganduById(int id);
	public Group selectqanduById2(int id);
	public Set<User> selectuandgById(int id);
	public Set<User> selectuandgById2(int id);

}
