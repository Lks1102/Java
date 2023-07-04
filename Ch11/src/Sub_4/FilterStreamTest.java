package Sub_4;
/*
 * 날짜 : 2023/07/04
 * 이름 : 이규석
 * 내용 : Java FilterStream 실습하기
 * 
 */

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterStreamTest {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3);
		System.out.println(numbers);

		// 중복제거
		numbers.stream().distinct().forEach(num -> System.out.print(num + ", "));
		
		
		// 5이상 데이터 필터링
		System.out.println();
		
		numbers
			.stream()
			.filter(num -> num >= 5)
			.forEach(num -> System.out.print(num + ", "));
		
		// 중복제거, 짝수데이터만 필터링
		
		System.out.println();
		
		numbers
			.stream()
			.distinct()
			.filter(num -> num % 2 == 0)
			.forEach(num -> System.out.print(num + ", "));
		
	}
	
}
