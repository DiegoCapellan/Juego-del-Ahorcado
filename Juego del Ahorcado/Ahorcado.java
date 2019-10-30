import java.util.Random;
import java.util.Scanner;

public class Ahorcado {

	//Método que Comprueba que la partida está acabada o 0 vidas
	public static boolean partidaGanada(String vHuecos[]) {
		boolean acabado = true;
		
		for (int i=0; i < vHuecos.length; i++) {
			if (vHuecos[i].equalsIgnoreCase("_")) {
				acabado = false;
				break;
			}
		}
		
		if (acabado) {
			System.out.println("Felicidades, has Ganado");
		}
		return acabado;
		
	}
	
	public static boolean partidaPerdida(String vFallos[]) {
		boolean acabado = true;
		
		for (int i=0; i < vFallos.length; i++) {
			if (vFallos[i] == null) {
				acabado = false;
				break;
			}
		}
		
		if (acabado) {
			System.out.println("Lo Sentimos, has Perdido");
		}
		
		return acabado;
	}
	
	public static void inicializarVectores(String vHuecos[], String vSolucion[], String respuesta) {
		for (int i= 0; i < vHuecos.length; i++) {
			vHuecos[i] = "_";
			vSolucion[i] = respuesta.substring(i, i+1);
			
			//Comprobacion de que todo funciona bien
			//System.out.println(vHuecos[i] + " ");
			//System.out.println(vSolucion[i]);
		}
	}
	
	public static void preguntarLetra(String vFallos[], String vHuecos[], String vSolucion[]) {
		
		//Pregunta la letra y actualiza los vectores, si se encuentra actualiza vHuecos, si falla actualiza vFallos
		Scanner leerLetra = new Scanner (System.in);
		String letra = "";
		boolean encontrado = false;
		
		System.out.println("Dime una letra");
		letra = leerLetra.nextLine();
		
		
		for (int i=0; i < vHuecos.length; i++) {
			if (vSolucion[i].equalsIgnoreCase(letra)) {
				vHuecos[i] = vSolucion[i];
				encontrado = true;
			}
		}
		
		if (!encontrado) {
			for (int i=0; i < vFallos.length; i++) {
				if (vFallos[i] == null) {
					vFallos[i] = letra;
					break;
				}
			}
		}
	}
	
	public static String damePalabra() {
		String[] palabras = {"Juan", "Lapiz", "Mandarina", "Honolulu", "Abrecartas"};
		Random r = new Random();
		return palabras[r.nextInt(4)];
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		
		String respuesta = damePalabra();
		String vFallos[], vSolucion[], vHuecos[];
		
		//Tamaño 6 porque son 6 vidas 
		vFallos = new String[6];
		vHuecos = new String[respuesta.length()];
		vSolucion = new String[respuesta.length()];
		
		
		inicializarVectores(vHuecos, vSolucion, respuesta);
		
		
		
		do  {
			Pintar.pintaMuñeco(vFallos, vHuecos);
			preguntarLetra(vFallos, vHuecos, vSolucion);
			
		}while (!(partidaPerdida(vFallos)) && !(partidaGanada(vHuecos)) );
		
	}
}
