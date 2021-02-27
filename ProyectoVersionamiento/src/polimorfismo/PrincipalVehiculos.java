package polimorfismo;


public class PrincipalVehiculos {
	public static void main(String[] args) {
		System.out.println("VEHICULOS");	
		System.out.println("-----------------------------");	
		Vehiculo autos [] = new Vehiculo [3];
		
		autos [0] = new Vehiculo ("POI-2095", "Ford", "Explorer");
		autos [1] = new VehiculoDeportivo (2000, "VIS-6490", "Mazda", "Mazda 3");
		autos [2] = new VehiculoFurgoneta (4, "SOI-3905", "KIA", "Pregio");
		

		for(Vehiculo vehiculos: autos) {
			System.out.println(vehiculos.mostrarDatos());
			//System.out.println("");	
			System.out.println("-----------------------------");	
		}
	}

}
