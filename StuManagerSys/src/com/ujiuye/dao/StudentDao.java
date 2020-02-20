package com.ujiuye.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.ujiuye.entity.Student;



public class StudentDao {
	QueryRunner qRunner = new QueryRunner(new ComboPooledDataSource());
	public int insertStu(Student student) {
		String sql = "INSERT INTO student(sname,sgender,shobby,sdegree,smark) VALUES(?,?,?,?,?)";
		int r = 0;
		try {
			r = qRunner.update(sql, student.getSname(),student.getSgender(),student.getShobby(),student.getShobby(),student.getSdegree(),student.getSmark());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;
		
	}
}
