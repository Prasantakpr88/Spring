package com.pks.springbootstarter.topic;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public List<EmployeeVO> getAllEmployees() {

		List<EmployeeVO> employees = new ArrayList<EmployeeVO>();

		EmployeeVO vo1 = new EmployeeVO();
		vo1.setId(1);
		vo1.setFirstName("Prasanta");
		vo1.setLastName("Sahoo");
		employees.add(vo1);

		EmployeeVO vo2 = new EmployeeVO();
		vo2.setId(2);
		vo2.setFirstName("Sukanta");
		vo2.setLastName("Sahoo");
		employees.add(vo2);

		return employees;
	}

}
