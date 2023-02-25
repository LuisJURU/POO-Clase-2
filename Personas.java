
public abstract class Personas {
	
	String Nombre;

	public String getNombre() {
		return this.Nombre;
	}

	public Personas(String nombre) {
		this.Nombre = nombre;
	}
	
	public abstract String DameDescripcion();
	
	

}
