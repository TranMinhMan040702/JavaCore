package equals_hashcode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyClass {

	public static void main(String[] args) {
		Student student1 = new Student(1, "Nguyen Van A");
		Student student2 = new Student(1, "Nguyen Van A");
		
		
		System.out.println(student1.equals(student2));
		
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		
		Set<Student> mySet = new HashSet<>();
		mySet.add(student1);
		mySet.add(student2);
		
		Iterator<Student> iterator = mySet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}

}
