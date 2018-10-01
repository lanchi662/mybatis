package com.briup.handler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import com.briup.bean.Address;

public class AddHandler extends BaseTypeHandler<Address>{

	@Override
	public Address getNullableResult(ResultSet resultSet, String columnName) throws SQLException {
		
		String info=resultSet.getString(columnName);
		Address address=new Address();
		if(info!=null){
			String[] arr=info.split("[-]");
			address.setPrivoce(arr[0]);
			address.setCity(arr[1]);
			address.setStress(arr[2]);
		}
		return address;
	}

	@Override
	public Address getNullableResult(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address getNullableResult(CallableStatement arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNonNullParameter(PreparedStatement pStatement, int i, Address address, JdbcType jType) throws SQLException {
		String info=address.getPrivoce()+"-"+address.getCity()+"-"+address.getStress();
		pStatement.setString(i, info);
	}

}
