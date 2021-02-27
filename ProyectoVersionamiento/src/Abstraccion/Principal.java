package Abstraccion;

import java.util.Scanner;

public class Principal {
	// TODO Auto-generated method stub
			String nombre;
			int horasTrabajadas;
			double sueldoPorHora;
			char opcion; //usuario indica si ejecutar el proceso de pagar empleado

			Scanner entrada=new Scanner(System.in);

			System.out.println("Nombre: ");
			nombre = entrada.nextLine();

			System.out.println("Horas Trabajadas");
			horasTrabajadas = entrada.nextInt();

			System.out.println("Salario por Hora");
			sueldoPorHora =	entrada.nextDouble();

			if(horasTrabajadas > 0 && horasTrabajadas <= 40) {
				EmpleadoSinHorasExtras empleSinExtras = new EmpleadoSinHorasExtras(nombre, horasTrabajadas,sueldoPorHora);
				System.out.print("Nombre: ");
				empleSinExtras.getnombreEmpleado();
				System.out.print("Salario: ");
				empleSinExtras.CalcularSalario();
				System.out.print("Desea pagar salario? <S/N>");
				opcion = entrada.next().charAt(0); 
				if(opcion == 'S'|| opcion == 's'){
					empleSinExtras.marcarPagado();
				}
				if(empleSinExtras.esPagado()) {
					System.out.print("Empleado Pagado ");
				}else {
					System.out.print("Empleado No Pagado ");
				}

			}else if(horasTrabajadas > 0 && horasTrabajadas <= 45) {
				EmpleadoConHorasDobles empleHorasDobles = new EmpleadoConHorasDobles(nombre, horasTrabajadas,sueldoPorHora,horasTrabajadas);
				System.out.print("Nombre: " + empleHorasDobles.getnombreEmpleado());
				System.out.print("Salario: "+ empleHorasDobles.CalcularSalario());
				System.out.print("Horas: " + empleHorasDobles.getHorasextras());
				empleHorasDobles.isPagado();
			}else {
				EmpleadoConHorasTriples empleHorasTriples = new EmpleadoConHorasTriples(nombre,horasTrabajadas,sueldoPorHora);
				System.out.print("Nombre: ");
				empleHorasTriples.getnombreEmpleado();
				System.out.print("Salario: ");
				empleHorasTriples.CalcularSalario();
				empleHorasTriples.esPagado();
			}
		}

}
