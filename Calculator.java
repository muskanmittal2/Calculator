package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;

public class Calculator {
	
	private JFrame frmCalculator;
	private JTextField textField;
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private JTextField txtThisProjectIs;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public 	Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setAlwaysOnTop(true);
		frmCalculator.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\DELL\\Desktop\\caclipic.png"));
		frmCalculator.setBackground(Color.LIGHT_GRAY);
		frmCalculator.setTitle("                                          CALCULATOR");
		frmCalculator.setBounds(100, 100, 439, 470);
		//SHOW WARNING MSG WHILE CLOSING THE GUI
		frmCalculator.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frmCalculator.addWindowListener((WindowListener) new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				int choose =JOptionPane.showConfirmDialog(null,
						"Do you really want to exit the application?",
						"Coinfrm close", JOptionPane.YES_NO_OPTION,
						JOptionPane.INFORMATION_MESSAGE);
				if (choose == JOptionPane.YES_OPTION) {
					e.getWindow().dispose();
				}
			}
		});
	//	frmCalculator.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		frmCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Calibri", Font.BOLD, 20));
		textField.setBounds(20, 23, 381, 75);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnbackspace = new JButton("\uF0E7");
		btnbackspace.setToolTipText("");
		btnbackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String backSpace = null;
			if(textField.getText().length()>0) {
				StringBuilder str = new StringBuilder(textField.getText());
				str.deleteCharAt(textField.getText().length()-1);
				backSpace = str.toString();
				textField.setText(backSpace);
			}
			}
		});
		btnbackspace.setFont(new Font("Wingdings", Font.BOLD, 29));
		btnbackspace.setBounds(20, 107, 92, 54);
		frmCalculator.getContentPane().add(btnbackspace);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 27));
		btn7.setBounds(20, 161, 92, 54);
		frmCalculator.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 27));
		btn4.setBounds(20, 217, 92, 54);
		frmCalculator.getContentPane().add(btn4);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Century", Font.BOLD, 31));
		btnClear.setBounds(116, 107, 92, 54);
		frmCalculator.getContentPane().add(btnClear);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 27));
		btn8.setBounds(116, 161, 92, 54);
		frmCalculator.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 27));
		btn5.setBounds(116, 217, 92, 54);
		frmCalculator.getContentPane().add(btn5);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 27));
		btn00.setBounds(212, 107, 92, 54);
		frmCalculator.getContentPane().add(btn00);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 27));
		btn9.setBounds(212, 161, 92, 54);
		frmCalculator.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 27));
		btn6.setBounds(212, 217, 92, 54);
		frmCalculator.getContentPane().add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String number=textField.getText()+btn1.getText();
			textField.setText(number);
			}
		});
		btn1.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 27));
		btn1.setBounds(20, 273, 92, 54);
		frmCalculator.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 27));
		btn0.setBounds(20, 329, 92, 54);
		frmCalculator.getContentPane().add(btn0);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 27));
		btn2.setBounds(116, 273, 92, 54);
		frmCalculator.getContentPane().add(btn2);
		
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btndot.getText();
				textField.setText(number);
			}
		});
		btndot.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 27));
		btndot.setBounds(116, 329, 92, 54);
		frmCalculator.getContentPane().add(btndot);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 27));
		btn3.setBounds(212, 273, 92, 54);
		frmCalculator.getContentPane().add(btn3);
		
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String answer;
			second=Double.parseDouble(textField.getText());
			if(operation == "+") {
				result = first+second;
				answer = String.format("%.2f", result);
				textField.setText(answer);
			}
			else if(operation == "-") {
				result = first-second;
				answer = String.format("%.2f", result);
				textField.setText(answer);
			}
			else if(operation == "*") {
				result = first*second;
				answer = String.format("%.2f", result);
				textField.setText(answer);
			}
			else if(operation == "/" && second == 0  ){
				result = first/second;
				textField.setText("ND");
			}
			else if(operation == "/") {
				result = first/second;
				answer = String.format("%.2f", result);
				textField.setText(answer);
			}

			else if(operation == "%") {
				result = first%second;
				answer = String.format("%.2f", result);
				textField.setText(answer);
			}
			
				
			
			}
		});
		btnequal.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 27));
		btnequal.setBounds(212, 329, 92, 54);
		frmCalculator.getContentPane().add(btnequal);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			first=Double.parseDouble(textField.getText());
			textField.setText("");
			operation = "+";
			
			}
		});
		btnplus.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 27));
		btnplus.setBounds(305, 107, 92, 54);
		frmCalculator.getContentPane().add(btnplus);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnsub.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 27));
		btnsub.setBounds(305, 161, 92, 54);
		frmCalculator.getContentPane().add(btnsub);
		
		JButton btnmul = new JButton("*");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnmul.setFont(new Font("Cambria", Font.BOLD, 32));
		btnmul.setBounds(305, 217, 92, 54);
		frmCalculator.getContentPane().add(btnmul);
		
		JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btndiv.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 27));
		btndiv.setBounds(305, 273, 92, 54);
		frmCalculator.getContentPane().add(btndiv);
		
		JButton btnper = new JButton("%");
		btnper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btnper.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 27));
		btnper.setBounds(305, 329, 92, 54);
		frmCalculator.getContentPane().add(btnper);
		
		txtThisProjectIs = new JTextField();
		txtThisProjectIs.setBackground(Color.LIGHT_GRAY);
		txtThisProjectIs.setForeground(Color.BLACK);
		txtThisProjectIs.setFont(new Font("Calibri", Font.BOLD, 15));
		txtThisProjectIs.setText("        This project is made by Muskan");
		txtThisProjectIs.setBounds(89, 387, 243, 19);
		frmCalculator.getContentPane().add(txtThisProjectIs);
		txtThisProjectIs.setColumns(10);
	}
}
