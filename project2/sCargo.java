package project2;

public class sCargo extends Cargo {

	public sCargo(int cargoNo, String fromWhere, String senderName, String senderPhone, String toWhere,
			String destinationName, String destinationPhone, double weight,int range) {
		super(cargoNo, fromWhere, senderName, senderPhone, toWhere, destinationName, destinationPhone, weight, range);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double findPrice() {
		// TODO Auto-generated method stub
		return getWeight()*0.40*(getRange()*0.01);
	}

}
