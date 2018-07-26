package sample.model;

public class Widget {

	//Create local variables
	private double weight;
	private String description;
	
	//constructor
	public Widget(double weight, String description) {
		this.weight = weight;
		this.description = description;
	}

	//Setters and getters for the above variables
	public double getWeight() {
		return weight;
	}

	public String getDescription() {
		return description;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
