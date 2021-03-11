package patronDAO;

import java.util.List;

import org.hibernate.Session;

import baseDeDatos.BBDDHibernate;
import tablas.Cliente;

public class ClienteDAO implements ICLienteDAO<Cliente> {

	private BBDDHibernate conn;

	public ClienteDAO(BBDDHibernate conn) {
		this.conn = conn;
	}

	public void insert(Cliente cl) {
		Session sesion = conn.getSession();// La iniciliza o utiliza la que ya esta creada
		sesion.beginTransaction();// Iniciamos una transaccion
		sesion.save(cl);// Grabamos el cliente en la base de datos
		sesion.getTransaction().commit();// Finalizamos la transaccion
		sesion.close();
	}

	public void update(int id, Cliente cl) {

	}

	public void delete(Cliente cl) {
		Session sesion = conn.getSession();//
		sesion.beginTransaction();
	}

	public List<Cliente> getAll() {
		org.hibernate.query.Query<Cliente> query = conn.getSession().createQuery("from cliente", Cliente.class);
		List<Cliente> clientes = query.getResultList();
		return clientes;
	}

	public Cliente getone(int id) {
		System.out.println();
		Cliente cliente = conn.getSession().get(Cliente.class, id);
		return cliente;
	}

}
