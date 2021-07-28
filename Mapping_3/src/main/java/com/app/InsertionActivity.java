package com.app;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.app.entity.Employee;
import com.app.entity.Parking;
import com.app.util.HibernateUtil;

public class InsertionActivity {
	
	
	
	public static void main(String args[])
		{
				Transaction transaction=null;
				try(Session session=HibernateUtil.getSessionFactory().openSession()) 
				{
					
					
					transaction=session.beginTransaction();
					
					
					Parking parking1=new Parking();
					
					parking1.setVid("up32 11");
					parking1.setVname("Maruti 800");
					
					
					
					Parking parking2=new Parking();
					parking2.setVid("up32 22");
					parking2.setVname("Maruti Zen");
					
					List<Parking> list=new ArrayList<Parking>();
					
					list.add(parking1);
					list.add(parking2);
					
					Employee employee=new Employee();
					employee.setName("Person1");
					employee.setSalary(1000);
					
					employee.setParkingRecords(list);
					
					session.save(employee);
					
					
					
					transaction.commit();
					
					
					
					System.out.println("Record Inserted!");
					
					HibernateUtil.shutDown();
					
					
					
				} catch (Exception e) {
					// TODO: handle exception
					
					e.printStackTrace();
					HibernateUtil.shutDown();
					System.out.println("Reason of Error::"+e.getMessage());
				}
		
		}

}
