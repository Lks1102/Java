package All;
/*
 * Method
 */

public class Method {

    //메소드 정의
    public static void sayHello() {
        System.out.println("안녕하세요? 메소드입니다.");
    }

    public static void main(String[] args) {
        // Method ? = 기능을 하는 코드들의 묶음, 메소드는 횟수 제한 없음
        // Method 호출

        System.out.println("메소드 호출 전");
        sayHello();
        System.out.println("메소드 호출 후");
    }
    
}
