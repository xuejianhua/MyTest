package com.joshua.untils;



import java.sql.Connection;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DaoUtils {
	private static DataSource source=new ComboPooledDataSource();
	private DaoUtils(){}
	public static DataSource getSource(){
		return source;
	}
	public static Connection getConn(){
		try {
			return source.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
