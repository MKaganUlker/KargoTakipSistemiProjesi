package project2;

public class mCargo extends Cargo {

	public mCargo(int cargoNo, String fromWhere, String senderName, String senderPhone, String toWhere,
			String destinationName, String destinationPhone, double weight,int range) {
		super(cargoNo, fromWhere, senderName, senderPhone, toWhere, destinationName, destinationPhone, weight,range);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double findPrice() {
		
		return getWeight()*0.60*(getRange()*0.01);
	}

}
