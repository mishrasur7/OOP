package Chapter_10;

public class Course {
	// 1. Instance fields (must be non-static)
	private String code;
	private String name;
	// 2. Constructor (Java invokes the constructor automatically on a newly created object)
	public Course(String code, String name) {
	this.code = code; // this.code is an instance field of the current object.
	this.name = name; // code is a local variable in the constructor.
	}
	// 3. Instance methods (must be non-static; getters, setters, toString)
	public String getCode() {
	return code;
	}
	public String getName() {
	return name;
	}
	public void setCode(String code) {
	this.code = code;
	}
	public void setName(String name) {
	this.name = name;
	}
	public String toString() {
	return code + ": " + name;
	}
	}
