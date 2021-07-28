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
		
				try {
					
					SessionFactory factory=HibernateUtil.getSessionFactory();
					
					
					
					Session session1=factory.openSession();
					
					Transaction transaction=session1.beginTransaction();
					
					Parking parking1=new Parking();
					parking1.setVid("up3211");
					parking1.setVname("Maruti800");
					
					
					Parking parking2=new Parking();
					parking2.setVid("up3222");
					parking2.setVname("MarutiZen");
					
					
					List<Parking> list=new ArrayList<Parking>();
					
					list.add(parking1);
					list.add(parking2);
					
					
					Employee emp=new Employee();
					
					emp.setCode(6);
					emp.setName("Employee6");
					emp.setSalary(60000);
					emp.setParkingRecords(list);
					
					
					
					session1.persist(emp);
					
					
					
					
					
					
					transaction.commit();
					
					session1.close();
					
					
					
					HibernateUtil.shutDown();
					
					System.out.println("Record Inserted!");
					
					
					
					
				} catch (Exception e) {
					// TODO: handle exception
					
					e.printStackTrace();
					
					System.out.println("Reason of Error::"+e.getMessage());
				}
		
		}

}
