package com.app.OneEmployeeMultipleParking;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.OneEmployeeMultipleParking.util.HibernateUtil;
import com.app.OneEmployeeMultipleParkinge.entity.Employee;
import com.app.OneEmployeeMultipleParkinge.entity.Parking;

/**
 * Hello world!
 *
 */


public class RecordInsertionActivity 
{
	public static void main(String[] args) {
		
		Transaction transaction=null;
		
		try(Session session=HibernateUtil.getSessionFactory().openSession()) {
			
			
			
			transaction=session.beginTransaction();
			
			Parking vehicle_1=new Parking();
			vehicle_1.setVid("up32 ay9296");
			vehicle_1.setVtype("2Wheeler");
			
			
			Parking vehicle_2=new Parking();
			vehicle_2.setVid("up 45 123");
			vehicle_2.setVtype("4wheeler");
			
			
			Set<Parking> vehicles=new HashSet<Parking>();
			vehicles.add(vehicle_1);
			vehicles.add(vehicle_2);
			
			Employee employee=new Employee();
			employee.setName("Person1");
			employee.setSalary(2000);
			employee.setParkingVehicles(vehicles);
			
			
			
			session.save(employee);
			
			
			
			
			transaction.commit();
			HibernateUtil.shutDown();
			
			
			System.out.println("Record Inserted!");
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
			
			
			System.out.println("Reason of Error::"+e.getMessage());
		}
	}
}
