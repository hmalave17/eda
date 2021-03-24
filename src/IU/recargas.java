package IU;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import DataJugos.Cantidad;
import Funciones.GuardarValores;

public class recargas extends JFrame implements ActionListener {

	private JLabel labeluva, labelman, labelper, labelmor, labelmensaje, labelmensaje2;
	private JTextField textfield1, textfield2, textfield3, textfield4;
	private JButton boton2, boton3;

	public recargas() {
		setLayout(null);
		setTitle("Recargas de Jugos");
		getContentPane().setBackground(new Color(18, 246, 7));

		JLabel labelmensaje = new JLabel("Introduzca la cantidad de jugos");
		labelmensaje.setBounds(95, 80, 300, 150);
		labelmensaje.setFont(new Font("Andale Mono", 3, 18));
		labelmensaje.setForeground(new Color(255, 255, 255));
		add(labelmensaje);

		JLabel labelmensaje2 = new JLabel("No exceda las 50 unidades");
		labelmensaje2.setBounds(95, 100, 300, 150);
		labelmensaje2.setFont(new Font("Andale Mono", 3, 18));
		labelmensaje2.setForeground(new Color(255, 255, 255));
		add(labelmensaje2);

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

		boton2 = new JButton("volver");
		boton2.setBounds(320, 350, 100, 30);
		add(boton2);
		boton2.addActionListener(this);

		boton3 = new JButton("Recargar");
		boton3.setBounds(305, 240, 120, 30);
		add(boton3);
		boton3.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == boton3) {

			boolean flag1 = Funciones.CamposVacios.text(textfield1, textfield2, textfield3, textfield4);
			if (flag1 == false) {

				boolean flag2 = Funciones.CamposConLetras.text(textfield1, textfield2, textfield3, textfield4,
						textfield1);
				if (flag2 == true) {

					JOptionPane.showMessageDialog(null, "Su recarga a sido exitosa");
					
					Integer[] quanityJuice = new Integer[4];
					String gb1 = textfield1.getText();
					quanityJuice[0] = Integer.parseInt(gb1);
					
					String gb2 = textfield2.getText();
					quanityJuice[1] = Integer.parseInt(gb2);
					
					String gb3 = textfield3.getText();
					quanityJuice[2] = Integer.parseInt(gb3);
					
					String gb4 = textfield4.getText();
					quanityJuice[3] = Integer.parseInt(gb4);
					
					
				}
			}

		}

		
		if (e.getSource() == boton2) {
			Bienvenida ventanaBienvenida = new Bienvenida();
			ventanaBienvenida.setBounds(0, 0, 450, 450);
			ventanaBienvenida.setVisible(true);
			ventanaBienvenida.setResizable(false);
			ventanaBienvenida.setLocationRelativeTo(null);
			this.setVisible(false);
		}
		
		
		
	}

	public static void main(String[] args) {
		recargas Ventanarecargas = new recargas();
		Ventanarecargas.setBounds(0, 0, 450, 450);
		Ventanarecargas.setVisible(true);
		Ventanarecargas.setResizable(false);
		Ventanarecargas.setLocationRelativeTo(null);
	}

}
