/**@author 박선종
 * 백준 2557번
 * 
 */

package boj_2577;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		
		//입력받을 A,B,C 값을 버퍼로 받음
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine().trim());
		int B = Integer.parseInt(br.readLine().trim());
		int C = Integer.parseInt(br.readLine().trim());
		
		//ABC의 곱을 저장
		int ABC = A * B * C;
		
		//int형을 string으로 저장
		String str = Integer.toString(ABC);
		
		//string배열로 저장
		char[] ch = str.toCharArray();
		
		int[] num = new int[10];
		
		while (ABC > 0) {
			int result = ABC % 10;
			num[result]++;
			ABC = ABC / 10;

		}

		for(int i = 0; i < num.length; i++){             
		System.out.println(num[i]);
		}
	}

}
