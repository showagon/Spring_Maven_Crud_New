package com.abd.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abd.model.Student;
import com.abd.repository.StuDao;

@Service
public class Stuservice {

	@Autowired
	StuDao studao;
	
	@Transactional
	public List<Student> getStudentListSer() {
		
	List<Student> stu =	studao.getStudentDetailsDao();
		
		return stu;
	}

	@Transactional
	public void saveCustomer(Student thestudent) {
		// TODO Auto-generated method stub
		studao.saveCustomer(thestudent);
	}

	@Transactional
	public Student getstudent(int theid) {
		// TODO Auto-generated method stub
		return studao.getsingleStudent(theid);
	}
	
	@Transactional
	public void delstudent(int theid) {
		studao.delStudent(theid);
		
	}

}
