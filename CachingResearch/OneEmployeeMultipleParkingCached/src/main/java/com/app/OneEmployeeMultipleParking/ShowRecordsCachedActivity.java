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
					
					
					List<Employee> _list=session1.createQuery("from Employee").getResultList();
					for(Employee emp:_list)
					{
						
							System.out.println("-----------------------------------------------");
					
							System.out.println(emp);
							
							System.out.println("-----------------------------------------------");
					}
			
			
			
					
					
					
					transaction.commit();
					
					session1.close();
					HibernateUtil.shutDown();
					
					
				
				}
			catch(Exception e)
				{
				
				HibernateUtil.shutDown();
				
						System.out.println("Reason of Error::"+e.getMessage());
				}
			
	
	}

}
