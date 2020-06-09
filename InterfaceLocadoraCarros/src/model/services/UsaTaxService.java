package model.services;

public class UsaTaxService implements TaxService {
	public Double tax(Double amount) {
		if(amount<=200.0) {
			return amount * 0.10;
		} else {
			return amount * 0.15;
		}
	}
}
