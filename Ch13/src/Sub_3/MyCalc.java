package Sub_3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyCalc {

	private JFrame frmCalc;
	private JTextField txtDsp;
	
	private int num1 = 0;
	private int num2 = 0;
	private int operator = 0; // 1:plus, 2:minus, 3:multi, 4:div

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCalc window = new MyCalc();
					window.frmCalc.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyCalc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalc = new JFrame();
		frmCalc.setTitle("MyCalc v1.0");
		frmCalc.setBounds(100, 100, 477, 571);
		frmCalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalc.getContentPane().setLayout(null);
		
		txtDsp = new JTextField();
		txtDsp.setFont(new Font("굴림", Font.BOLD, 30));
		txtDsp.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDsp.setText("0");
		txtDsp.setBounds(12, 10, 439, 65);
		frmCalc.getContentPane().add(txtDsp);
		txtDsp.setColumns(10);
		

		
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn7.setFont(new Font("굴림", Font.BOLD, 30));
		btn7.setBounds(12, 85, 100, 100);
		frmCalc.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn8.setFont(new Font("굴림", Font.BOLD, 30));
		btn8.setBounds(127, 85, 100, 100);
		frmCalc.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn9.setFont(new Font("굴림", Font.BOLD, 30));
		btn9.setBounds(239, 85, 100, 100);
		frmCalc.getContentPane().add(btn9);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDiv.setFont(new Font("굴림", Font.BOLD, 30));
		btnDiv.setBounds(351, 85, 100, 100);
		frmCalc.getContentPane().add(btnDiv);
		
		JButton btnMult = new JButton("X");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMult.setFont(new Font("굴림", Font.BOLD, 30));
		btnMult.setBounds(351, 195, 100, 100);
		frmCalc.getContentPane().add(btnMult);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn4.setFont(new Font("굴림", Font.BOLD, 30));
		btn4.setBounds(12, 195, 100, 100);
		frmCalc.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn5.setFont(new Font("굴림", Font.BOLD, 30));
		btn5.setBounds(127, 195, 100, 100);
		frmCalc.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn6.setFont(new Font("굴림", Font.BOLD, 30));
		btn6.setBounds(239, 195, 100, 100);
		frmCalc.getContentPane().add(btn6);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMinus.setFont(new Font("굴림", Font.BOLD, 30));
		btnMinus.setBounds(351, 305, 100, 100);
		frmCalc.getContentPane().add(btnMinus);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtDsp.setText("1");
				num1 = 1;
				
			}
		});
		btn1.setFont(new Font("굴림", Font.BOLD, 30));
		btn1.setBounds(12, 305, 100, 100);
		frmCalc.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num2 = 2;
				
			}
		});
		btn2.setFont(new Font("굴림", Font.BOLD, 30));
		btn2.setBounds(127, 305, 100, 100);
		frmCalc.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn3.setFont(new Font("굴림", Font.BOLD, 30));
		btn3.setBounds(239, 305, 100, 100);
		frmCalc.getContentPane().add(btn3);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				operator = 1;
				
				
			}
		});
		btnPlus.setFont(new Font("굴림", Font.BOLD, 30));
		btnPlus.setBounds(351, 415, 100, 100);
		frmCalc.getContentPane().add(btnPlus);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn0.setFont(new Font("굴림", Font.BOLD, 30));
		btn0.setBounds(12, 415, 100, 100);
		frmCalc.getContentPane().add(btn0);
		
		JButton btnCancel = new JButton("C");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancel.setFont(new Font("굴림", Font.BOLD, 30));
		btnCancel.setBounds(127, 415, 100, 100);
		frmCalc.getContentPane().add(btnCancel);
		
		JButton btnEq = new JButton("=");
		btnEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int result = 0;
						
				if(operator == 1) {		
						
						result = num1 + num2;
				}else if(operator == 2) {
					result = num1 - num2;
				}else if(operator == 3) {
					result = num1 * num2;
				}else if(operator == 4) {
					result = num1 / num2;
				}
				
				txtDsp.setText(""+result);
				
			}
		});
		btnEq.setFont(new Font("굴림", Font.BOLD, 30));
		btnEq.setBounds(239, 415, 100, 100);
		frmCalc.getContentPane().add(btnEq);
	}
}
