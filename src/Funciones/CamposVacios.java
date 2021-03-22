package Funciones;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CamposVacios {

	public static boolean text(JTextField textfield1, JTextField textfield2, JTextField textfield3,
			JTextField textfield4) {
		boolean flag = false;
		if ((textfield1.getText().equalsIgnoreCase("")) && (textfield2.getText().equalsIgnoreCase(""))
				&& (textfield3.getText().equalsIgnoreCase("")) && (textfield4.getText().equalsIgnoreCase(""))) {
			JOptionPane.showMessageDialog(null, "Debe introducir al menos una cantidad");
			flag = true;
		}
		return flag;
	}
}
