package Chapter_10;

import java.util.ArrayList;

public class Employee {
	private String name;
	private String email;
	private ArrayList<Department> departmentList = new ArrayList<Department>();

	public Employee(String name, String email, Department department) {
		this.name = name;
		this.email = email;
		departmentList.add(department);
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public Department getDepartment(Department department) {
		return department;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setDepartment(Department department) {
		departmentList.add(department);
	}

	public String toString() {
		String outPut = ""; 
		for(Department department : departmentList) {
			outPut = department.getName(); 
		}
		return name + " (" +  email + "), " + outPut + " department"; 

	}

}
