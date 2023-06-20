package All;

public class VariableScope {
    // 지역변수 ( 변수가 선언된 영역내에서만 사용가능)
    public static void methodA() {
        System.out.println();
    }

    public static void methodB() {
        int result = 1;
    }

    public static void main(String[] args) {
    int number = 3;

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
