package polimorfismo;

public class VehiculoDeportivo {
	private int cilindrada;

	public VehiculoDeportivo(int cilindrada, String matricula, String marca, String modelo) {
		super(matricula, marca, modelo);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	public String mostrarDatos() {
		return "Matricula es: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo + "\nCilindrada: " + cilindrada;
	}
}
