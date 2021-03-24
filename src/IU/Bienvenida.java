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
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import Funciones.GuardarValores;

public class Bienvenida extends JFrame implements ActionListener {

	private JTextField textfield1, textfield2, textfield3, textfield4, textfield5;
	private JLabel label1, label2, label3, label4, labeluva, labelman, labelper, labelmor, labelbpago, labelprecio;
	private JButton boton2, boton3;
	private JMenuBar menubar;
	private JMenu menu1; 
	private JMenuItem menuItem1, menuItem2; 
	private int Costojugos;

	public Bienvenida() {

		this.UI();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == boton2) {

			boolean flag1 = Funciones.CamposVacios.text(textfield1, textfield2, textfield3, textfield4);
			if (flag1 == false) {

				boolean flag2 = Funciones.CamposConLetras.text(textfield1, textfield2, textfield3, textfield4,
						textfield5);
				if (flag2 == true) {

					boolean flag3 = Funciones.ComprobarPago.text(textfield5);
					if (flag3 == false) {

						GuardarValores data = new GuardarValores(textfield1, textfield2, textfield3, textfield4,
								textfield5);
						Integer[] resultOfData = data.Data();

						int Costojugos = (((resultOfData[0]) + (resultOfData[1]) + (resultOfData[2])
								+ (resultOfData[3])) * 2500);
						int DineroIngresado = resultOfData[4];

						if (Costojugos > DineroIngresado) {
							JOptionPane.showMessageDialog(null, "La cantidad de dinero no es suficiente");
						} else {
							
							int Vueltas = DineroIngresado - Costojugos; 
							
							Resumen VentanaResumen = new Resumen(Vueltas);
							VentanaResumen.setBounds(0, 0, 450, 450);
							VentanaResumen.setVisible(true);
							VentanaResumen.setResizable(false);
							VentanaResumen.setLocationRelativeTo(null);
							this.setVisible(false);
							
							

						}

					}

				}
			}

		}

		if (e.getSource() == menuItem1) {
			
			recargas Ventanarecargas = new recargas();
			Ventanarecargas.setBounds(0, 0, 450, 450);
			Ventanarecargas.setVisible(true);
			Ventanarecargas.setResizable(false);
			Ventanarecargas.setLocationRelativeTo(null);
			this.setVisible(false);
		}
		
		
		
		
		
		
		
		
		
		
	}
	

	public static void main(String[] args) {
		resources();
	}

	public static void resources() {
		Bienvenida ventanaBienvenida = new Bienvenida();
		ventanaBienvenida.setBounds(0, 0, 450, 450);
		ventanaBienvenida.setVisible(true);
		ventanaBienvenida.setResizable(false);
		ventanaBienvenida.setLocationRelativeTo(null);
	}

	public void UI() {
		setLayout(null);
		setTitle("Bienvenido");
		getContentPane().setBackground(new Color(18, 246, 7));

		menubar = new JMenuBar();
		setJMenuBar(menubar);

		menu1 = new JMenu("ADMIN");
		menubar.add(menu1);

				
		menuItem1 = new JMenuItem("RECARGAS");
		menu1.add(menuItem1);
		menuItem1.addActionListener(this); 
		
		menuItem2 = new JMenuItem("REPORTES DE VENTAS");
		menu1.add(menuItem2);
		menuItem2.addActionListener(this); 
	

		ImageIcon logo = new ImageIcon(System.getProperty("user.dir") + "\\images\\icon.png");
		JLabel label1 = new JLabel(logo);
		label1.setBounds(70, 10, 300, 150);
		add(label1);

		JLabel label2 = new JLabel("Sistema de compra de jugos");
		label2.setBounds(95, 100, 300, 150);
		label2.setFont(new Font("Andale Mono", 3, 18));
		label2.setForeground(new Color(255, 255, 255));
		add(label2);

		JLabel label3 = new JLabel("introduzca la cantidad de jugos a adquirir y de click en comprar");
		label3.setBounds(30, 120, 400, 150);
		label3.setFont(new Font("Andale Mono", 1, 12));
		label3.setForeground(new Color(255, 255, 255));
		add(label3);

		JLabel labelprecio = new JLabel("Precio de cada uno es de 2500$");
		labelprecio.setBounds(30, 150, 400, 150);
		labelprecio.setFont(new Font("Andale Mono", 1, 12));
		labelprecio.setForeground(new Color(255, 255, 255));
		add(labelprecio);

		JLabel labeluva = new JLabel("Uva");
		labeluva.setBounds(30, 230, 50, 50);
		labeluva.setFont(new Font("Andale Mono", 3, 18));
		labeluva.setForeground(new Color(7, 43, 246));
		add(labeluva);

		textfield1 = new JTextField();
		textfield1.setBounds(130, 245, 30, 20);
		add(textfield1);

		JLabel labelman = new JLabel("Cola");
		labelman.setBounds(30, 260, 150, 50);
		labelman.setFont(new Font("Andale Mono", 3, 18));
		labelman.setForeground(new Color(7, 43, 246));
		add(labelman);

		textfield2 = new JTextField();
		textfield2.setBounds(130, 275, 30, 20);
		add(textfield2);

		JLabel labelper = new JLabel("Pera");
		labelper.setBounds(30, 290, 50, 50);
		labelper.setFont(new Font("Andale Mono", 3, 18));
		labelper.setForeground(new Color(7, 43, 246));
		add(labelper);

		textfield3 = new JTextField();
		textfield3.setBounds(130, 305, 30, 20);
		add(textfield3);

		JLabel labelmor = new JLabel("Mora");
		labelmor.setBounds(30, 320, 150, 50);
		labelmor.setFont(new Font("Andale Mono", 3, 18));
		labelmor.setForeground(new Color(7, 43, 246));
		add(labelmor);

		textfield4 = new JTextField();
		textfield4.setBounds(130, 335, 30, 20);
		add(textfield4);

		boton2 = new JButton("Comprar");
		boton2.setBounds(320, 350, 100, 30);
		add(boton2);
		boton2.addActionListener(this);

		boton3 = new JButton("ingrese pago");
		boton3.setBounds(305, 240, 120, 30);
		add(boton3);
		boton3.addActionListener(this);

		textfield5 = new JTextField();
		textfield5.setBounds(305, 280, 50, 20);
		add(textfield5);

		JLabel label4 = new JLabel("©2021 Vecchionacce Company");
		label4.setBounds(135, 365, 300, 30);
		label4.setFont(new Font("Andale Mono", 1, 12));
		label4.setForeground(new Color(255, 255, 255));
		add(label4);

		this.Costojugos = Costojugos;

	}
}
