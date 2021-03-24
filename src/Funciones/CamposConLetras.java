package Funciones;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CamposConLetras {
	
	public static boolean text(JTextField textfield1, JTextField textfield2, JTextField textfield3, JTextField textfield4, JTextField textfield5 ) {
		boolean flag = true; 
		if ((ValidarNumeros.isNumeric(textfield1.getText()) == false)
				|| (ValidarNumeros.isNumeric(textfield2.getText()) == false)
				|| (ValidarNumeros.isNumeric(textfield3.getText()) == false)
				|| (ValidarNumeros.isNumeric(textfield4.getText()) == false)
				|| (ValidarNumeros.isNumeric(textfield5.getText()) == false)
				) { 

			JOptionPane.showMessageDialog(null, "Introduzca sólo valores Numericos");
			flag = false;
		}
		return flag;
	}
}
