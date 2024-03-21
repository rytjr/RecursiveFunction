package Factorial2;

import java.util.*;
import java.io.*;

/*0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.*/

public class Factorial2 {
	
	// 처음 시도에서 int를 사용했었다. 그 결과 범위를 넘어섰다. 앞으로 주의할 필요가 있다.
	public static long fact(long Num) {
		if(Num == 0 || Num == 1) {
			return 1;
		}
		return fact(Num - 1) * Num;
		
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Num = sc.nextInt();
		
		System.out.print(fact(Num));
	}


}
