package Test3;
/*
 * 날짜 : 2023/06/23
 * 이름 : 이규석
 * 내용 : Java 상속 연습문제
 */
class Rent {
	public void payment() {
		System.out.println("임대료를 받습니다.");
	}
}

class Landload extends Rent{
	
	public void getmoney() {
		System.out.println("건물주 입니다.");
		payment();
	}
}
public class Test6 {
	public static void main(String[] args) {
		Landload master = new Landload();
		master.getmoney();
	}
}
