package com.training.springcore.repo;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import com.training.springcore.model.Employee;

public class EmployeeDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveEmployee(Employee e) {
		String query = "insert into employee values('" + e.getId() + "','" + e.getName() + "','" + e.getSalary() + "')";
		System.out.println(query);
		return jdbcTemplate.update(query);
	}
	
	public Boolean saveEmployeeByPreparedStatement(final Employee e) {
		String query = "insert into employee values(?,?,?)";
		return jdbcTemplate.execute(query, (PreparedStatementCallback<Boolean>) ps -> {
		ps.setInt(1, e.getId());
		ps.setString(2, e.getName());
		ps.setFloat(3, e.getSalary());
		return ps.execute();
		});
	}
	public int updateEmployee(Employee e) {
		String query = "update employee set name='" + e.getName() + "',salary='" + e.getSalary() + "' where id='"
				+ e.getId() + "' ";
		System.out.println(query);
		return jdbcTemplate.update(query);
	}

	public int deleteEmployee(Employee e) {
		String query = "delete from employee where id='" + e.getId() + "' ";
		System.out.println(query);
		return jdbcTemplate.update(query);
	}
}
