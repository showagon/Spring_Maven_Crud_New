package com.abd.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.abd.model.Student;

@Repository
public class StuDao {

	@Autowired
	private SessionFactory sessionFactory;

	public List<Student> getStudentDetailsDao() {

//		Student stu1 = new Student(100, "Abdul", "Vellore", "9445807206", "Java", "Male");
//		Student stu2 = new Student(101, "Raju", "Bihar", "9055807207", ".Net", "Male");
//		Student stu3 = new Student(102, "Aniket", "Pune", "9065807208", "C++", "Male");
//		Student stu4 = new Student(103, "Thiru", "Chennai", "9445807209", "PHP", "Male");
//		
//		
//		List<Student> stual =new ArrayList<Student>();
//		stual.add(stu1);
//		stual.add(stu2);
//		stual.add(stu3);
//		stual.add(stu4);
		Session cursession = sessionFactory.getCurrentSession();
		Query<Student> thequery = cursession.createQuery("from Student", Student.class);
		List<Student> student = thequery.getResultList();

		return student;
	}

	public void saveCustomer(Student thestudent) {
		Session cursession = sessionFactory.getCurrentSession();

		
		
		cursession.saveOrUpdate(thestudent);

	}

	public Student getsingleStudent(int theid) {
		Session cursession = sessionFactory.getCurrentSession();
		
		Student student = cursession.get(Student.class,theid);
		return student;
	}

	public void delStudent(int theid) {
		Session cursession = sessionFactory.getCurrentSession();
		Query<?> thequery = cursession.createQuery("delete from Student where id=:stuid");
		thequery.setParameter("stuid", theid);
		thequery.executeUpdate();
		
	}

}
