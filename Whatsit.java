package sample.model;

public class Whatsit {

	//Create local variables
	private int size;
	private String name;
	
	//Constructor
	public Whatsit(int size, String name) {
		this.size = size;
		this.name = name;
	}

	//Setters and Getters for the above
	public int getSize() {
		return size;
	}

	public String getName() {
		return name;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setName(String name) {
		this.name = name;
	}
}
