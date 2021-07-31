package com.app.OneEmployeeMultipleParking;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.app.OneEmployeeMultipleParking.util.HibernateUtil;
import com.app.OneEmployeeMultipleParkinge.entity.Employee;

public class ShowRecordsCachedActivity {
	
	
	public static void main(String args[])
		{
		
		
				try
					{
						SessionFactory factory=HibernateUtil.getSessionFactory();
						
						Session session1=factory.openSession();
						
						Transaction transaction=session1.beginTransaction();
						
						
						Employee emp=(Employee)session1.load(Employee.class, 1);
						
						System.out.println(emp);
						
						
						
						transaction.commit();
						
						session1.close();
						
					
					
					
					}
				catch(Exception e)
					{
					
							System.out.println("Reason of Error::"+e.getMessage());
					}
				
		
		}

}
