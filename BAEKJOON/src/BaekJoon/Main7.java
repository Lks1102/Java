package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * A + B - 7
 * 11021번
 */


public class Main7 {
	public static void main(String[] args) throws IOException{
		
		// 버퍼 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int a, b;
		
		for (int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			bw.write("Case #" + i + ": " + (a + b) + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
		
		
	}
	
	// 스캐너 사용
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int T = sc.nextInt();
//		
//		
//		for (int i = 1; i <= T; i++) {
//			
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			
//			System.out.println("Case #" + i + ": " + (a + b));
//			
//		}
//		
//		sc.close();
//		
//	}
	
	
}
