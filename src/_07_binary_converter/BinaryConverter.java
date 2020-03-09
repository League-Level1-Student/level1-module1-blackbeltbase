package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
 JPanel panel = new JPanel();
 JTextField answer = new JTextField(20);
 JLabel output  = new JLabel();
 JButton convert = new JButton("convert");
 JFrame frame = new JFrame();
	public void run() {
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 convert.addActionListener(this);
	 panel.add(convert);
	 panel.add(answer);
	 frame.add(panel);
	 frame.pack();
	 frame.setVisible(true);
 }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton convertPressed = (JButton) e.getSource();
		if(convertPressed==convert) {
			String conversion = convert(answer.getText());
			output.setText(conversion);
			 panel.add(output);
			frame.pack();
		}
	}
	
	String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}
}
