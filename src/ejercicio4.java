import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;

public class ejercicio4 {


	public static void main(String[] args) {

		Hashtable<String, Double> contenedor = new Hashtable<String, Double>();

		contenedor.put("Platano", 2.2);
		contenedor.put("Manzana", 1.22);
		contenedor.put("Coco", 5.3);
		contenedor.put("Pera", 1.60);
		contenedor.put("Melon", 1.70);
		contenedor.put("Sandia", 3.20);
		contenedor.put("Kiwi", 2.10);
		contenedor.put("Almendras", 0.78);
		contenedor.put("Arroz", 0.80);
		contenedor.put("Judias", 0.20);

		int option = 0;
		while (option != 5) {
			Scanner teclado = new Scanner(System.in);
			System.out.println("");
			System.out.println("########################");
			System.out.println("1. Añadir articulos:");
			System.out.println("2. Mostrar articulo:");
			System.out.println("3. listar articulo:");
			System.out.println("4. Cesta:");
			System.out.println("5. Salir del programa:");
			System.out.println("########################");
			System.out.println("Escoge una opcion:");

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
			case 4:
				System.out.println("Cuantos articulos vas a introducir a la lista?");
				int articulos = teclado.nextInt();
				cesta(contenedor, articulos);
				break;
			}

		}

	}

	public static Hashtable<String, Double> añadir(Hashtable<String, Double> contenedor) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el nombre del articulo:");
		String articulo = teclado.next();
		System.out.println("Introduce el precio:");
		double precio = teclado.nextDouble();
		contenedor.put(articulo, precio);
		return contenedor;
	}

	public static void mostrar(Hashtable<String, Double> contenedor) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el nombre del articulo:");
		String articulo = teclado.next();
		System.out.println("");

		System.out.println(contenedor.get(articulo) + " €");

	}

	public static void listar(Hashtable<String, Double> contenedor) {
		Iterator<Entry<String, Double>> itr = contenedor.entrySet().iterator();
		Entry<String, Double> entry = null;
		System.out.println("");

		while (itr.hasNext()) {
			entry = itr.next();
			System.out.println(entry.getKey() + " = " + entry.getValue() + " €");
		}
	}

	public static void cesta(Hashtable<String, Double> contenedor, int cantidad) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Double> lista = new ArrayList<>();
		ArrayList<Integer> ivas = new ArrayList<>();
		for (int i = 0; i < cantidad; i++) {
			System.out.println("Introduce el nombre del articulo:");
			String nombre = teclado.next();
			System.out.println("IVA a aplicar:");
			int IVA = teclado.nextInt();
			lista.add(contenedor.get(nombre));
			ivas.add(IVA);
		}
		System.out.println("Introduce la cantidad pagada:");
		double pagado = teclado.nextDouble();

		mostrar(lista, ivas, pagado);
	}

	public static void mostrar(ArrayList<Double> lista, ArrayList<Integer> ivas, double pagado) {
		double total = 0;
		double bruto = 0;
		System.out.println("########################");
		System.out.println("Cantidad ######### + IVA");
		System.out.println("########################");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i) + " ->iva " + ivas.get(i) + "% -> "
					+ (((lista.get(i) * ivas.get(i)) / 100) + lista.get(i)) + " €");
			bruto = bruto + lista.get(i);
			total = total + (((lista.get(i) * ivas.get(i)) / 100) + lista.get(i));

		}
		System.out.println("Total Bruto: " + bruto + " €");
		System.out.println("Total mas IVA: " + total + " €");
		System.out.println("Numero de articulos comprados: " + lista.size());
		System.out.println("Cantidad pagada: " + pagado + " €");
		System.out.println("Cambio a devolver: " + (pagado - total) + " €");

	}
}
