package polimorfismo;



public class VehiculoFurgoneta extends Vehiculo {
	private int carga;

	public VehiculoFurgoneta(int carga, String matricula, String marca, String modelo) {
		super(matricula, marca, modelo);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	public String mostrarDatos() {
		return "Matricula es: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo + "\nCarga: " + carga;
	}
	
}
