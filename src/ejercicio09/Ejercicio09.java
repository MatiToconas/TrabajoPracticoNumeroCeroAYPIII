/* Alumnos: Toconás Matías.
 * Institución: Universidad Nacional de José Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: Métodos y condicionales.				
 * Ejercicio 9:
 * Escribir un método static void imprimirFecha(int dia, int mes, int anio) que imprime la
 * fecha pasada como paráametro en formato del estilo "5 de Julio de 2030".
 *    
 */
package ejercicio09;

import unpaz.ayp3.Consola;

public class Ejercicio09 {

	public static void main(String[] args) 
	{
		int dia = Consola.pedirEntero("Ingrese el dia: ");
		int mes = Consola.pedirEntero("Ingrese el mes: ");
		int anio = Consola.pedirEntero("Ingrese el anio: ");
		
		imprimirFecha(dia,mes,anio);
	}
	
	static void imprimirFecha(int dia, int mes, int anio)
	{
		if(mes >= 1 && mes <= 12 )
		{
			
		if (mes == 1) 
		{
			if (dia >= 1 && dia <=31) 
			{
				System.out.println(dia+ " de Enero de " +anio);
			}
			else System.out.println("¡Error ingrese un dia menor!");
		}
		else if (mes == 2 )
		{
			if  (dia >= 1 && dia <= 29) 
			{
				if ((anio % 4 == 0) && (anio % 100 != 0 || anio % 400 ==0))
				
				{
					System.out.println(dia +" de Febrero de " +anio +" Es un anio bisiesto");
				}
				else 
				{
					System.out.println("El año no es bisiesto debe ingresar un dia menor a 29");
				}
			}
			else if (dia >= 1 && dia <= 28 )
			{
				System.out.println(dia +" de Febrero de " +anio);
			}
			
			else System.out.println("¡Error ingrese un dia menor!");
		}
		
		else if (mes == 3 )
		{
			if (dia >= 1 && dia <=31) 
			{
				System.out.println(dia +" de Marzo de " +anio);
			}
			else System.out.println("¡Error ingrese un dia menor!");
		}
		
		else if (mes == 4)
		{
			if (dia >= 1 && dia <=30) 
			{
				System.out.println(dia +" de Abril de " +anio);
			}
			else System.out.println("¡Error ingrese un dia menor!");
		}
		
		else if (mes == 5 )
		{
			if (dia >= 1 && dia <=31)
			{
				System.out.println(dia +" de Mayo de " +anio);
			}
			else System.out.println("¡Error ingrese un dia menor!");
		}
		
		else if (mes == 6)
		{
			if (dia >= 1 && dia <=30) 
			{
				System.out.println(dia +" de Junio de " +anio);
			}
			else System.out.println("¡Error ingrese un dia menor!");
		}
		
		else if (mes == 7)
		{
			if (dia >= 1 && dia <=31) 
			{
				System.out.println(dia +" de Julio de " +anio);
			}
			else System.out.println("¡Error ingrese un dia menor!");
			
		}
		
		else if (mes == 8)
		{
			if (dia >= 1 && dia <=30) 
			{
				System.out.println(dia +" de Agosto de " +anio);
			}
			else System.out.println("¡Error ingrese un dia menor!");
		}
		
		else if (mes == 9)
		{
			if (dia >= 1 && dia <=30) 
			{
				System.out.println(dia +" de Septiembre de " +anio);
			}
			else System.out.println("¡Error ingrese un dia menor!");
		}
		
		else if (mes == 10)
		{
			if (dia >= 1 && dia <=31)			
			{
				System.out.println(dia +" de Octubre de " +anio);
			}			
			else System.out.println("¡Error ingrese un dia menor!");
		}
		
		else if (mes == 11)
		{
			if(dia >= 1 && dia <=30)			
			{
				System.out.println(dia +" de Noviembre de " +anio);
			}			
			else System.out.println("¡Error ingrese un dia menor!");
		}
		
		else if (mes == 12)
		{
			if(dia >= 1 && dia <=31)
			{
				System.out.println(dia +" de Diciembre de " +anio);
			}
			else System.out.println("¡Error ingrese un dia menor!");
		}
		}
		else 
			System.out.println(" El mes ingresado es incorrecto. Por favor Ingese un mes del 1 al 12");
	} 
}
