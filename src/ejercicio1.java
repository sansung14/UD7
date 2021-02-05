import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println ("Cuantos alumnos quieres introducir?");
		int alumnos = teclado.nextInt();
		
		lista(alumnos);
		
	}
	
	
	
	public static void lista(int alumnos) {
		Scanner teclado = new Scanner (System.in);
		ArrayList<String> lista=new ArrayList<>();
		ArrayList<Double> notas=new ArrayList<>();

		for(int i=0;i<alumnos;i++) {
			System.out.println ("Introduce el nombre del alumno:");
			String nombre = teclado.next();
			System.out.println ("Introduce la nota de base de datos:");
			Double nota = teclado.nextDouble();
			System.out.println ("Introduce la nota de programacion:");
			nota = nota + teclado.nextDouble();
			System.out.println ("Introduce la nota de interfaces web:");
			nota = nota + teclado.nextDouble();
			System.out.println ("Introduce la nota de entornos de desarrollo:");
			nota = nota + teclado.nextDouble();
			lista.add(nombre);
			notas.add(nota/4);


		}
	    System.out.println("");

	    System.out.println("Listado de alumnos con notas media:");

		for(int i = 0; i < lista.size(); i++)
		{
		    System.out.print(lista.get(i)+" = ");
		    System.out.println(notas.get(i));
		}
		
	}

}
