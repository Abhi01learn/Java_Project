import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;


/* Code to create a simple calculator
 * @Author : Abhishek Pandey
 * Date : 17th October'2020
 * */
@SuppressWarnings("unused")
public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double firstNum;
	double secondNum;
	double result;
	String operations;
	String answer;
	private JButton btn7;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 307, 502);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 26));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 270, 74);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		btn7 = new JButton("7");
		btn7.setBorder(UIManager.getBorder("Button.border"));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String enterNumber7 = textField.getText() + btn7.getText();
				textField.setText(enterNumber7);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 170, 60, 60);
		frame.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String enterNumber8 = textField.getText() + btn8.getText();
				textField.setText(enterNumber8);

			}
		});
		btn8.setBounds(80, 170, 60, 60);
		frame.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String enterNumber9 = textField.getText() + btn9.getText();
				textField.setText(enterNumber9);

			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(150, 170, 60, 60);
		frame.getContentPane().add(btn9);

		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber4 = textField.getText() + btn4.getText();
				textField.setText(enterNumber4);				
			}
		});
		btn4.setBounds(10, 241, 60, 60);
		frame.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber5 = textField.getText() + btn5.getText();
				textField.setText(enterNumber5);	
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(80, 241, 60, 60);
		frame.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber6 = textField.getText() + btn6.getText();
				textField.setText(enterNumber6);
				
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(150, 241, 60, 60);
		frame.getContentPane().add(btn6);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber1 = textField.getText() + btn1.getText();
				textField.setText(enterNumber1);
				
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 312, 60, 60);
		frame.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber2 = textField.getText() + btn2.getText();
				textField.setText(enterNumber2);
				
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(80, 312, 60, 60);
		frame.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber3 = textField.getText() + btn3.getText();
				textField.setText(enterNumber3);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(150, 312, 60, 60);
		frame.getContentPane().add(btn3);

		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
				
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(220, 96, 60, 60);
		frame.getContentPane().add(btnPlus);

		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSub.setBounds(220, 170, 60, 60);
		frame.getContentPane().add(btnSub);

		JButton btnMultiply = new JButton("X");
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "X";
			}
		});
		btnMultiply.setBounds(220, 241, 60, 60);
		frame.getContentPane().add(btnMultiply);

		JButton btnDivide = new JButton("÷");
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "÷";
			}
		});
		btnDivide.setBounds(220, 312, 60, 60);
		frame.getContentPane().add(btnDivide);

		JButton btnPM = new JButton("\u00B1");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops *(-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPM.setBounds(150, 383, 60, 60);
		frame.getContentPane().add(btnPM);

		JButton btnBackSpace = new JButton("\u2190");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backSpace = null;
				
				if(textField.getText().length()>0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1);
					backSpace = strB.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackSpace.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBackSpace.setBounds(10, 96, 60, 60);
		frame.getContentPane().add(btnBackSpace);

		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnC.setBounds(80, 96, 60, 60);
		frame.getContentPane().add(btnC);

		JButton btnNewButton_16 = new JButton("%");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
				
			}
		});
		btnNewButton_16.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_16.setBounds(150, 96, 60, 60);
		frame.getContentPane().add(btnNewButton_16);

		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondNum = Double.parseDouble(textField.getText());
				if (operations == "+") {
					result = firstNum + secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);					
				}
				else if (operations == "-") {
					result = firstNum - secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);					
				}
				else if (operations == "X") {
					result = firstNum * secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);					
				}
				else if (operations == "÷") {
					result = firstNum / secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);					
				}
				else if (operations == "%") {
					result = firstNum % secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);					
				}
				
				
			}
		});
		btnEquals.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEquals.setBounds(220, 383, 60, 60);
		frame.getContentPane().add(btnEquals);

		JButton btnDeci = new JButton(".");
		btnDeci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String enterNumberDeci = textField.getText() + btnDeci.getText();
				textField.setText(enterNumberDeci);
			}
		});
		btnDeci.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDeci.setBounds(80, 383, 60, 60);
		frame.getContentPane().add(btnDeci);

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String enterNumber0 = textField.getText() + btn0.getText();
				textField.setText(enterNumber0);
				
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(10, 383, 60, 60);
		frame.getContentPane().add(btn0);
	}
}
