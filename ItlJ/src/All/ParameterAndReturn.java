package All;

public class _04_ParameterAndReturn {
    public static int getPower(int number) {
        int result = number * number;
        return result;
        // = return number * number;
    }
    public static int getPowerbyExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        //전달값과 반환값이 있는 메소드
        int retVal = getPower(2);
        System.out.println(retVal); // 2 * 2

        retVal = getPower(3);
        System.out.println(retVal); // 3 * 3

        retVal = getPowerbyExp(3,3);
        System.out.println(retVal); // 3 * 3 * 3

        System.out.println(getPowerbyExp(2,4)); // 2 * 2 * 2 * 2

    }
}
