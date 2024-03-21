package Pibonachi;

import java.util.*;

/*피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.

이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.

n=17일때 까지 피보나치 수를 써보면 다음과 같다.

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597

n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.*/

public class Pibonachi {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Num = sc.nextInt();
		
		System.out.print(pibo(Num));
	}
	
	public static int pibo(int Num) {
		
		if(Num == 1 || Num == 2) {
			return 1;
		}
		if(Num == 0) {
			return 0;
		}
		
		return pibo(Num - 1) + pibo(Num - 2);
	}

}
