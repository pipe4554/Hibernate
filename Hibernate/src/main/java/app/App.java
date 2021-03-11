package app;

import java.sql.SQLException;
import java.util.Scanner;
import baseDeDatos.BBDDHibernate;
import patronDAO.ClienteDAO;
import tablas.Cliente;

public class App {
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {
		BBDDHibernate con = null;
		try {
			con = BBDDHibernate.setUp();
			ClienteDAO cdao = new ClienteDAO(con);
			// EmpleadoDAO pdao = new EmpleadoDAO(con);
			boolean exit = true;
			do {

				Funcionalidades.menu();
				int op = kb.nextInt();
				switch (op) {
				case 1:
					Cliente cliente = Funcionalidades.datosCliente();
					cdao.insert(cliente);
					break;
				case 2:
					break;
				case 3:
					System.out.println("Introduzca el codigo del producto que quiera editar");
					int cod = kb.nextInt();
					Cliente cli = Funcionalidades.actualizarCliente(cod);
					cdao.update(cod, cli);
					break;
				case 4:
					System.out.print("Identificador del cliente que quieres que se muestre: ");
					int id = kb.nextInt();
					System.out.println(cdao.getone(id));
					break;
				case 5:
					System.out.println(cdao.getAll().toString());
					break;
				case 6:
					System.out.println("** HAS SALIDO DEL PROGRAMA **");
					exit = false;
					break;
				default:
					throw new IllegalArgumentException("Valor erroneo: " + op);
				}
			} while (exit);

		} finally {

		}
	}
}
