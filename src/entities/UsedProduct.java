package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
	private Date manuFactureDate;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy)");
	
	public UsedProduct() {
		
	}

	public UsedProduct(String name, Double price, Date manuFactureDate) {
		super(name, price);
		this.manuFactureDate = manuFactureDate;
	}

	public Date getManuFactureDate() {
		return manuFactureDate;
	}

	public void setManuFactureDate(Date manuFactureDate) {
		this.manuFactureDate = manuFactureDate;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name + "/n");
		sb.append(price + "/n");
		sb.append("Manufacture date :" + sdf.format(manuFactureDate));
		return sb.toString();
	}

}
