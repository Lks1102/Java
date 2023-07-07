package Sub_1;
/*
 * 날짜 : 2023/07/07
 * 이름 : 이규석
 * 내용 : Java Swing 실습
 * 
 * 	GUI 프로그래밍
 * 	- 사용자가 편리하게 프로그램을 사용할 수 있게 윈도우를 지원하는 프로그래밍
 * 	- Java는 GUI 개발을 위해 Swing 라이브러리 지원
 * 	- 편리한 GUI 개발을 위해 Windowbuiler 설치
 * 
 */
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class HelloSwingTest {
	public static void main(String[] args) {
		
		
		//윈도우 생성
		JFrame frame = new JFrame("Hello Swing!");
		frame.setPreferredSize(new Dimension(300, 200));
		frame.pack();
		frame.setVisible(true);
		
		//컨테이너 생성
		Container pane = frame.getContentPane();
		
		// 컴포넌트 배치
		JLabel label = new JLabel("Hello Swing!");
		pane.add(label);
		
		JButton button = new JButton("확인");
		pane.add(button);
		
		
		
		
		
	}
}