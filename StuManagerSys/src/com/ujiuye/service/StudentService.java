package com.ujiuye.service;

import com.ujiuye.dao.StudentDao;
import com.ujiuye.entity.Student;

public class StudentService {
	StudentDao studentDao = new StudentDao();
	public boolean isinsertStu(Student student) {
	int r = studentDao.insertStu(student);
		return r>0?true:false;
	}
}
