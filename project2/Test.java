package project2;

public class Test {

	public static void main(String[] args) {
		Branch b = new Branch();
		Cargo c = new sCargo(1,"batman","ali","123","ankara","veli","234",7,900);
		Cargo c1 = new sCargo(1,"batman","ali","123","ankara","veli","234",7,900);
		Cargo c2 = new lCargo(1,"batman","ali","123","ankara","veli","234",7,900);
		b.addCargo(c);
		b.addCargo(c1);
		b.addCargo(c2);
		
		
		b.cargoList();
		System.out.println(c2.findTime());
	
		
		

	}

}
