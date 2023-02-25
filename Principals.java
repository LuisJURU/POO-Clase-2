
public class Principals {

	public static void main(String[] args) {

		Empleados empleado_1 = new Empleados("Luis", 2000.16, 30200228, 2003, 05, 28);
		Empleados empleado_2 = new Empleados("Lia", 2150, 29767652, 2001, 07, 16);
		Empleados empleado_3 = new Empleados("Carlos", 1500, 25302332, 2003, 03, 15);
		Empleados empleado_4 = new Empleados("Marcos", 2000.23, 20300200, 1998, 03, 1);
		Empleados empleado_5 = new Empleados("Miguel", 15000, 30205221, 2003, 05, 12);

		
		System.out.println(empleado_1.getNombre());
		System.out.println(empleado_1.DameDescripcion());
		System.out.println(empleado_1.dameSueldo());
		System.out.println(empleado_1.FechaContrato());

		System.out.println(empleado_2.getNombre());
		System.out.println(empleado_2.DameDescripcion());
		System.out.println(empleado_2.dameSueldo());
		System.out.println(empleado_2.FechaContrato());
		
		System.out.println(empleado_3.getNombre());
		System.out.println(empleado_3.DameDescripcion());
		System.out.println(empleado_3.dameSueldo());
		System.out.println(empleado_3.FechaContrato());
		
		System.out.println(empleado_4.getNombre());
		System.out.println(empleado_4.DameDescripcion());
		System.out.println(empleado_4.dameSueldo());
		System.out.println(empleado_4.FechaContrato());
		
		System.out.println(empleado_5.getNombre());
		System.out.println(empleado_5.DameDescripcion());
		System.out.println(empleado_5.dameSueldo());
		System.out.println(empleado_5.FechaContrato());
		
		
	}

}
