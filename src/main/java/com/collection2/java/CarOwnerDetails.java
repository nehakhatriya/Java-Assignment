package com.collection2.java;

public class CarOwnerDetails {

	private String owerName;
	private String carModel;
	private String carNO; 
	private int owerMobileNo;
	private String owerAddress;
	
	public CarOwnerDetails(String owerName, String carModel, String carNO, int owerMobileNo, String owerAddress) {
		super();
		this.owerName = owerName;
		this.carModel = carModel;
		this.carNO = carNO;
		this.owerMobileNo = owerMobileNo;
		this.owerAddress = owerAddress;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carNO == null) ? 0 : carNO.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarOwnerDetails other = (CarOwnerDetails) obj;
		if (carNO == null) {
			if (other.carNO != null)
				return false;
		} else if (!carNO.equals(other.carNO))
			return false;
		return true;
	}

	public String getOwerName() {
		return owerName;
	}

	public void setOwerName(String owerName) {
		this.owerName = owerName;
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

	public int getOwerMobileNo() {
		return owerMobileNo;
	}

	public void setOwerMobileNo(int owerMobileNo) {
		this.owerMobileNo = owerMobileNo;
	}

	public String getOwerAddress() {
		return owerAddress;
	}

	public void setOwerAddress(String owerAddress) {
		this.owerAddress = owerAddress;
	}




	
}
