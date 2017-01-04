package boj_8958;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		for (int i = 0; i < num; i++) {
			String src = br.readLine();
			char[] chars = src.toCharArray();

			int a = 0;
			int score = 0;

			for (int j = 0; j < chars.length; j++) {
				if (chars[j] == 'O') {
					a++;
					score = score + a;
				} else {
					a = 0;
				}
			}
			System.out.println(score);
		}
	}
}
