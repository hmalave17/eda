package Funciones;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ComprobarPago {
	
	public static boolean text(JTextField textfield5) {
		
		boolean flag = false;
		if ((textfield5.getText().equalsIgnoreCase(""))) {
			JOptionPane.showMessageDialog(null, "Debe introducir un monto de dinero");
			flag = true;
		}
		return flag;
		
		
		
		
	}

}
