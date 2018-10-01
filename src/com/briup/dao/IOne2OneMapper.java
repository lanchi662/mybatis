package com.briup.dao;

import com.briup.bean.Husband;
import com.briup.bean.Wife;

public interface IOne2OneMapper {
	public void saveWife(Wife wife);
	public void saveHus(Husband husband);
	public Wife selectWifeById(int id);
	public Husband selectHusId(int id);
	public Husband selectHusandWifeId(int id);
	public Husband selectHusandWifeId2(int id);
	public Husband selectHusandWifeId12(int id);
	

}
