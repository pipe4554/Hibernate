package patronDAO;

import java.util.List;

import tablas.Producto;

public interface IProductoDAO<T> {

	void insert(T em);

	void update(int id, T em);

	void delete(T em);

	List<Producto> getAll();

	Producto getone(int id);
}
