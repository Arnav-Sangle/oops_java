import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.SwingConstants;

public class CalciApp {

	private JFrame frame;
	private JTextField textField;
	private final Action action = new SwingAction();
	
//	Global vars
	double num1;
	double num2;
	double result;
	String oprtn;
	String ans;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalciApp window = new CalciApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalciApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 221, 422);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 180, 33);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button1.getText();
				textField.setText(EnterNumber);
			}
		});
		button1.setBounds(9, 111, 45, 44);
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button2.getText();
				textField.setText(EnterNumber);
			}
		});
		button2.setBounds(52, 111, 45, 44);
		frame.getContentPane().add(button2);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button3.getText();
				textField.setText(EnterNumber);
			}
		});
		button3.setBounds(95, 111, 45, 44);
		frame.getContentPane().add(button3);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button4.getText();
				textField.setText(EnterNumber);
			}
		});
		button4.setBounds(9, 166, 45, 44);
		frame.getContentPane().add(button4);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button5.getText();
				textField.setText(EnterNumber);
			}
		});
		button5.setBounds(52, 166, 45, 44);
		frame.getContentPane().add(button5);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button6.getText();
				textField.setText(EnterNumber);
			}
		});
		button6.setBounds(95, 166, 45, 44);
		frame.getContentPane().add(button6);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button7.getText();
				textField.setText(EnterNumber);
			}
		});
		button7.setBounds(10, 221, 45, 44);
		frame.getContentPane().add(button7);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button8.getText();
				textField.setText(EnterNumber);
			}
		});
		button8.setBounds(53, 221, 45, 44);
		frame.getContentPane().add(button8);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button9.getText();
				textField.setText(EnterNumber);
			}
		});
		button9.setBounds(96, 221, 45, 44);
		frame.getContentPane().add(button9);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + button0.getText();
				textField.setText(EnterNumber);
			}
		});
		button0.setBounds(9, 276, 45, 44);
		frame.getContentPane().add(button0);
		
		JButton buttonBackspace = new JButton("B");
		buttonBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				
				if(textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					backspace = strB.toString();
					textField.setText(backspace);
				}
			}
		});
		buttonBackspace.setBounds(96, 56, 45, 44);
		frame.getContentPane().add(buttonBackspace);
		
		JButton buttonOnOff = new JButton("On/Off");
		buttonOnOff.setBounds(9, 56, 80, 44);
		frame.getContentPane().add(buttonOnOff);
		
		JButton buttonSubtract = new JButton("-");
		buttonSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
//				String EnterNumber = textField.getText() + buttonSubtract.getText();
//				textField.setText(EnterNumber);
				textField.setText("");
				oprtn = "-";
			}
		});
		buttonSubtract.setBounds(145, 166, 45, 44);
		frame.getContentPane().add(buttonSubtract);
		
		JButton buttonModuloDiv = new JButton("%");
		buttonModuloDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				oprtn = "%";
			}
		});
		buttonModuloDiv.setBounds(145, 331, 45, 41);
		frame.getContentPane().add(buttonModuloDiv);
		
		JButton buttonDecimalPoint = new JButton(".");
		buttonDecimalPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().contains("."))
		          {
					textField.setText(textField.getText() + buttonDecimalPoint.getText());
		          }
			}
		});
		buttonDecimalPoint.setBounds(52, 276, 45, 44);
		frame.getContentPane().add(buttonDecimalPoint);
		
		JButton buttonEquals = new JButton("=");
		buttonEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String ans;
//				int len1 = textField.getText().length();
		
				num2 = Double.parseDouble(textField.getText());
				
				if(oprtn == "+") {
					result = num1 + num2;
					ans = String.format("%.2f", result);
					textField.setText(ans);
				}
				else if(oprtn == "-") {
					result = num1 - num2;
					ans = String.format("%.2f", result);
					textField.setText(ans);
				}
				else if(oprtn == "x") {
					result = num1 * num2;
					ans = String.format("%.2f", result);
					textField.setText(ans);
				}
				else if(oprtn == "/") {
					result = num1 / num2;
					ans = String.format("%.2f", result);
					textField.setText(ans);
				}
				else if(oprtn == "%") {
					result = num1 % num2;
					ans = String.format("%.2f", result);
					textField.setText(ans);
				}
				
				
			}
		});
		buttonEquals.setBounds(95, 276, 45, 44);
		frame.getContentPane().add(buttonEquals);
		
		JButton buttonClearAll = new JButton("C");
		buttonClearAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		buttonClearAll.setBounds(145, 56, 45, 44);
		frame.getContentPane().add(buttonClearAll);
		
		JButton buttonMultiply = new JButton("x");
		buttonMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				oprtn = "x";
			}
		});
		buttonMultiply.setBounds(145, 221, 45, 44);
		frame.getContentPane().add(buttonMultiply);
		
		JButton buttonDivide = new JButton("/");
		buttonDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				oprtn = "/";
			}
		});
		buttonDivide.setBounds(145, 276, 45, 44);
		frame.getContentPane().add(buttonDivide);
		
		JButton buttonAdd = new JButton("+");
		buttonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				oprtn = "+";
			}
		});
		buttonAdd.setBounds(145, 111, 45, 44);
		frame.getContentPane().add(buttonAdd);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
