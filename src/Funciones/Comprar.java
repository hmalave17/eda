package Funciones;

public class Comprar {
	
	private int Quva, Qman, Qper, Qmor, QIngreso, Costojugos, vueltas;
	
	public Comprar(int Quva, int Qman, int Qper, int Qmor, int QIngreso, int Costojugos, int vueltas) {
	
		this.Quva = Quva;
		this.Qman = Qman;
		this.Qper = Qper; 
		this.Qmor = Qmor; 
		this.QIngreso = QIngreso; 
		this.Costojugos = Costojugos; 
		this.vueltas  = vueltas; 
		
	}
	
	public void CostoTotal(int Quva, int Qman, int Qper, int Qmor, int Costojugos) {
	
		this.Costojugos = ( (Quva*2500) + (Qman*2500) + (Qper*2500) + (Qmor*2500));  
		
	}
	
	public void compra(){
		
		if(this.Costojugos > this.QIngreso) {
			
			System.out.println("La cantidad de dinero introducida no es la suficiente");
		}
		 if (this.Costojugos == this.QIngreso) {
			System.out.println("Retire sus bebidas y gracias por su compra");
		}else {
			vueltas = (QIngreso - Costojugos); 
			System.out.println("Retire sus bebidas");
			System.out.println("Su vueltas son de: " + vueltas + "$");
			System.out.println("Retire sus vueltas");
			System.out.println("Gracias por su compra");
		}
		
	}
	
	
	
}
