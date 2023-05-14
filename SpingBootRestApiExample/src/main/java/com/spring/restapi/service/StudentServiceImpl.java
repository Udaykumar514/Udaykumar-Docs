package com.spring.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.restapi.entity.Student;
import com.spring.restapi.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudent(Student student) {
		
		studentRepository.delete(student);
	}

	@Override
	public Student findById(long id) {
		
		return studentRepository.findById(id).get();
	}

	@Override
	public List<Student> findAll() {
		
		return studentRepository.findAll();
	}

}
