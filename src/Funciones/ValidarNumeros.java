package Funciones;

public class ValidarNumeros {

	public static boolean isNumeric(String cadena) {
		try {
			if (cadena.isEmpty()) {
				return true;
			} else {
				Integer.parseInt(cadena);
				return true;
			}
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

}
