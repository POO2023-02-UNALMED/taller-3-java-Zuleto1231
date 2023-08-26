package taller3.televisores;

public class prueba {

	public static void main(String[] args) {
		Marca marca1 =new Marca("LG");
		TV tv1= new TV(marca1,true);
		tv1.turnOff();
		System.out.println(tv1.estado);
		

	}

}
