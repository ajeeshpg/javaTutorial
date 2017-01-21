package com.ajeesh.utils;

import java.util.Arrays;
import java.util.Comparator;

public class SortTest {

	public static void main(String[] args) {
		Employee[] empArr = new Employee[4];
		empArr[0] = new Employee(10, "Mikey", 25, 10000);
		empArr[1] = new Employee(20, "Arun", 29, 20000);
		empArr[2] = new Employee(5, "Pankaj", 35, 5000);
		empArr[3] = new Employee(1, "Pankaj", 32, 50000);
		Arrays.sort(empArr, new Employee());
		for(int i = 0; i < empArr.length; i++)
		System.out.println(">>"+empArr[i]);


	}

}

class Employee implements Comparator<Employee> {

    private int id;
    private String name;
    private int age;
    private long salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString(){
		return this.id+","+this.name+","+this.age+","+this.salary;
				
				
	}

	@Override
	public int compare(Employee o1, Employee o2) {
	
		int flag = o1.name.compareTo(o2.name);
		if(flag == 0){
			flag = o1.id - o2.id;
		}
		return flag;
	}

}