package com.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.app.entity.Employee;

import com.app.util.HibernateUtil;



public class TestActivity {
	
	public static void main(String args[])
		{
				
		
		
				try 
				{
					
					
					SessionFactory factory=HibernateUtil.getSessionFactory();
					
					
					Session session_1=factory.openSession();
					
					
					List<Employee> _list=session_1.createQuery("from Employee").setCacheable(true).setCacheRegion("MyEmployee.cache").getResultList();
					
					
					
					for(Employee emp:_list)
						{
								System.out.println(emp);
								
						}
					
					
					
					
					
					session_1.close();
					
					
					System.out.println("First Session Over------Second Session Begins........");
					
					
					
					Session session_2=factory.openSession();
					
					
					List<Employee> _list1=session_2.createQuery("from Employee").setCacheable(true).setCacheRegion("MyEmployee.cache").getResultList();
					
					
					
					for(Employee emp:_list1)
						{
								System.out.println(emp);
								
						}
					
					
					session_2.close();
					
					
					
					
					
					factory.close();
					
					
					
					
					
				} catch (Exception e) {
					// TODO: handle exception
					
					e.printStackTrace();
					
					System.out.println("Reason of Error::"+e.getMessage());
				}
				
				
				
				
		
		}

}
