package com.Serilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Address implements Serializable {

	String streetName;
}

class Employee implements Serializable {

	String firstName;
	Address address;
}

public class M4 {

	public static void main(String[] args) throws Exception {

		Employee emp = new Employee();
		emp.firstName = "abc";
		emp.address = new Address();
		emp.address.streetName = "BTM";

		FileOutputStream fout = new FileOutputStream("emp.abc");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(fout);
		System.out.println("done");

		System.out.println("===============");

		FileInputStream fin = new FileInputStream("emp.abc");
		ObjectInputStream in = new ObjectInputStream(fin);
		Employee emp1 = (Employee) in.readObject();
		System.out.println(emp1.firstName);

	}

}
