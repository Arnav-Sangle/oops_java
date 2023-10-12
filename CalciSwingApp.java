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
		frame.setBounds(100, 100, 211, 422);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 175, 33);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button1 = new JButton("1");
		button1.setBounds(9, 111, 39, 44);
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton("2");
		button2.setBounds(53, 111, 39, 44);
		frame.getContentPane().add(button2);
		
		JButton button3 = new JButton("3");
		button3.setBounds(96, 111, 39, 44);
		frame.getContentPane().add(button3);
		
		JButton button4 = new JButton("4");
		button4.setBounds(9, 166, 39, 44);
		frame.getContentPane().add(button4);
		
		JButton button5 = new JButton("5");
		button5.setBounds(53, 166, 39, 44);
		frame.getContentPane().add(button5);
		
		JButton button6 = new JButton("6");
		button6.setBounds(96, 166, 39, 44);
		frame.getContentPane().add(button6);
		
		JButton button7 = new JButton("7");
		button7.setBounds(10, 221, 39, 44);
		frame.getContentPane().add(button7);
		
		JButton button8 = new JButton("8");
		button8.setBounds(53, 221, 39, 44);
		frame.getContentPane().add(button8);
		
		JButton button9 = new JButton("9");
		button9.setBounds(96, 221, 39, 44);
		frame.getContentPane().add(button9);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button0.setBounds(9, 276, 39, 44);
		frame.getContentPane().add(button0);
		
		JButton buttonBackspace = new JButton("B");
		buttonBackspace.setBounds(96, 56, 40, 44);
		frame.getContentPane().add(buttonBackspace);
		
		JButton buttonOnOff = new JButton("On/Off");
		buttonOnOff.setBounds(9, 56, 80, 44);
		frame.getContentPane().add(buttonOnOff);
		
		JButton buttonSubtract = new JButton("-");
		buttonSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonSubtract.setBounds(145, 221, 40, 44);
		frame.getContentPane().add(buttonSubtract);
		
		JButton buttonModuloDiv = new JButton("%");
		buttonModuloDiv.setBounds(140, 331, 45, 41);
		frame.getContentPane().add(buttonModuloDiv);
		
		JButton buttonDecimalPoint = new JButton(".");
		buttonDecimalPoint.setBounds(53, 276, 39, 44);
		frame.getContentPane().add(buttonDecimalPoint);
		
		JButton buttonEquals = new JButton("=");
		buttonEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonEquals.setBounds(96, 276, 40, 44);
		frame.getContentPane().add(buttonEquals);
		
		JButton buttonClearAll = new JButton("C");
		buttonClearAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonClearAll.setBounds(145, 56, 40, 44);
		frame.getContentPane().add(buttonClearAll);
		
		JButton buttonMultiply = new JButton("x");
		buttonMultiply.setBounds(145, 166, 40, 44);
		frame.getContentPane().add(buttonMultiply);
		
		JButton buttonDivide = new JButton("/");
		buttonDivide.setBounds(145, 276, 40, 44);
		frame.getContentPane().add(buttonDivide);
		
		JButton buttonAdd = new JButton("+");
		buttonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonAdd.setBounds(145, 111, 40, 44);
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
