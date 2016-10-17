package dp.cvs;

public class ppal {

	public static void main(String[] args) {
		Vehiculo coche=new Vehiculo();
		
		System.out.println(coche.toString());
		
		Vehiculo coche2=new Vehiculo("Mazda","0101ZZZ",100);
		System.out.println(coche2.toString());
		coche=coche2;
		System.out.println(coche.toString());
		
	}

}
