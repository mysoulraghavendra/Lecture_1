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
					
					
					//Second Record
					
					Parking parking3=new Parking();
					
					parking3.setVid("up32 33");
					parking3.setVname("Bolero");
					
					
					
					Parking parking4=new Parking();
					parking4.setVid("up32 44");
					parking4.setVname("Scorpio");
					
				
					
					
					List<Parking> list=new ArrayList<Parking>();
					
					list.add(parking1);
					list.add(parking2);
					
					
					List<Parking> list1=new ArrayList<Parking>();
					list1.add(parking3);
					list1.add(parking4);
					
					Employee employee=new Employee();
					employee.setName("Person1");
					employee.setSalary(1000);
					
					Employee employee1=new Employee();
					employee1.setName("Person2");
					employee1.setSalary(2000);
					
					employee.setParkingRecords(list);
					employee1.setParkingRecords(list1);
					
					session.save(employee);
					session.save(employee1);
					
					
					
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
