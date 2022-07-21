/* Alumnos: Toconás Matías.
 * Institución: Universidad Nacional de José Clemente Paz.
 * Carrera: Analista Programador Universitario.
 * Profesores: Ing. Guaycochea Lucas / Lic. Ciarallo Cristian.
 * Fecha de entrega: 27/03/2020.
 * 
 * Tema: Variables, expresiones y tipos.				
 * Ejercicio 4:
 * ¿Qué valor tienen las siguientes expresiones?
 * 1/2
 * 1.0/2.0
 * 1.0/2
 * 1/2.0
 * "1"/"2"
 * 1+2
 * "1"+"2"
 * 16/2*4
 * 16/(2*4)
 *    
 */
package ejercicio04;

public class Ejercicio04 {

	public static void main(String[] args) 
	{
		System.out.println("VALORES DE LAS SIGUIENTES EXPRESIONES");
		
		double valor01 = 1/2;
		double valor02 = 1.0/2.0;
		double valor03 = 1.0/2;
		double valor04 = 1/2.0;
//		String valor05 = "1"/"2";
		int valor06 = 1+2;
		String valor07 = "1"+"2";
		double valor08 = 16/2*4;
		double valor09 = 16/(2*4);
		
		System.out.println("valor"+valor01);
		System.out.println("valor"+valor02);
		System.out.println("valor"+valor03);
		System.out.println("valor"+valor04);
//		System.out.println("valor"+valor05);
		System.out.println("valor"+valor06);
		System.out.println("valor"+valor07);
		System.out.println("valor"+valor08);
		System.out.println("valor"+valor09);
	}
}
