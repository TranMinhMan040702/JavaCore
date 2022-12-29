package file_io;

import java.util.ArrayList;
import java.util.List;

public class MyClass {
	
	public static final String FILE_NAME = "src/file_io/student.csv";
	public static final String COMMA = ",";
	
	public static void main(String[] args) {
		
		
		Student student_1 = new Student(1, "Tran Minh Man");
		Student student_2 = new Student(2, "Dang Hoang Ngoc Tuyen");
		Student student_3 = new Student(3, "Tran Man");
		
		List<Student> listStudent = new ArrayList<>();
		listStudent.add(student_1);
		listStudent.add(student_2);
		listStudent.add(student_3);
		
		// Write file
//		String line = null;
//		for (Student student : listStudent) {
//			line = student.getId() + COMMA + student.getName();
//			FileUtils.writeFile(FILE_NAME, line);
//		}
		// Read file
		List<Student> students = new ArrayList<>();
		List<String> listLine = FileUtils.readFile(FILE_NAME);
		
		for (String item : listLine) {
			String[] studentSplit = item.split(COMMA);
			Student student = new Student(Integer.parseInt(studentSplit[0]), studentSplit[1]);
			students.add(student);
		}
		
		for (Student student : students) {
			System.out.println(student.toString());
		}
		
	}
}
