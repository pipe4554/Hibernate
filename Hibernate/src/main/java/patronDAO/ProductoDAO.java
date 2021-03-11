package patronDAO;

import java.util.List;

import baseDeDatos.BBDDHibernate;
import tablas.Producto;

public class ProductoDAO implements IProductoDAO<Producto> {

	private BBDDHibernate conn;

	public ProductoDAO(BBDDHibernate conn) {
		this.conn = conn;
	}

	public void insert(Producto em) {

	}

	public void update(int id, Producto em) {

	}

	public void delete(Producto em) {

	}

	public List<Producto> getAll() {
		return null;
	}

	public Producto getone(int id) {
		return null;
	}

}
