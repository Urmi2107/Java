package pkgCollections;

public class Parked_CarOwner_Details {
	 private String	ownerName, carModel, carNO,  ownerAddress;
     private double ownerMobileNo;
	 
     public Parked_CarOwner_Details(String ownerName, String carModel,
			String carNO, String ownerAddress, double ownerMobileNo) {
		
		this.ownerName = ownerName;
		this.carModel = carModel;
		this.carNO = carNO;
		this.ownerAddress = ownerAddress;
		this.ownerMobileNo = ownerMobileNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarNO() {
		return carNO;
	}

	public void setCarNO(String carNO) {
		this.carNO = carNO;
	}

	public String getOwnerAddress() {
		return ownerAddress;
	}

	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}

	public double getOwnerMobileNo() {
		return ownerMobileNo;
	}

	public void setOwnerMobileNo(double ownerMobileNo) {
		this.ownerMobileNo = ownerMobileNo;
	}
     
    public String toString()
    {
    	return ownerName+" "+carModel+" "+carNO+" "+ownerAddress+" "+ownerMobileNo;
    }

}
