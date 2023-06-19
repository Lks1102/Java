package sub02;
/*
 * 날짜 : 2023/06/19
 * 이름 : 이규석
 * 내용 : Java 캡슐화 실습
 */
public class EncapusuleTest {

	public static void main(String[] args) {
		
		//Car 객체 생성 초기화
		Car sonata = new Car("소나타", "흰색", 10);		
		sonata.setName("그랜져");
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		Car Avante = new Car("아반떼", "검은색", 10);
		Avante.setColor("남색");
		Avante.speedUp(60);
		Avante.speedDown(20);
		Avante.show();
		
		Account kb = new Account("국민은행", "101-12-5555", "이순신", 10000); 
			kb.deposit(40000);
			kb.withdraw(5000);
			kb.show();
	
	}
}
