package com.nit.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.nit.beans.Student;
import com.nit.beans.StudentDAO;
import com.nit.beans.StudentService;

@Configuration
@EnableTransactionManagement
public class AppConfig {

	@Bean
	public DriverManagerDataSource dataSource() {

		DriverManagerDataSource ds = new DriverManagerDataSource();

		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");

		ds.setUrl("jdbc:mysql://localhost:3306/spring_jdbc_lab");

		ds.setUsername("root");
		ds.setPassword("Subham@123");

		return ds;
	}

	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource());
	}

	@Bean
	public PlatformTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource());
	}

	@Bean
	public StudentDAO studentDAO() {

		return new StudentDAO() {

			@Override
			public void saveStudent(Student student) {

				String sql = "insert into Student values(?,?,?,?)";

				jdbcTemplate().update(sql, student.getStudentId(), student.getStudentName(), student.getCourse(),
						student.getPendingFee());
			}

			@Override
			public Student getStudentById(int studentId) {

				String sql = "select * from Student where studentId=?";

				return jdbcTemplate().queryForObject(sql, new BeanPropertyRowMapper<>(Student.class), studentId);
			}

			@Override
			public void updatePendingFee(int studentId, double pendingFee) {

				String sql = "update Student set pendingFee=? where studentId=?";

				jdbcTemplate().update(sql, pendingFee, studentId);
			}

			@Override
			public List<Student> getAllStudents() {

				String sql = "select * from Student";

				return jdbcTemplate().query(sql, new BeanPropertyRowMapper<>(Student.class));
			}
		};
	}

	@Bean
	public StudentService studentService() {
		return new StudentService(studentDAO());
	}
}
