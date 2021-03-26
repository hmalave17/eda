package IU;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Funciones.GuardarValores;

public class ReportesVentas extends JFrame implements ActionListener {
	
	private JLabel label1, labelman, labelper, labelmor, labelbpago, labelprecio, labelPago, label2;
	private JButton boton2, boton3;
	private static int Qa, Qb, Qc, Qd;  
	
	
	
	GuardarValores data = new GuardarValores(Bienvenida.textfield1, Bienvenida.textfield2, Bienvenida.textfield3, Bienvenida.textfield4, Bienvenida.textfield5);
	Integer[] resultOfData = data.Data();
	
	public void acumulador(Integer[] resultOfData) {
		
		
		
		for(int i =0; i<resultOfData.length; i++) {
			if(resultOfData[0] != null) {
				 Qa = resultOfData[0]; 
				
			}
		}
		
		for(int i =0; i<resultOfData.length; i++) {
			if(resultOfData[1] != null) {
				 Qb = resultOfData[1]; 
				 
			}
		}
		
		for(int i =0; i<resultOfData.length; i++) {
			if(resultOfData[2] != null) {
				 Qc = resultOfData[2]; 
				 
			}
		}
		
		for(int i =0; i<resultOfData.length; i++) {
			if(resultOfData[3] != null) {
				 Qd = resultOfData[3]; 
				 
			}
		}
		
		
	}
	
	
	
	public ReportesVentas() {
		
		setLayout(null);
		setTitle("Reportes de ventas");
		getContentPane().setBackground(new Color(18, 246, 7));
		
		ImageIcon logo = new ImageIcon(System.getProperty("user.dir") + "\\images\\icon.png");
		JLabel label1 = new JLabel(logo);
		label1.setBounds(70, 10, 300, 150);
		add(label1);
		
		JLabel label2 = new JLabel("Reportes de ventas");
		label2.setBounds(95, 100, 300, 150);
		label2.setFont(new Font("Andale Mono", 3, 18));
		label2.setForeground(new Color(255, 255, 255));
		add(label2);
		
		JLabel labeluva = new JLabel("Uva total ventas es: " + Qa);
		labeluva.setBounds(30, 200, 300, 50);
		labeluva.setFont(new Font("Andale Mono", 3, 18));
		labeluva.setForeground(new Color(7, 43, 246));
		add(labeluva);

		
		JLabel labelman = new JLabel("Cola total ventas es: " + Qb);
		labelman.setBounds(30, 230, 300, 50);
		labelman.setFont(new Font("Andale Mono", 3, 18));
		labelman.setForeground(new Color(7, 43, 246));
		add(labelman);

		
		JLabel labelper = new JLabel("Pera total ventas es: " + Qc);
		labelper.setBounds(30, 260, 300, 50);
		labelper.setFont(new Font("Andale Mono", 3, 18));
		labelper.setForeground(new Color(7, 43, 246));
		add(labelper);

	
		JLabel labelmor = new JLabel("Mora total ventas es: " + Qd);
		labelmor.setBounds(30, 290, 300, 50);
		labelmor.setFont(new Font("Andale Mono", 3, 18));
		labelmor.setForeground(new Color(7, 43, 246));
		add(labelmor);
		
		boton2 = new JButton("Volver");
		boton2.setBounds(320, 350, 100, 30);
		add(boton2);
		boton2.addActionListener(this);
		
		boton3 = new JButton("Imprimir");
		boton3.setBounds(30, 350, 100, 30);
		add(boton3);
		boton3.addActionListener(this);
					
	}
			
	public static void main(String[] args) {
		ReportesVentas VentaReportesVentas = new ReportesVentas();
		VentaReportesVentas.setBounds(0, 0, 450, 450);
		VentaReportesVentas.setVisible(true);
		VentaReportesVentas.setResizable(false);
		VentaReportesVentas.setLocationRelativeTo(null);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton2) {
			Bienvenida ventanaBienvenida = new Bienvenida();
			ventanaBienvenida.setBounds(0, 0, 450, 450);
			ventanaBienvenida.setVisible(true);
			ventanaBienvenida.setResizable(false);
			ventanaBienvenida.setLocationRelativeTo(null);
			this.setVisible(false);
		}
		if (e.getSource() == boton3) {
			JOptionPane.showMessageDialog(null, "Su reporte se está imprimiendo");
		}
		
	}

}
