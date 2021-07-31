package com.app.OneEmployeeMultipleParking;

import java.util.List;

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
					
					
					List<Employee> _list=session1.createQuery("from Employee").getResultList();
					
					
					
					
					transaction.commit();
					
					session1.close();
					HibernateUtil.shutDown();
					
					
					for(Employee emp:_list)
						{
						
								System.out.println(emp);
						}
				
				
				
				}
			catch(Exception e)
				{
				
				HibernateUtil.shutDown();
				
						System.out.println("Reason of Error::"+e.getMessage());
				}
			
	
	}

}
