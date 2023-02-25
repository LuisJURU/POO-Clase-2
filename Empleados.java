import java.util.Date;
import java.util.GregorianCalendar;

public class Empleados extends Personas {
	
	private double sueldo;
	private Date AltaContrato;
	private int ID;
	
	public Empleados(String Nombre, double sueldo, int ID, int agno, int mes, int dia) {
		
		super(Nombre);
		this.sueldo = sueldo;
		this.ID = ID;
		GregorianCalendar calendario = new GregorianCalendar (agno, mes-1, dia);
		AltaContrato = (Date) calendario.getTime();
		
	}
	public String DameDescripcion() {
			return "ID del Empleado: "+ID
					+"\nSueldo: "+sueldo+"\n\n";
	}
	
	public double dameSueldo() {
		
		return sueldo;
	}
	
	public Date FechaContrato() {
		
		return AltaContrato;
		
	}
	
	public void SubSueldo (double porcentaje) {
		
		
		double aumento = (sueldo*porcentaje)/100;
		
		sueldo+=aumento;
	}

	
	

}
