package diesiochoSwitch;

import java.util.Scanner;

public class Comidas {
	Scanner dato = new Scanner(System.in);
	String nombre;
	//constructor
	public Comidas(String nombre) {
		this.nombre = nombre;
	}
	
	public void mostrarPlatillos() {
		System.out.println("Bienvenido/a " + nombre + ". Selecciona un platillo.");
		System.out.println( "Digita una opcion del 1 al 5: ");
		System.out.println("1- Mole ");
		System.out.println("2- Enchiladas ");
		System.out.println("3- Pozole  ");
		System.out.println("4- Carne en su jugo  ");
		System.out.println("5- Ensalada  ");
		int menu = dato.nextInt();
		
		switch (menu) {
		case 1:
			
			System.out.println("Buen provecho. En brevedad llevaremos el Mole");
			break;
			
		case 2:
			System.out.println("Buen provecho. En brevedad llevaremos las enchiladas");
			break;
			
		case 3:
			System.out.println("Buen provecho. En brevedad llevaremos el Pozole");
			break;
			
		case 4:
			System.out.println("Buen provecho. En brevedad llevaremos la carne en su jugo");
			break;
			
		case 5:
			System.out.println("Buen provecho. En brevedad llevaremos la ensalada");
			break;
			
			
			
			
		
		}
	
	}
	
	//public void menu () {
		//switch 
	//}
	

}
