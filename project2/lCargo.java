package project2;

public class lCargo extends Cargo {

	public lCargo(int cargoNo, String fromWhere, String senderName, String senderPhone, String toWhere,
			String destinationName, String destinationPhone, double weight,int range) {
		super(cargoNo, fromWhere, senderName, senderPhone, toWhere, destinationName, destinationPhone, weight,range);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double findPrice() {
		
		return getWeight()*0.90*(getRange()*0.01);
	}

}
