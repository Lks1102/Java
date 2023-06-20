package All;

public class WhenToUse {
    public static int getPower(int number) {
        return getPower(number, 2);
    }
public static int getPower(int number, int exponent) {
    int result = 1;
    for (int i = 0; i < exponent; i++) {
        result *= number;
    }
    return result;
}
    public static void main(String[] args) {
        // 메소드가 필요한 이유
        //2 의 2 제곱

        System.out.println(getPower(2,2));

        //3 의 3제곱
        System.out.println(getPower(3,3));
        }
    }