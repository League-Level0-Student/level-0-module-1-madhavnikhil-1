package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;


public class unbirthday {
	
	public static void main(String[] args) {
		
	
String birthday = JOptionPane.showInputDialog("When is your birhtday?");

if (birthday.equalsIgnoreCase("11/21")) {
	JOptionPane.showMessageDialog(null, "Happy Birthday");
	
}
else {
	JOptionPane.showMessageDialog(null, "Whish you a very merry unbirthday");
}

}
}