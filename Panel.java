package sample.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import sample.controller.appController;

public class Panel extends JPanel {

	//Initialize all of the objects in the window
	private appController baseController;
	private JLabel nameLabel;
	private JLabel descriptionLabel;
	private JLabel weightLabel;
	private JLabel sizeLabel;
	private JTextField nameField;
	private JTextField descriptionField;
	private JTextField weightField;
	private JTextField sizeField;
	private JButton createWidgetButton;
	private JButton createWhatsitButton;
	
	
	public Panel(appController baseController) {
		this.baseController = baseController;
		
		//Create all objects in the layout
		//labels
		nameLabel = new JLabel("Type the name of the Whatsit");
		descriptionLabel = new JLabel("Describe the Widget");
		weightLabel = new JLabel("Enter the weight for the Widget");
		sizeLabel = new JLabel("Enter the size of the Whatsit");
		
		//text fields
		nameField = new JTextField(20);
		descriptionField = new JTextField(15);
		weightField = new JTextField(10);
		sizeField = new JTextField(5);
		
		//buttons
		createWidgetButton = new JButton("Make a Widget!!");
		createWhatsitButton = new JButton("Make a Whatsit!!");
		
		//Format the window layout
		SpringLayout baseLayout = new SpringLayout();
		baseLayout.putConstraint(SpringLayout.SOUTH, sizeLabel, -6, SpringLayout.NORTH, sizeField);
		baseLayout.putConstraint(SpringLayout.EAST, sizeLabel, 0, SpringLayout.EAST, createWhatsitButton);
		baseLayout.putConstraint(SpringLayout.WEST, weightLabel, 0, SpringLayout.WEST, createWidgetButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, weightLabel, -6, SpringLayout.NORTH, weightField);
		baseLayout.putConstraint(SpringLayout.NORTH, weightField, 136, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, descriptionField, -42, SpringLayout.NORTH, weightField);
		baseLayout.putConstraint(SpringLayout.WEST, descriptionLabel, 0, SpringLayout.WEST, createWidgetButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, descriptionLabel, -6, SpringLayout.NORTH, descriptionField);
		baseLayout.putConstraint(SpringLayout.SOUTH, nameLabel, -6, SpringLayout.NORTH, nameField);
		baseLayout.putConstraint(SpringLayout.EAST, nameLabel, 0, SpringLayout.EAST, createWhatsitButton);
		baseLayout.putConstraint(SpringLayout.NORTH, sizeField, 0, SpringLayout.NORTH, weightField);
		baseLayout.putConstraint(SpringLayout.EAST, sizeField, 0, SpringLayout.EAST, createWhatsitButton);
		baseLayout.putConstraint(SpringLayout.WEST, weightField, 0, SpringLayout.WEST, createWidgetButton);
		baseLayout.putConstraint(SpringLayout.NORTH, nameField, 0, SpringLayout.NORTH, descriptionField);
		baseLayout.putConstraint(SpringLayout.EAST, nameField, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, descriptionField, 0, SpringLayout.WEST, createWidgetButton);
		baseLayout.putConstraint(SpringLayout.NORTH, createWhatsitButton, 0, SpringLayout.NORTH, createWidgetButton);
		baseLayout.putConstraint(SpringLayout.EAST, createWhatsitButton, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, createWidgetButton, 4, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, createWidgetButton, -10, SpringLayout.SOUTH, this);
		
		setupPanel(baseLayout);
		
	}
	
	//private void setupListeners(){}
	
	//private void setupLayout(){}
	
	private void setupPanel(SpringLayout baseLayout) {
		this.setLayout(baseLayout);
		this.add(createWidgetButton);
		this.add(createWhatsitButton);
		this.add(nameField);
		this.add(descriptionField);
		this.add(weightField);
		this.add(sizeField);
		this.add(nameLabel);
		this.add(descriptionLabel);
		this.add(weightLabel);
		this.add(sizeLabel);
	}
	
	
}

