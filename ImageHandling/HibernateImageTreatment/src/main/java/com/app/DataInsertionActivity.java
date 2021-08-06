package com.app;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Blob;

import javax.sql.rowset.serial.SerialBlob;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.entity.Employee;
import com.app.utl.HibernateUtil;

public class DataInsertionActivity {
	
	public static void main(String[] args) {
		
		try(Session session=HibernateUtil.getSessionFactory().openSession())
		{
			
			File file=new File("C:\\Users\\Technology\\Desktop\\test\\fort.jpg");
			byte[] imageData=new byte[(int)file.length()];
			
			
			FileInputStream fis=new FileInputStream(file);
			fis.read(imageData);  //reads the image and fills the imageData array
			fis.close();
			
			Employee emp=new Employee();
			
			emp.setName("Raghavendra");
			emp.setImage(new SerialBlob(imageData));
			
			Transaction transaction=session.beginTransaction();
			
			session.save(emp);
			
			transaction.commit();
			
			HibernateUtil.shutDown();
		} catch (Exception e) {
			// TODO: handle exception
			
			
			System.out.println("Reason of Error::"+e.getMessage());
		}
		
		
	}

}
