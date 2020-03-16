package com.mkcodes.sqlreport.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DBConn implements AutoCloseable {

	private String jdbcUrl;
	private String username;
	private String password;
	private Connection conn;
	private ResultSet res = null;
	private PreparedStatement ps = null;
	private static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";

	public DBConn() {
		// @TODO
//		Properties props = getProperties();
		this.conn = getConnection();
	}

	public DBConn(String mJdbcUrl, String mUsername, String mPassword) {
		jdbcUrl = mJdbcUrl;
		username = mUsername;
		password = mPassword;
		this.conn = getConnection();
	}

	public Connection getConnection() {

		try {
			Class.forName(JDBC_DRIVER);
			conn = null;
			Properties connectionProps = new Properties();
			connectionProps.put("user", username);
			connectionProps.put("password", password);

			conn = DriverManager.getConnection(jdbcUrl, username, password);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public ResultSet fetch(String sql) {

		try {
			ps = conn.prepareStatement(sql);
			res = ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public void close() throws Exception {

	}

}
