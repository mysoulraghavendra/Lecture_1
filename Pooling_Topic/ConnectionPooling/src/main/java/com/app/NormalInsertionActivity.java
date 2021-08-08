package com.app;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.entity.Employee;
import com.app.util.HibernateUtil;

public class NormalInsertionActivity {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
					Transaction transaction=null;
		
					try(Session session=HibernateUtil.getSessionFactory().openSession()) 
					{
						
						Employee employee =new Employee();
						employee.setName("Person1");
						employee.setSalary(1000);
						
						
						Employee employee1 =new Employee();
						employee1.setName("Person2");
						employee1.setSalary(2000);
						
						
						Employee employee2 =new Employee();
						employee2.setName("Person3");
						employee2.setSalary(3000);
						
						transaction=session.beginTransaction();
						
						
						
						
						session.save(employee);
						System.out.println("do you want to contnue::");
						char ch=scan.nextLine().charAt(0);
						session.save(employee1);
						System.out.println("do you want to contnue::");
						char ch1=scan.nextLine().charAt(0);
						session.save(employee2);
						System.out.println("do you want to contnue::");
						char ch2=scan.nextLine().charAt(0);
						
						
						
						transaction.commit();
						
						System.out.println("-------Record Inserted!-------");
						
						
						
						HibernateUtil.shutDown();
						
						
					} catch (Exception e) {
						// TODO: handle exception
						
						
						
						System.out.println("Reason of Error::"+e.getMessage());
					}
		
	}

}
