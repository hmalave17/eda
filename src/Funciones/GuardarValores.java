package Funciones;

import javax.swing.JTextField;

public class GuardarValores {
	
	private JTextField textfield1, textfield2, textfield3, textfield4, textfield5 ;

	public GuardarValores(JTextField textfield1, JTextField textfield2, JTextField textfield3, JTextField textfield4, JTextField textfield5) {
		this.textfield1 = textfield1;
		this.textfield2 = textfield2;
		this.textfield3 = textfield3;
		this.textfield4 = textfield4;
		this.textfield5 = textfield5; 
	}

	public Integer[] Data() {
		Integer[] result = new Integer[5];
		
		if(textfield1.getText().isEmpty()) {
			result[0] = 0;
		}else {
			result[0] = Integer.parseInt(textfield1.getText());
		}
		
		if(textfield2.getText().isEmpty()) {
			result[1] = 0;
		}else {
			result[1] = Integer.parseInt(textfield2.getText());
		}
		
		if(textfield3.getText().isEmpty()) {
			result[2] = 0;
		}else {
			result[2] = Integer.parseInt(textfield3.getText());
		}
		
		if(textfield4.getText().isEmpty()) {
			result[3] = 0;
		}else {
			result[3] = Integer.parseInt(textfield4.getText());
		}
		if(textfield5.getText().isEmpty()) {
			result[4] = 0;
		}else {
			result[4] = Integer.parseInt(textfield5.getText());
		}
		
		return result;
	}
} 
 

