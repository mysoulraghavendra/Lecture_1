package com.app.OneEmployeeMultipleParking;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.app.OneEmployeeMultipleParking.entity.Employee;
import com.app.OneEmployeeMultipleParking.util.HibernateUtil;

public class ShowRecordsCachedActivity {
	
	public static void main(String args[])
	{
	
	
			try
				{
					SessionFactory factory=HibernateUtil.getSessionFactory();
					
					Session session1=factory.openSession();
					
					Transaction transaction=session1.beginTransaction();
					
					
					List<Employee> _list=session1.createQuery("from Employee").setCacheable(true).setCacheRegion("vedprakashcache.cache").getResultList();
					for(Employee emp:_list)
					{
						
							System.out.println("-----------------------------------------------");
					
							System.out.println(emp);
							
							System.out.println("-----------------------------------------------");
					}
			
			
			
					
					
					
					transaction.commit();
					
					session1.close();
					
					
					System.out.println("--------------------------Session 1 Finished-----------");
					
					
					
					
					Session session_2=factory.openSession();
					_list.clear();
					
					_list=session_2.createQuery("from Employee").setCacheable(true).setCacheRegion("vedprakashcache.cache").getResultList();
					
					
					for(Employee employee:_list)
						{		
								System.out.println(employee);
					
						}
					
					
					
					HibernateUtil.shutDown();
					
					
				
				}
			catch(Exception e)
				{
				
				HibernateUtil.shutDown();
				
						System.out.println("Reason of Error::"+e.getMessage());
				}
			
	
	}

}
