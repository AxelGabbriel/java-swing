package invernadero;

public class Planta {

	private String Nombre;
	private float Tamaño;
	private String Reproduccion;
	private int Duracion;

	//Metodo Constructor
	public Planta(String nombre,float tamaño, String reproduccion,int duracion){
		
		this.Nombre = nombre; 
		this.Tamaño = tamaño;
	this.Reproduccion = reproduccion;
		this.Duracion = duracion;
		
	}
	
	//metodos getters y setters
	
	public void Setnombre(String nombre) {
		this.Nombre=nombre;
	}
	
	public String Getnombre() {
		 
		return Nombre;
	}
	
	//metodo tamaño
	public void Settamaño(float tamaño) {
		this.Tamaño= tamaño;
	}
	
	public float Gettamaño() {
		
	return Tamaño;
	
	}
	
	//metodo reproduccion
	
	public void Setreproduccion(String reproduccion) {
		
		this.Reproduccion = reproduccion;
	}
	
	public String Getreproduccion() {
		return Reproduccion;
	}
	
	//metodo duracion
	public void Setduracion(int duracion) {
		this.Duracion=duracion;	
	}
	
	public int Getduracion() {
		return Duracion;	
	}
	
	
	
}
