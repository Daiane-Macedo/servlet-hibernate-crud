package br.com.dac;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	private static ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();

	private static SessionFactory sessionFactory;
    
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            // loads configuration and mappings
            Configuration configuration = new Configuration().configure("/resources/hibernate.cfg.xml");
            ServiceRegistry serviceRegistry
                = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();
             
            // builds a session factory from the service registry
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);           
        }
         
        return sessionFactory;
    }
	

/*	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}*/

	public static Session getSession() {
		Session session = threadLocal.get();

		if (session == null) {
			session = getSessionFactory().openSession();
			threadLocal.set(session);
		}
		return session;

	}

	public static void shutdown() {
		// Close caches and connection pools
		getSession().close();
	}

	public static void beginTransaction() {
		getSession().beginTransaction();
	}

	public static void commitTransaction() {
		getSession().getTransaction().commit();
	}

	public static void rollBackTransaction() {
		getSession().getTransaction().rollback();
	}

	public static void closeSession() {
		getSession().close();
	}

}
