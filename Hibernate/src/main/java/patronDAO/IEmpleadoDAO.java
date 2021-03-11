package patronDAO;

import java.util.List;

import tablas.Empleado;

public interface IEmpleadoDAO<T> {
	
	void insert(T em);

	void update(int id, T em);

	void delete(T em);

	List<Empleado> getAll();
	
	Empleado getone(int id);

}