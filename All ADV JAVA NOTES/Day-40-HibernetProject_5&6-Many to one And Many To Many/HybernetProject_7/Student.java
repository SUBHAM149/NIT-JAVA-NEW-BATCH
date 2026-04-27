package com.nit.dto;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
@Entity
public class Student {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private  int s_id;
        private  String Name;
        private  long mob_num;
        
        @ManyToMany
        @JoinTable(name="student_course")
        List<Course>course;
        
		public int getS_id() {
			return s_id;
		}
		public void setS_id(int s_id) {
			this.s_id = s_id;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public long getMob_num() {
			return mob_num;
		}
		public void setMob_num(long mob_num) {
			this.mob_num = mob_num;
		}
		
		
		public List<Course> getCourse() {
			return course;
		}
		public void setCourse(List<Course> course) {
			this.course = course;
		}
		
		
		@Override
		public String toString() {
			return "Student [s_id=" + s_id + ", Name=" + Name + ", mob_num=" + mob_num + "]";
		}
        
        
        
}
