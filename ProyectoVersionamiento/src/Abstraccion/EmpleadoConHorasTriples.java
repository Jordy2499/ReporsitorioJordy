package Abstraccion;


public class EmpleadoConHorasTriples extends Empleado {
	//Atrinutos
		public int horasExtras;
	    //Constructor
	    public EmpleadoConHorasTriples(String pNombreEmpleado, int pHorasTrabajadas, double pSueldoPorHora) {
	    	super(pNombreEmpleado, pHorasTrabajadas, pSueldoPorHora);
	    	horasExtras = 3;
	    }
	    //Metodos Getter y Setteer
		public int gethorasExtras() {
			return horasExtras;
		}

		public void sethorasExtras(int horasExtras) {
			this.horasExtras = horasExtras;
		}
		
		@Override
		public double CalcularSalario() {
			double salario = 0.0;
			salario += getsueldoPorHora()*(horasExtras*gethorasTrabajadas());
			 return salario;
		}

}
