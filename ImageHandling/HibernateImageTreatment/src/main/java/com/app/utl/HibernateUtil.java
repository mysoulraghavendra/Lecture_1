package com.app.utl;

import javax.swing.JOptionPane;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	
	private static StandardServiceRegistry registry;
	
	private static SessionFactory factory;
	
	public static SessionFactory getSessionFactory()
		{
				try
					{
							registry=new StandardServiceRegistryBuilder().configure().build();
							
							MetadataSources _sources=new MetadataSources(registry);
							
							Metadata metadata=_sources.getMetadataBuilder().build();
							
							factory=metadata.getSessionFactoryBuilder().build();
							
							
							
					
					}
				catch (Exception e) {
					
					
					e.printStackTrace();
					
					if(registry!=null)
						{
						
							StandardServiceRegistryBuilder.destroy(registry);
						}
				}
		
		
					return factory;
		}
	
	
	public static void shutDown()
		{
		
		if(registry!=null)
		{
		
			StandardServiceRegistryBuilder.destroy(registry);
		}

		
			
		}

}
