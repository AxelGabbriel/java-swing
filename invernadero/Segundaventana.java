package invernadero;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Segundaventana extends  JFrame {

	public Segundaventana(){
		add(new JScrollPane(tablaCF),BorderLayout.CENTER);
		
	}
	
		private String [] nombresdecolumnas = {"nombre","tamaño","reproducion","duracion","Flor"};
		private Object [][] datosfila= {
				
				{"helianthus annuus",5,"angiospernia",2,"girasol"},	
				{"rosa",1,"magnoliopsida",1,"rosa"},	
				{"tulipa",1,"angiospernia",2,"tulipan"}
				
		};
	  JTable tablaCF= new JTable(datosfila,nombresdecolumnas);
	  
}
