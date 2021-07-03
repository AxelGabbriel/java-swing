package invernadero;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame {

	public Ventana(){
		
		this.setSize(900, 800);//tamaño de la ventana
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("invernadero de Axel");
		setLocationRelativeTo(null);
		iniciar();
		
		

	
	}
	
	
	
	JButton botonA = new JButton();
	JButton botonCF = new JButton();
	JButton botonSF = new JButton();
	JButton ya = new JButton();
	JTextField cajatexto= new JTextField();
	JLabel texto= new JLabel();
	
	//plantas con flores
	JLabel girasol =new JLabel("GIRASOL");
	JLabel rosa =new JLabel("ROSA");
	JLabel orquidia = new JLabel("ORQUIDIA");
	JLabel hortensias = new JLabel("HORTENSIAS");
	JLabel tulipan = new JLabel("TULIPAN");
	JLabel titulo1 = new JLabel("CON FLORES: ");
	//plantas sin flores
	JLabel helecho =new JLabel("HELECHO");
	JLabel musgo = new JLabel("MUSGO");
	JLabel coladecaballo = new JLabel("COLA DE CABALLO");
	JLabel arbusto = new JLabel("ARBUSTO");
	JLabel titulo2 = new JLabel("SIN FLORES: ");
	
	
	
	




	
	 void iniciar() {
		JPanel panel = new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);
		panel.setBackground(Color.YELLOW);

		JLabel etiqueta = new JLabel(" Elija la opcion que desea");
		etiqueta.setBounds(150, 0, 150, 150);
		panel.add(etiqueta);
		panel.add(botonA);
		panel.add(botonCF);
		panel.add(botonSF);
		panel.add(girasol);
		panel.add(rosa);
		panel.add(tulipan);
		panel.add(orquidia);
		panel.add(hortensias);
		panel.add(titulo1);
		panel.add(arbusto);
		panel.add(coladecaballo);
		panel.add(helecho);
		panel.add(musgo);
		panel.add(titulo2);
		panel.add(cajatexto);
		panel.add(ya);
		panel.add(texto);
		
		BotonA();
		BotonSF();
		BotonCF();
		
		
		
		

	}
	
	private void BotonA() {
		botonA.setBounds(147, 120 , 150, 50);
		botonA.setText("AGREGAR PLANTAS");
		ActionListener oyentesA= new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				cajadetexto();
			}
			
			
		};
		botonA.addActionListener(oyentesA);
	}
	
	private void BotonCF() {
		
		botonCF.setBounds(147, 180 , 150, 50);
		botonCF.setText("PLANTAS Con Flor");
		//agregar action listener	
		ActionListener oyenteCF = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				etiquetasCF();

			}
			
			
		};

		botonCF.addActionListener(oyenteCF);
		
	}
	
	
	private void BotonSF() {
		botonSF.setBounds(147, 240 , 150, 50);
		botonSF.setText("PLANTAS sin Flor");
		ActionListener oyenteSF= new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				etiquetasSF();
			}
			
		};

		botonSF.addActionListener(oyenteSF);
	}
	

	 
private void etiquetasCF() {
	
	girasol.setBounds(350, 100, 80, 50);
	rosa.setBounds(350, 120, 80, 50);
	tulipan.setBounds(350, 140, 80, 50);
	hortensias.setBounds(350, 160, 80, 50);
	orquidia.setBounds(350, 180, 80, 50);
	titulo1.setBounds(350, 80, 100, 50);
}

private void etiquetasSF() {
	titulo2.setBounds(350, 220, 100, 50);
	helecho.setBounds(350, 240, 100, 50);
	coladecaballo.setBounds(350, 260, 150, 50);
	arbusto.setBounds(350, 280, 100, 50);
	musgo.setBounds(350, 300, 100, 50);
	
}
 
private void cajadetexto(){
	cajatexto.setBounds(500, 80, 200, 70);
	cajatexto.setText("agregue planta(nombre y tipo)...");
	
	ya.setBounds(500, 150, 200, 50);
	ya.setText("AGREGAR");
	ActionListener oyenteya= new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			texto.setText("Planta nueva: "+cajatexto.getText());
			texto.setBounds(500, 200, 300, 50);
		}
		
		
	};
	ya.addActionListener(oyenteya);
	
}




}


