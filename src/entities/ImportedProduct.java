package entities;

public class ImportedProduct extends Product {
	
	private Double customFee;
	
	public ImportedProduct() {
		
	}

	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name + "/n");
		sb.append(price + "/n");
		sb.append("(CustomFeee: " + customFee);
		return sb.toString();
	}
	

}
