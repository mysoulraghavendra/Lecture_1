package com.app.OneEmployeeMultipleParking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.OneEmployeeMultipleParking.entity.Employee;
import com.app.OneEmployeeMultipleParking.entity.Parking;
import com.app.OneEmployeeMultipleParking.util.HibernateUtil;

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
			
			
			List<Parking> vehicles=new ArrayList<Parking>();
			vehicles.add(vehicle_1);
			vehicles.add(vehicle_2);
			
			Employee employee=new Employee();
			employee.setName("Person1");
			employee.setSalary(2000);
			employee.setParkingVehicles(vehicles);
			
			
			
			Parking vehicle_3=new Parking();
			vehicle_3.setVid("up32 ay3333");
			vehicle_3.setVtype("2Wheeler");
			
			
			Parking vehicle_4=new Parking();
			vehicle_4.setVid("up 4444");
			vehicle_4.setVtype("4wheeler");
			
			
			List<Parking> vehicles_1=new ArrayList<Parking>();
			vehicles_1.add(vehicle_3);
			vehicles_1.add(vehicle_4);
			
			Employee employee_1=new Employee();
			employee_1.setName("Person2");
			employee_1.setSalary(4000);
			employee_1.setParkingVehicles(vehicles_1);
			
			
			session.save(employee);
			session.save(employee_1);
			
			
			
			
			transaction.commit();
			HibernateUtil.shutDown();
			
			
			System.out.println("Record Inserted!");
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
			
			HibernateUtil.shutDown();
			
			
			System.out.println("Reason of Error::"+e.getMessage());
		}
	}
}
