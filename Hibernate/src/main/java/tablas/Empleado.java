package tablas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado {
	@Id
	@Column(name = "codigo_empleado")
	private Long codigoEmpleado;
	@Column(name = "nombre")
	private String nombreCliente;
	@Column(name = "apellido1")
	private String apellido1;
	@Column(name = "apellido2")
	private String apellido2;
	@Column(name = "extension")
	private String extension;
	@Column(name = "email")
	private String email;
	@Column(name = "codigo_oficina")
	private String codigoOficina;
	@Column(name = "codigo_jefe")
	private Long codigoJefe;
	@Column(name = "puesto")
	private String puesto;

	public Empleado(Long codigoEmpleado, String nombreCliente, String apellido1, String apellido2, String extension,
			String email, String codigoOficina, Long codigoJefe, String puesto) {
		this.codigoEmpleado = codigoEmpleado;
		this.nombreCliente = nombreCliente;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.extension = extension;
		this.email = email;
		this.codigoOficina = codigoOficina;
		this.codigoJefe = codigoJefe;
		this.puesto = puesto;
	}

	// GETTERS AND SETTERS
	public Long getCodigoCliente() {
		return codigoEmpleado;
	}

	public void setCodigoCliente(Long codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCodigoOficina() {
		return codigoOficina;
	}

	public void setCodigoOficina(String codigoOficina) {
		this.codigoOficina = codigoOficina;
	}

	public Long getCodigoJefe() {
		return codigoJefe;
	}

	public void setCodigoJefe(Long codigoJefe) {
		this.codigoJefe = codigoJefe;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	@Override
	public String toString() {
		return "Cliente [apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", codigoEmpleado=" + codigoEmpleado
				+ ", codigoJefe=" + codigoJefe + ", codigoOficina=" + codigoOficina + ", email=" + email
				+ ", extension=" + extension + ", nombreCliente=" + nombreCliente + ", puesto=" + puesto + "]";
	}
}
