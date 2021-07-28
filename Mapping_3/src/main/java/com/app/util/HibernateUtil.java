package com.app.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.mapping.MetadataSource;

public class HibernateUtil {
	
		private static StandardServiceRegistry registry;
		private static SessionFactory factory;
		
	
		public static SessionFactory getSessionFactory()
		{
			if(registry==null)
			{
			try
					{
							registry=new StandardServiceRegistryBuilder().configure().build();
							
							MetadataSources sources=new MetadataSources(registry);
							
							
							Metadata metadata=sources.getMetadataBuilder().build();
							
							
							factory=metadata.getSessionFactoryBuilder().build();
							
							
							
								
									
				
					}
			catch (Exception e) {
				// TODO: handle exception
				
				e.printStackTrace();
				if(registry!=null)
						{
					
								StandardServiceRegistryBuilder.destroy(registry);
						}
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
