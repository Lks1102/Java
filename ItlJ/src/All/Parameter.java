package All;

public class Parameter {
	//전달값이 있는 Method
	
    public static void power(int number) { // Parameter, 매개변수
        int result = number * number;
        System.out.println(number + " 의 제곱은 " + result);
    }

    public static void powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + " 의 " + exponent + " 제곱은 " + result);
    }

    public static void main(String[] args) {
    // 전달값, Parameter

        //Argument, 인수
        power(3);
        power(5);

        powerByExp(2,3);
        powerByExp(3,3);
        powerByExp(10,0);
    }
}
