package baseDeDatos;

import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class BBDDHibernate {

	private static BBDDHibernate singleton;
	private Session sesion;
	private SessionFactory factory;

	public static BBDDHibernate setUp() {

		if (singleton == null) {
			BBDDHibernate hc = new BBDDHibernate();
			Configuration configuration = new Configuration().configure();
			hc.factory = configuration
					.buildSessionFactory(new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build());
			hc.sesion = hc.factory.openSession();
			singleton = hc;
			return hc;
		} else {

			return singleton;
		}

	}

	public void shutDown() {
		sesion.close();
		factory.close();
	}

	public Session getSession() {
		return sesion;
	}

}