import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Imprecion {
	private String identificarImprecion;
	private byte TamañoDeHoja;
	private int CantidadDeHojas;
}
 public registroImpresiones{
	 linkedlistColaDeImprecion = new linkedlist();
}
 public Imprimir{
	 System.out.prinln()
	 
 }
 public AgregarImprecion(int a) {
	 cola.addfirst(a);
 }
public TotalHojasImpresas{
	System.out.prinln(ColaDeImprecion+Cantidad de hojas);
}
public TotalDeBytesImpreciones{
	System.out.println(ColaDeImprecion + TamañoDeArchivos);
}
class ImpelemtacionFilaEstatica{
	public static void (String[] args) {
		linkedlistColaDeImprecion = new linkedlist();
		int [] CantidadHojas;
		String[]IdentificarImprecion;
		byte[]TamañoDeArchivo;
		ColaDeImprecion.set(IdentificarImprecion);
		ColaDeImprecion.set(TamañoDeArchivo);
		ColaDeImprecion.set(CantidadHojas);
	}
}
class ImplementacionFilaDinamica{
	public static void (String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.offer(IdentificarImprecion);
		queue.offer(TamañoDeArchivo);
		queue.offer(CantidadDeHojas);
		for(String q : queue) {
			System.out.print(q);
			
		}
	}
}
public static void Main(String []Args) {
	Scanner sc = new Scanner (System.in);
	int OpcionElejida = sc;
	String = IdentificadorDeImprecion;
	int = CantidadHojas;
	byte = TamañoDeArchivo;
while(OpcionElejida ! = 4) {
	System.out.println("Introduce La Operacion Deseada");
	System.out.println("1-Imprimir");
	System.out.println("2-Agregar A Cola De Imprecion");
	System.out.println("3-Mostrar Total De Hojas Impresas");
	System.out.println("4.Mostrar Total De Bytes Recividos De Impreciones");
	switch (OpcionElejida) {
	case 1;
	System.out.print("Introduce El Numero De Imprecion");
	IdentificadorDeImprecion = sc.next();
	System.out.prinln(Imprime + IdentificadorDeImprecion);
	break;
	case 2;
	System.out.print("Seleccione Cuantas Impreciones Desea Agregar");
	IdentificadorDeImprecion = sc.next();
	System.out.print("Agrego"+ IdentificadorDeImprecion);
	break;
	case 3;
	System.out.print(CantidadDeHojas);
	break;
	case 4;
	System.out.println(TamañoDeArchiv);
	break;
	default;
	System.out.print("Tienes que introducir una opcion valida");
	
	}
}
	
		
}