import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ejercicio3 {

	Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		Hashtable<String, String> contenedor = new Hashtable<String, String>();

		contenedor.put("Platano", "2,3");
		contenedor.put("Manzana", "1,22");
		contenedor.put("Coco", "5,22");
		contenedor.put("Pera", "1,22");
		contenedor.put("Melon", "1,70");
		contenedor.put("Sandia", "3");
		contenedor.put("Kiwi", "2,10");
		contenedor.put("Almendras", "0,70");
		contenedor.put("Arroz", "0,5");
		contenedor.put("Judias", "1,2");

		int option = 0;
		while (option != 4) {
			Scanner teclado = new Scanner(System.in);
			System.out.println("");

			System.out.println("1. Añadir articulos:");
			System.out.println("2. Mostrar articulo:");
			System.out.println("3. listar articulo:");
			System.out.println("4. Salir del programa:");

			option = teclado.nextInt();
			switch (option) {
			case 1:
				contenedor = añadir(contenedor);
				break;
			case 2:
				mostrar(contenedor);
				break;
			case 3:
				listar(contenedor);
				break;
			}

		}

	}

	public static Hashtable<String, String> añadir(Hashtable<String, String> contenedor) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el nombre del articulo:");
		String articulo = teclado.next();
		System.out.println("Introduce el precio:");
		String precio = teclado.next();
		contenedor.put(articulo, precio);
		return contenedor;
	}

	public static void mostrar(Hashtable<String, String> contenedor) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el nombre del articulo:");
		String articulo = teclado.next();
		System.out.println("");

		System.out.println(contenedor.get(articulo) + " €");

	}

	public static void listar(Hashtable<String, String> contenedor) {
		Iterator<Entry<String, String>> itr = contenedor.entrySet().iterator();
		Entry<String, String> entry = null;
		System.out.println("");

		while (itr.hasNext()) {
			entry = itr.next();
			System.out.println(entry.getKey() + " = " + entry.getValue() + " €");
		}
	}
}
