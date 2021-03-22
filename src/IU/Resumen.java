package IU;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class Resumen extends JFrame implements ActionListener {

	private JTextField textfield1, textfield2, textfield3, textfield4;
	private JLabel label1, label2, label3, label4, labeluva, labelman, labelper, labelmor;
	private JButton boton1;
	private int Costo; 
	
	public Resumen() {
		
		setLayout(null);
		setTitle("Resumen de compras");
		getContentPane().setBackground(new Color(18, 246, 7));

		ImageIcon logo = new ImageIcon(System.getProperty("user.dir") + "\\images\\images2.png");
		JLabel label1 = new JLabel(logo);
		label1.setBounds(70, 10, 300, 150);
		add(label1);
		
		JLabel label2 = new JLabel("Resumen de su compra");
		label2.setBounds(95, 100, 300, 150);
		label2.setFont(new Font("Andale Mono", 3, 18));
		label2.setForeground(new Color(255, 255, 255));
		add(label2);
		
		
		JLabel label3 = new JLabel("su cambio es");
		label3.setBounds(120, 150, 300, 150);
		label3.setFont(new Font("Andale Mono", 3, 18));
		label3.setForeground(new Color(255, 255, 255));
		add(label3);
		
		JLabel label4 = new JLabel("gracias por su compra");
		label4.setBounds(120, 210, 300, 150);
		label4.setFont(new Font("Andale Mono", 3, 18));
		label4.setForeground(new Color(255, 255, 255));
		add(label4);
		
		boton1 = new JButton("NUEVA COMPRA");
		boton1.setBounds(290, 350, 140, 30);
		add(boton1);
		boton1.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {

		Resumen VentanaResumen = new Resumen();
		VentanaResumen.setBounds(0, 0, 450, 450);
		VentanaResumen.setVisible(true);
		VentanaResumen.setResizable(false);
		VentanaResumen.setLocationRelativeTo(null);
		
		
		
		
		
		
	}

}
