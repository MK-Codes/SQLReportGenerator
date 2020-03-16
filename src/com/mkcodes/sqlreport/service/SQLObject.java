package com.mkcodes.sqlreport.service;

import java.sql.ResultSet;

import com.mkcodes.sqlreport.database.DBConn;

public class SQLObject {

	private String title, command;
	private ResultSet res;

	public SQLObject(String mTitle, String mCommand) {
		title = mTitle;
		command = mCommand;
	}

	public SQLObject fetch() {

		DBConn conn = new DBConn();
		res = conn.fetch(command);
		return this;
	}
}
