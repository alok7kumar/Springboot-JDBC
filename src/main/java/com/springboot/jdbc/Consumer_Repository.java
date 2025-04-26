package com.springboot.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class Consumer_Repository {
	
	@Autowired
	private JdbcTemplate jdbc;
	
	// Insert
	public void insertData(Consumer con) {
		String sql = "INSERT INTO consumer VALUES(?, ?, ?)";
			jdbc.update(sql, con.getConsumer_id(), con.getConsumer_name(), con.getProduct_name());
	}
	
	//	Update
	public void updateData(Consumer con) {
		String sql = "UPDATE consumer SET consumer_name=?, product_name=? WHERE consumer_id=?";
			jdbc.update(sql, con.getConsumer_name(), con.getProduct_name(), con.getConsumer_id());
	}
	
	// Delete
	public void deleteData(Consumer con) {
		String sql = "DELETE from consumer WHERE consumer_id=?";
			jdbc.update(sql, con.getConsumer_id());
	}
	
	// Fetch (first, Applying RowMapper interface for fetching)
	public class Myrow implements RowMapper<Consumer> {

		@Override
		public Consumer mapRow(ResultSet rs, int rowNum) throws SQLException {
			Consumer con = new Consumer();
				con.setConsumer_id(rs.getInt(1));
				con.setConsumer_name(rs.getString(2));
				con.setProduct_name(rs.getString(3));
			return con;
			}
		}

	// Fetch by Id
	public Consumer fetchById(int id) {
		String sql = "SELECT * FROM consumer WHERE consumer_id=?";
			return jdbc.queryForObject(sql, new Myrow(), id);	
	}
	
	// Fetch all data
	public List<Consumer> fetch() {
		String sql = "SELECT * FROM consumer";
		return jdbc.query(sql, new Myrow());
	}
	
}
