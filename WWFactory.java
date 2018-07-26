package sample.model;

import java.util.ArrayList;

public class WWFactory {

	//Initialize variables
	private ArrayList<Whatsit> whatsitList;
	private ArrayList<Widget> widgetList;
	private int widgetResourceCount;
	private int whatsitResourceCount;
	
	
	public WWFactory() {
		
		//Declare objects
		whatsitList = new ArrayList<Whatsit>();
		widgetList = new ArrayList<Widget>();
		
		widgetResourceCount = 30;
		whatsitResourceCount = 10;
	}
	
	//Setters and Getters for the above objects and variables
	public ArrayList<Whatsit> getWhatsitList() {
		return whatsitList;
	}

	public ArrayList<Widget> getWidgetList() {
		return widgetList;
	}

	public int getWidgetResourceCount() {
		return widgetResourceCount;
	}

	public int getWhatsitResourceCount() {
		return whatsitResourceCount;
	}

	public void setWhatsitList(ArrayList<Whatsit> whatsitList) {
		this.whatsitList = whatsitList;
	}

	public void setWidgetList(ArrayList<Widget> widgetList) {
		this.widgetList = widgetList;
	}

	public void setWidgetResourceCount(int widgetResourceCount) {
		this.widgetResourceCount = widgetResourceCount;
	}

	public void setWhatsitResourceCount(int whatsitResourceCount) {
		this.whatsitResourceCount = whatsitResourceCount;
	}

	//Method creates a Widget if applicable
	public boolean makeWidget(double weight, String description) {
		boolean canMake = false;
		//check if enough resources exist
		if(widgetResourceCount > 0) {
			Widget widget = new Widget(weight, description);
			//resources go down with each created object
			widgetResourceCount--;
			widgetList.add(widget);
			canMake = true;			
		}
		//return true or false if we can build object
		return canMake;
	}
	
	//Method creates a Whatsit
	public boolean makeWhatsit(int size, String name) {
		boolean canMake = false;
		//check if enough resources exist
		if(whatsitResourceCount > 0) {
			Whatsit whatsit = new Whatsit(size, name);
			//resources go down with each created object
			whatsitResourceCount--;
			whatsitList.add(whatsit);
			canMake = true;			
		}
		//return true or false if we can build object
		return canMake;
	}
	
}
