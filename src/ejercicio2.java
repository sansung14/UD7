import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println ("Cuantos articulos vas a introducir a la lista?");
		int articulos = teclado.nextInt();
		
		añadir(articulos);

	}
	
	public static void añadir(int cantidad) {
		Scanner teclado = new Scanner (System.in);
		ArrayList<Double> lista=new ArrayList<>();
		ArrayList<Integer> ivas=new ArrayList<>();
		for(int i=0;i<cantidad;i++) {
			System.out.println ("Introduce el precio del articulo"+(i+1)+":");
			double precios = teclado.nextDouble();
			System.out.println ("IVA a aplicar:");
			int IVA = teclado.nextInt();
			lista.add(precios);
			ivas.add(IVA);
		}
		System.out.println ("Introduce la cantidad pagada:");
		double pagado = teclado.nextDouble();
		
		mostrar(lista,ivas,pagado);
	}

	public static void mostrar(ArrayList<Double> lista, ArrayList<Integer> ivas, double pagado) {
		double total = 0;
		double bruto = 0;
		System.out.println("");
		System.out.println("Cantida ------ + IVA");
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i)+" ->iva "+ ivas.get(i)+"% -> "+(((lista.get(i)*ivas.get(i))/100)+lista.get(i))+" €");
			bruto=bruto+lista.get(i);
			total=total+(((lista.get(i)*ivas.get(i))/100)+lista.get(i));

		}
		System.out.println("Total Bruto: "+bruto+" €");
		System.out.println("Total mas IVA: "+total+" €");
		System.out.println("Numero de articulos comprados: "+lista.size());
		System.out.println("Cantidad pagada: "+pagado+" €");
		System.out.println("Cambio a devolver: "+(pagado-total)+" €");

	}

}
