package com.app;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.entity.FourWheeler;
import com.app.entity.TwoWheeler;
import com.app.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class SingleTableStrategyActivity 
{
    public static void main( String[] args )
    {
    	
    		Transaction transaction=null;
    		
    		try(Session session=HibernateUtil.getSessionFactory().openSession())
    			{
    			
    					TwoWheeler twoWheeler=new TwoWheeler();
    					twoWheeler.setVehicleId("up32 xx");
    					twoWheeler.setVehicleName("Splendor");
    					twoWheeler.setSteeringTwoWheeler("Handle Based System");
    					
    					FourWheeler fourWheeler=new FourWheeler();
    					fourWheeler.setVehicleId("up45 yy");
    					fourWheeler.setVehicleName("Alto 800");
    					fourWheeler.setSteeringFourWheeler("wheel based");
    					
    					transaction=session.beginTransaction();
    					
    					session.save(twoWheeler);
    					session.save(fourWheeler);
    					transaction.commit();
    					
    					
    					System.out.println("Operation Done");
    					
    					HibernateUtil.shutDown();
    			
    					
    			
    			
    			}
    		catch (Exception e) {
				// TODO: handle exception
    			
    			System.out.println("Reason of error::"+e.getMessage());
			}
       
    	
    }
}
