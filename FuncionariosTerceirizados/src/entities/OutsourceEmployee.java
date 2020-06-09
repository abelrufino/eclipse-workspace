package entities;

public class OutsourceEmployee extends Employee {
	public double additionalCharge;
	
	public OutsourceEmployee() {
		
	}

	public OutsourceEmployee(String name, Integer hours, double valuePerHour, double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double Payment() {
		return super.Payment() + additionalCharge * 1.1;
	}
}
