package Abstraccion;


public class EmpleadoConHorasDobles extends Empleado{
	//Atributos
		public int horasExtras;
		//Constructor 
		public EmpleadoConHorasDobles(String pNombreEmpleado, int pHorasTrabajadas, double pSueldoPorHora, int extras) {
			super(pNombreEmpleado, pHorasTrabajadas, pSueldoPorHora);
			horasExtras = extras;
		}
		//Metodos Getter y Setters
		public int getHorasextras() {
			return horasExtras;
		}
		public void setHorasextras(int horasextras) {
			this.horasExtras = horasextras;
		}

		@Override
		public double CalcularSalario() {
			double salario = 0.0;
			salario += getsueldoPorHora()*(horasExtras*gethorasTrabajadas());
			return salario;
			
		}

}
