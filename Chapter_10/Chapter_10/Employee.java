package Chapter_10;

import java.util.ArrayList;

public class Employee {
	private String name; 
	private String email; 
	private ArrayList<Department> department = new ArrayList<Department>(); 
	
	public Employee(String name, String email, Department department) {
		this.name = name; 
		this.email = email;
		this.department = department; 
	}
	
	public String getName() {
		return name; 
	}
	public String getEmail() {
		return email; 
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	public void setEmail(String email) {
		this.email = email; 
	}
	
	public String toString() {
		
	}

}
