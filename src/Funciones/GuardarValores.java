package Funciones;

import javax.swing.JTextField;

public class GuardarValores {
	
	private JTextField textfield1, textfield2, textfield3, textfield4;

	public GuardarValores(JTextField textfield1, JTextField textfield2, JTextField textfield3, JTextField textfield4) {
		this.textfield1 = textfield1;
		this.textfield2 = textfield2;
		this.textfield3 = textfield3;
		this.textfield4 = textfield4;
	}

	public Integer[] Data() {
		Integer[] result = new Integer[3];
		result[0] = Integer.parseInt(textfield1.getText());
		result[1] = Integer.parseInt(textfield2.getText());
		result[2] = Integer.parseInt(textfield3.getText());
		result[3] = Integer.parseInt(textfield4.getText());
		return result;
	}
}
