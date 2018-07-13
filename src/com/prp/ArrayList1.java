package com.prp;
import java.util.*;
import com.prp.Employee;

public class ArrayList1 {

	public static void main(String[] args) {
		
		Employee emp1=new Employee(1,"Arun1","abcd1",6000);
		Employee emp2=new Employee(2,"Arun2","abcd2",6050);
		Employee emp3=new Employee(3,"Arun3","abcd3",6090);
		Employee emp4=new Employee(4,"Arun4","abcd4",600);
		Employee[] arr= {emp1,emp2,emp3,emp4};
		
		List<Employee> empList=new ArrayList<Employee>(Arrays.asList(arr));
		empList.add(new Employee(5,"ak","aaa",87));
		System.out.println(empList);
		System.out.println(empList.get(1));
		System.out.println(empList.get(4));
		
		Comparator<Employee> comparator=new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return Integer.compare(o1.getSalary(),o2.getSalary());//o2 ,o1 sorts in descending order
			}
		};
		Collections.sort(empList,comparator);
		Iterator<Employee> iter=empList.iterator();
		while(iter.hasNext()) {
			Employee em=iter.next();
		System.out.println(em.getId()+" "+em.getName()+" "+em.getAddress()+" "+em.getSalary()); 
		
		}
	}

}
