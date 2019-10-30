
public class Pintar {

	public static void pintaMuñeco(String vFallos[], String vHuecos[]) {
		int fallos = 0;
		
		//Calculo el número de fallos
		
		for (int i= 0; i < vFallos.length; i++) {
			if (vFallos[i]!=null) 
				fallos++;
			}
	
		//Pinta Muñeco
		
		switch (fallos) {
		case 1:
			System.out.println(" -----------------------");
	        System.out.println(" |                     |");
	        System.out.println(" |                     |");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
			break;
		case 2:
			System.out.println(" -----------------------");
	        System.out.println(" |                     |");
	        System.out.println(" |                     |");
	        System.out.println(" |                  -------");
	        System.out.println(" |                 | -  -  |");
	        System.out.println(" |                 |   o   |");
	        System.out.println(" |                  -------");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
			break;
		case 3:
			System.out.println(" -----------------------");
	        System.out.println(" |                     |");
	        System.out.println(" |                     |");
	        System.out.println(" |                  -------");
	        System.out.println(" |                 | -  -  |");
	        System.out.println(" |                 |   o   |");
	        System.out.println(" |                  -------");
	        System.out.println(" |                     |");
	        System.out.println(" |                     |");
	        System.out.println(" |                     |");
	        System.out.println(" |                     |");
	        System.out.println(" |                     |");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        break;
		case 4:
			System.out.println(" -----------------------");
	        System.out.println(" |                     |");
	        System.out.println(" |                     |");
	        System.out.println(" |                  -------");
	        System.out.println(" |                 | -  -  |");
	        System.out.println(" |                 |   o   |");
	        System.out.println(" |                  -------");
	        System.out.println(" |                     |");
	        System.out.println(" |                   / | \\ ");
	        System.out.println(" |                  /  |   \\ ");
	        System.out.println(" |                 /   |     \\ ");
	        System.out.println(" |                     |");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        System.out.println(" | ");
	        break;
		case 5:
			System.out.println(" -----------------------");
	        System.out.println(" |                     |");
	        System.out.println(" |                     |");
	        System.out.println(" |                  -------");
	        System.out.println(" |                 | -  -  |");
	        System.out.println(" |                 |   o   |");
	        System.out.println(" |                  -------");
	        System.out.println(" |                     |   ");
	        System.out.println(" |                   / | \\");
	        System.out.println(" |                  /  |   \\");
	        System.out.println(" |                 /   |     \\");
	        System.out.println(" |                     |   ");
	        System.out.println(" |                    /  \\ ");
	        System.out.println(" |                   /     \\ ");
	        System.out.println(" |                  /        \\ ");
			break;
		case 6:
			System.out.println(" -----------------------");
	        System.out.println(" |                     |");
	        System.out.println(" |                     |");
	        System.out.println(" |                  -------");
	        System.out.println(" |                 | x  x  |");
	        System.out.println(" |                 |   o   |");
	        System.out.println(" |                  -------");
	        System.out.println(" |                     |   ");
	        System.out.println(" |                   / | \\");
	        System.out.println(" |                  /  |   \\");
	        System.out.println(" |                 /   |     \\");
	        System.out.println(" |                     |   ");
	        System.out.println(" |                    /  \\ ");
	        System.out.println(" |                   /     \\ ");
	        System.out.println(" |                  /        \\ ");
	        System.out.println(" _______________________________");
			break;
		}
		
		System.out.println();
		System.out.println();
		for (int i=0; i < vHuecos.length; i++) {
			System.out.print(vHuecos[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Fallos: ");
		for (int i=0; i < vFallos.length; i++) {
			if (vFallos[i] != null)
				System.out.println(vFallos[i] + " ");
		}
	}
}
