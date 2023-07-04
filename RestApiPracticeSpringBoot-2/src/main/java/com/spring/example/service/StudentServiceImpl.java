package com.spring.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.example.entity.Student;
import com.spring.example.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	public StudentRepository studentRepository;
	
	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudent(long id) {
		studentRepository.deleteById(id);
		
	}

	@Override
	public Student findById(long id) {
		
		return studentRepository.findById(id).get();
	}

	@Override
	public List<Student> getAllStudentDetails() {
		
		return studentRepository.findAll();
	}

}
