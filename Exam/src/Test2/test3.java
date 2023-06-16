package Test2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
 * 날짜 : 2023/06/15
 * 이름 : 이규석
 * 내용 : 자바 배열 역순으로 정렬 열습문재
 */
public class test3 {
	public static void main(String[] args) {
		
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		//현재 출력 배열
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		
		System.out.println();
		
		//배열의 원소를 역순으로 정렬
		for (int j = 0; j < 5; j++) {
			int temp = arr[j];
			arr[j] = arr[9-j];
			arr[9 - j] = temp;
		}
	
		// 역순으로 정렬된 배열 출력
		for (int n : arr) {
			System.out.print(n + ", ");
		}
	}
}