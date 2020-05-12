package project2;



public abstract class Cargo {
	private int cargoNo;
    private String fromWhere;
    private String senderName;
    private String senderPhone;
    private String toWhere;
    private String destinationName;
    private String destinationPhone;
    private double weight;
    private int range;
    public Cargo(int cargoNo, String fromWhere, String senderName, String senderPhone, String toWhere,
                 String destinationName, String destinationPhone, double weight,int range)  {
        
        this.cargoNo = cargoNo;
        this.fromWhere = fromWhere;
        this.senderName = senderName;
        this.senderPhone = senderPhone;
        this.toWhere = toWhere;
        this.destinationName = destinationName;
        this.destinationPhone = destinationPhone;
        this.weight = weight;
        this.range=range;
        }
    public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public String toString() {
        return "Cargo [cargoNo=" + cargoNo + ", fromWhere=" + fromWhere + ", senderName=" + senderName
                + ", senderPhon	e=" + senderPhone + ", toWhere=" + toWhere + ", destinationName=" + destinationName
                + ", destinationPhone=" + destinationPhone + ", weight=" + weight + "]";
    }
    public int getCargoNo() {
        return cargoNo;
    }
    public void setCargoNo(int cargoNo) {
        this.cargoNo = cargoNo;
    }
    public String getFromWhere() {
        return fromWhere;
    }
    public void setFromWhere(String fromWhere) {
        this.fromWhere = fromWhere;
    }
    public String getSenderName() {
        return senderName;
    }
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }
    public String getSenderPhone() {
        return senderPhone;
    }
    public void setSenderPhone(String senderPhone) {
        this.senderPhone = senderPhone;
    }
    public String getToWhere() {
        return toWhere;
    }
    public void setToWhere(String toWhere) {
        this.toWhere = toWhere;
    }
    public String getDestinationName() {
        return destinationName;
    }
    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }
    public String getDestinationPhone() {
        return destinationPhone;
    }
    public void setDestinationPhone(String destinationPhone) {
        this.destinationPhone = destinationPhone;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public double findTime() {
    	return range/90;
    }
    
    
    public abstract double findPrice();
	

}
