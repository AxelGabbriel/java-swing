package invernadero;

import java.util.Scanner;

public class ConFlor extends Planta {

	private String Flor;
	
	public ConFlor(String nombre, float tamaño, String reproduccion, int duracion,String flor) {
		super(nombre, tamaño, reproduccion, duracion);
		this.Flor = flor;
	}

	public void mostrardatosCF() {
		System.out.println("Nombre: "+Getnombre()
				+ "\tTamaño (mts.): "+Gettamaño()
				+ "\tReproduccion: "+Getreproduccion()
				+ "\tDuracion(años): "+Getduracion()
				+ "\tflor: "+Flor);
	}
	
	public void invernaderoCF() {
		
		ConFlor girasol = new ConFlor("helianthus annuus",5,"angiospernias ",2," girasol");
		ConFlor rosa = new ConFlor("rosa",1,"magnoliopsida",1,"rosa");
		ConFlor tulipan = new ConFlor("tulipa",1,"angiospernias",2,"tulipan");
		girasol.mostrardatosCF();
		rosa.mostrardatosCF();
		tulipan.mostrardatosCF();
	}
	
	public void agregarCF() {
		//nombre
		System.out.println("escriba el nombre: ");
		Scanner n = new Scanner(System.in);
		String name= n.next();
		 Setnombre(name);
		 //tamaño
		 System.out.println("escriba tamaño:");
		 Scanner t = new Scanner(System.in);
		 float ta = t.nextFloat();
		 Settamaño(ta);
		 //reproduccion
		 System.out.println("escriba reproduccion:");
		 Scanner r = new Scanner(System.in);
		 String re = r.next();
		 Setreproduccion(re);
		 //duracion
		 System.out.println("escriba duracion:");
		 Scanner d = new Scanner(System.in);
		 int du = d.nextInt();
		 Setduracion(du);
		 //flor
		 System.out.println("escriba flor:");
		 Scanner f = new Scanner(System.in);
		 String fl = f.nextLine();
		 Flor=fl;
		 System.out.println("\tnombre: "+Getnombre()
		 		+ "\ttamaño: "+Gettamaño()
		 		+ "\treproduccion: "+Getreproduccion()
		 		+ "\tduracion: "+Getduracion()
		 		+ "\tFlor: "+Flor);
		 
		 invernaderoCF();
	}
	
	
	public void Mostrargrafica() {
		
	}
	
	
	
}
