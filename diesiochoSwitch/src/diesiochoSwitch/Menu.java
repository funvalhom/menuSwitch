	package diesiochoSwitch;
	
	import java.util.Scanner;
	
	public class Menu {
	
		public static void main(String[] args) {
			
			
			Scanner dato = new Scanner(System.in);
			
			System.out.print("Ingrese su nombre: ");
	        String nombre = dato.nextLine();
	        
			Comidas comidaMenu = new Comidas(nombre);
			comidaMenu.mostrarPlatillos();
			
			
			
				
	
		}
	
	}	
