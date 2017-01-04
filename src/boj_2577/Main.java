/**@author �ڼ���
 * ���� 2557��
 * 
 */

package boj_2577;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		
		//�Է¹��� A,B,C ���� ���۷� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine().trim());
		int B = Integer.parseInt(br.readLine().trim());
		int C = Integer.parseInt(br.readLine().trim());
		
		//ABC�� ���� ����
		int ABC = A * B * C;
		
		//int���� string���� ����
		String str = Integer.toString(ABC);
		
		//string�迭�� ����
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
