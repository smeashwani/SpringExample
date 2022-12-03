package com.training.springcore.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

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

	public List<Employee> getAllEmployees() {
		return jdbcTemplate.query("select * from employee", (ResultSetExtractor<List<Employee>>) rs -> {

			List<Employee> list = new ArrayList<>();
			while (rs.next()) {
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getInt(3));
				list.add(e);
			}
			return list;
		});
	}

	public List<Employee> getAllEmployeesRowMapper() {
		return jdbcTemplate.query("select * from employee", new RowMapper<Employee>() {
			@Override
			public Employee mapRow(ResultSet rs, int rownumber) throws SQLException {
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getInt(3));
				return e;
			}
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
