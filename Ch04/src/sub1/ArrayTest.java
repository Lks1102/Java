package sub1;
/*
 * 날짜 : 2023/06/14
 * 이름 : 이규석
 * 내용 : Java Array 실습
 */
public class ArrayTest {
	
	public static void main(String[] args) {
		
		// 배열
		
		int[] arr1 = {1,2,3,4,5,};
		String[] str1 = {"한개","두개","세개","네개","다섯개"};
		double[] arr2 = {1,2,3,4,5,};		
		char[] arr3 = {'A','b','C','D','E'};
		
	
	//	int y = 1;
		
		int a = 1;
		int w = 1;
		int e = 1;
		
		while (a <= 10) {
			
			if(a % 2 != 0) {
				
				w = a;				
				
				System.out.print(w + ",");
			}else if(a % 2 == 0){
				
				e = a;				
				
				System.out.print(e + ",");
			}
			
				a++;
				
		}
		System.out.println();
		
//		int[] k = {1,2,3,4,5,6,7,8,9,10};
//		
//		for(k = 0; k <= 10; k++) {
//			if(a % 2 == 0) {
//				System.out.print(k + " ");
//			}else {
//				System.out.print(k + " ");
//			}
//		}
//		System.out.println();
		
		
		
		// 원소 출력
		
		System.out.println("arr1[0]");
		
		// 배열 길이
		System.out.println(arr1.length);
		
		// 배열 반복문
		for(int i = 0; i < arr1.length; i++) {
			
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println();
		
		for(char c : arr3) {
			System.out.print(c + " ");
		}
		
		System.out.println();
		
		// 1차원 배열
		
		int[] scores = {80,70,60,50};
		int total = 0;
		
		for(int score : scores) {
			total += score;
		}
		System.out.println(total);
		// 2차원 배열
		
		int[][] arr2d = {{1,2,3},
						 {4,5,6,},
						 {7,8,9,}};
		
//		for(int a = 0; a < 3; a++) {
//			for(int b = 0; b < 3; b++) {
//				System.out.println("arr2d["+a+"]["+b+"] : " + arr2d[a][b] );
//			}
//		

		System.out.println("---------------");
		// 3차원 배열

		int[][][] arr3d = {{{1,	2,	3},
							{4,	5,	6},
							{7,	8,	9}},
							{{10, 11, 12},
							{13, 14, 15},
							{16, 17, 18}},
							{{19, 20, 21},
							{22, 23, 24},
							{25, 26, 27}}};
		
//		for(int a = 0; a < 3; a++) {
//			for(int b = 0; b < 3; b++) {
//				for(int c = 0; c < 3; c++) {
//					System.out.printf("arr3d[%d][%d][%d] : %d\n", a,b,c,arr3d[a][b][c]);
//				}
//			}
//		}
	}
}