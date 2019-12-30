package ua.lviv.lgs;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) throws Exception {
		File file = new File("serialize.txt");
		Employee emp = new Employee("Mark", 23155, 15273.22);
		Methods.serialize(file, emp);
		System.out.println(Methods.deserialize(file));

		System.out.println();
		Employee2 emp2 = new Employee2("Mark", 23155, 15273.22);
		Methods.serialize(file, emp2);
		System.out.println(Methods.deserialize(file));
		
		System.out.println();
		File file2 = new File("serializeCollection.txt");
		List<Employee> people = new ArrayList<>();
		people.add(new Employee("Bob", 45869, 18795.36));
		people.add(new Employee("Stiven", 25841, 26587.14));
		people.add(new Employee("David", 85745, 17895.58));
		people.add(new Employee("Barbara", 124578, 24785.23));
		people.add(new Employee("Kyle", 658423, 18795.36));
		Methods.serialize(file2, (Serializable)people);
		
		List<Employee> peopleAfterSerialize = new ArrayList<>();
		peopleAfterSerialize = (List<Employee>) Methods.deserialize(file2);
		
		for (Employee employee : peopleAfterSerialize) {
			System.out.println(employee);
		}

	}


}
