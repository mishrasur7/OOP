package Chapter_10;

import java.util.ArrayList;

public class Practice {

	public static void main(String[] args) {
		ArrayList<Course> courseList = new ArrayList<Course>();
		courseList.add(new Course("swd4tf014", "Programming 1"));
		for (int i = 0; i < courseList.size(); i++) {
			 System.out.println(courseList.get(i));
			}

	}

}


