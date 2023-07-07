package Sub_2;
/*
 * 날짜 : 2023/07/07
 * 이름 : 이규석
 * 내용 : Java Swing 실습
 * 
 * 
 */
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JPanel;

public class ComponentsTest {

	private JFrame frame;
	private JTextField txtUid;
	private JTextField txt_Name;
	private JTextField txt_Hp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentsTest window = new ComponentsTest();
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
	public ComponentsTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Component Test");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel.setBounds(12, 10, 159, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btn1 = new JButton("확인");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 클릭...");
			}
		});
		btn1.setBounds(12, 76, 159, 95);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("확인1");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼1 클릭...");
			}
		});
		btn2.setBounds(183, 76, 159, 95);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("확인2");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int answer = JOptionPane.showConfirmDialog(null, "버튼2 클릭...", "확인대화상자", JOptionPane.YES_NO_CANCEL_OPTION);
			
			if (answer == 0) {
				System.out.println("YES 클릭...");
			} else {
				System.out.println("NO 클릭...");
			}
			
			
			}
		});
		btn3.setBounds(354, 76, 159, 95);
		frame.getContentPane().add(btn3);
		
		JLabel lblNewLabel_1 = new JLabel("Button 실습");
		lblNewLabel_1.setBounds(12, 35, 159, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("TextField 실습");
		lblNewLabel_2.setBounds(12, 181, 159, 31);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("아이디");
		lblNewLabel_2_1.setBounds(12, 247, 159, 31);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("이름");
		lblNewLabel_2_2.setBounds(12, 288, 159, 31);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		JLabel Hp = new JLabel("휴대폰");
		Hp.setBounds(12, 329, 159, 31);
		frame.getContentPane().add(Hp);
		
		txtUid = new JTextField();
		txtUid.setBounds(129, 252, 106, 21);
		frame.getContentPane().add(txtUid);
		txtUid.setColumns(10);
		
		txt_Name = new JTextField();
		txt_Name.setColumns(10);
		txt_Name.setBounds(129, 293, 106, 21);
		frame.getContentPane().add(txt_Name);
		
		txt_Hp = new JTextField();
		txt_Hp.setColumns(10);
		txt_Hp.setBounds(129, 334, 106, 21);
		frame.getContentPane().add(txt_Hp);
		
		JLabel lbUid = new JLabel("결과 : ");
		lbUid.setBounds(437, 255, 159, 15);
		frame.getContentPane().add(lbUid);
		
		JLabel lbName = new JLabel("결과 : ");
		lbName.setBounds(437, 296, 159, 15);
		frame.getContentPane().add(lbName);
		
		JLabel lbHp = new JLabel("결과 : ");
		lbHp.setBounds(437, 337, 159, 15);
		frame.getContentPane().add(lbHp);
		
		JButton btn_Name = new JButton("확인");
		btn_Name.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = txt_Name.getText();
				lbName.setText("결과 : " + name);
				
			}
		});
		btn_Name.setBounds(255, 292, 159, 21);
		frame.getContentPane().add(btn_Name);
		
		JButton btn_Hp = new JButton("확인");
		btn_Hp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String hp = txt_Hp.getText();
				lbHp.setText("결과 : " + hp);
				
			}
		});
		btn_Hp.setBounds(255, 333, 159, 21);
		frame.getContentPane().add(btn_Hp);
		

		
		JButton btnUid = new JButton("확인");
		btnUid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uid = txtUid.getText();
				lbUid.setText("결과 : " + uid);
				
			}
		});
		btnUid.setBounds(255, 251, 159, 21);
		frame.getContentPane().add(btnUid);
		
		JCheckBox chk1 = new JCheckBox("사과");
		chk1.setBounds(12, 426, 71, 23);
		frame.getContentPane().add(chk1);
		
		JLabel lblNewLabel_3 = new JLabel("Checkbox 실습");
		lblNewLabel_3.setBounds(12, 381, 111, 21);
		frame.getContentPane().add(lblNewLabel_3);
		
		JCheckBox chk2 = new JCheckBox("딸기");
		chk2.setBounds(129, 426, 71, 23);
		frame.getContentPane().add(chk2);
		
		JCheckBox chk3 = new JCheckBox("포도");
		chk3.setBounds(244, 426, 71, 23);
		frame.getContentPane().add(chk3);
		
		JCheckBox chk4 = new JCheckBox("수박");
		chk4.setBounds(354, 426, 71, 23);
		frame.getContentPane().add(chk4);
		
		JCheckBox chk5 = new JCheckBox("참외");
		chk5.setBounds(469, 426, 71, 23);
		frame.getContentPane().add(chk5);
		
		JLabel lbChkrFruit = new JLabel("선택한 과일 :");
		lbChkrFruit.setBounds(12, 455, 635, 31);
		frame.getContentPane().add(lbChkrFruit);
		
		JButton btnChkFruit = new JButton("확인");
		btnChkFruit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> fruits = new ArrayList<>();
				
				if(chk1.isSelected()) {
					
					fruits.add(chk1.getText());
					
				}
				if(chk2.isSelected()) {
					
					fruits.add(chk2.getText());
					
				}
				if(chk3.isSelected()) {
					
					fruits.add(chk3.getText());
					
				}
				if(chk4.isSelected()) {
					
					fruits.add(chk4.getText());
					
				}
				if(chk5.isSelected()) {
					
					fruits.add(chk5.getText());
					
				}
				
				lbChkrFruit.setText("선택한 과일 : " + fruits);
				
			}
		});
		btnChkFruit.setBounds(548, 426, 95, 23);
		frame.getContentPane().add(btnChkFruit);
		
		JLabel lblNewLabel_4 = new JLabel("RadioButton 실습");
		lblNewLabel_4.setBounds(12, 496, 111, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		JRadioButton rdMale = new JRadioButton("남자");
		rdMale.setBounds(12, 527, 71, 31);
		frame.getContentPane().add(rdMale);
		
		JRadioButton rdFemale = new JRadioButton("여자");
		rdFemale.setBounds(77, 527, 71, 31);
		frame.getContentPane().add(rdFemale);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdMale);
		bg.add(rdFemale);
		
		JLabel lbGender = new JLabel("선택결과 : ");
		lbGender.setBounds(12, 564, 266, 31);
		frame.getContentPane().add(lbGender);
		
		JButton btnGender = new JButton("확인");
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (rdMale.isSelected()) {
					lbGender.setText("선택결과 : " + rdMale.getText());
				} else {
					lbGender.setText("선택결과 : " + rdFemale.getText());
				}
				
				
			}
		});
		btnGender.setBounds(183, 531, 95, 23);
		frame.getContentPane().add(btnGender);
		
	}
}
