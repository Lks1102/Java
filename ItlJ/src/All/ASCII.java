package All;

public class ASCII {
    public static void main(String[] args) {
        // 아스키 코드 (ANSI) : 미국 표준 코드

        // A = 65 ~ 96
        // a = 97 ~ 128
        // 숫자(0) 48 ~


        System.out.println("-------------------------2");
        String[][] seats3 = new String[10][15];
        char ch = 'A';
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++;
        }
        for (int i = 0; i < seats3.length; i++) {  // 세로 기준
            for (int j = 0; j < seats3[i].length; j++) { //가로 기준
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
