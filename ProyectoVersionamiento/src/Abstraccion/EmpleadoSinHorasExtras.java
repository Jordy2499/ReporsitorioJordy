package Abstraccion;

public class EmpleadoSinHorasExtras extends Empleado implements IPagado {
	public EmpleadoSinHorasExtras(String pNombreEmpleado, int pHorasTrabajadas, double pSueldoPorHora) {
		super(pNombreEmpleado, pHorasTrabajadas, pSueldoPorHora);
	}
	@Override
	public double CalcularSalario() {
		return gethorasTrabajadas()* getsueldoPorHora();
	}

}
