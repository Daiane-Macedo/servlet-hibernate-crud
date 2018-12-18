package br.com.dac;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
	
	private static ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            return new Configuration().configure("/resources/hibernate.cfg.xml").buildSessionFactory();
        }
        catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

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
