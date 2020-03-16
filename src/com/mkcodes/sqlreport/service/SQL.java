package com.mkcodes.sqlreport.service;

import java.util.List;

public class SQL {

	private List<SQLObject> returns;

	public void fetchAll() {

		// Populate returns list with SQLObject builders
		// @TODO

		// Run all fetch() commands
		returns.forEach(r -> r.fetch());

	}
}
