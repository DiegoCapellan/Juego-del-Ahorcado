import java.util.Scanner;

public class Ahorcado {

	//M�todo que Comprueba que la partida est� acabada o 0 vidas
	public static boolean partidaGanada(String vHuecos[], String vFallos[]) {
		boolean acabado = false;
		
		for (int i=0; i < vFallos.length; i++) {
			if (vFallos[i] != null) {
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		
		String respuesta = "diego";
		String vFallos[], vSolucion[], vHuecos[];
		
		//Tama�o 6 porque son 6 vidas 
		vFallos = new String[6];
		vHuecos = new String[respuesta.length()];
		vSolucion = new String[respuesta.length()];
		
		
		inicializarVectores(vHuecos, vSolucion, respuesta);
		
		
		
		do  {
			Pintar.pintaMu�eco(vFallos, vHuecos);
			preguntarLetra(vFallos, vHuecos, vSolucion);
			
		}while (!(partidaPerdida(vFallos)) );
		
	}
}
