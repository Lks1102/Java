package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 *  A + B - 8
 *  11022번
 */
public class Main8 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int a, b, c;
		
		
		for (int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = a + b;
			
			bw.write("Case #" + i + ": " + a + " + " + b + " = " + c + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
		
		
	}
}
