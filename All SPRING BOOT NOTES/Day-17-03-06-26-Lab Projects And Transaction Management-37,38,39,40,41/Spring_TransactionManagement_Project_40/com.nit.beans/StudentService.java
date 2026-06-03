package com.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {
	
	@Autowired
	StudentDao dao;
	
	@Transactional
    public void registerStudent() {
    	dao.saveStudent();
    	//int a=10/0;
    	dao.saveCourse();
    }
}
