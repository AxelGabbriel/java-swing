package invernadero;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//interfaz grafica
		Ventana interfaz = new Ventana();
		interfaz.setVisible(true);
		
		
		
		
		
		//moatrando plantas con flores
		ConFlor muestraCF= new ConFlor("null",0,"null",0,"null");
		
		//mostrando plantas sin flores
		SinFlor muestraSF = new SinFlor("null",0,"null",0,"null");
		
		
		//menu
		Scanner menu = new Scanner(System.in);
		int dato;
		
		System.out.println("invernadero de Axel\n"
				+ "\n elija una opcion:"
				+ "\n 1. mostrar plantas con flores"
				+ "\n 2. mostrar plantas sin flores"
				+ "\n 3. agregar plantas con flores"
				+ "\n 4. agregar plantas sin flores");
		
		dato= menu.nextInt();
		switch(dato) {
		case 1:{
			muestraCF.invernaderoCF();		
			break;
		}
		case 2:{
			
			muestraSF.invernaderoSF();
			break;
		}
		case 3:{
			muestraCF.agregarCF();
			break;
		}
		case 4:{
			
			muestraSF.agregarSF();
		}
		}
		

	



	}

}
