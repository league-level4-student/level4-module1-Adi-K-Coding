package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		switch(choice) {
		case "Sunday": 
			System.out.println("School Tomorrow :(");
			break;
		case "Monday": 
			System.out.println("Worst Day of the Week");
			break;
		case "Tuesday": 
			System.out.println("A little better, but still sucks");
			break;
		case "Wednesday": 
			System.out.println("Halfway There!");
			break;
		case "Thursday": 
			System.out.println("Almost There!");
			break;
		case "Friday": 
			System.out.println("FRIDAY!!!");
			break;
		case "Saturday": 
			System.out.println("Best day of the week");
			break;
		default: 
			System.out.println("Something went wrong :(");
			break;
		}
		//use a switch statement to do something cool for each option
		
	}
}
