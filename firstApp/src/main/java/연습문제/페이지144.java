package 연습문제;

import java.util.Scanner;

public class 페이지144 {
/*
 * 두 개의 값을 입력 받아서 큰 수를 출력 (같으면 0출력)
 * 예1
 * 답 입력> 30 20
 * 출력 > 30
 * 
 * 예2 
 * 답 입력> 4 4
 * 출력 > 0
 */
 
	public static void main(String[] args) {
		System.out.println("두개의 수를 띄어쓰기 하여 입력:");
		Scanner sc = new Scanner(System.in);
		
		int in1 = sc.nextInt();
		int in2 = sc.nextInt();
		// (조건식) ? 처리식1(참일때 처리) : 처리식2(거짓일때 처리)
		// 삼항연산자는 거짓일때 처리식을 생략해도 되는듯 보임 아래는 처리식 2개 쓴듯
		int result = (in1 > in2) ? in1 : (in1 == in2) ? 0: in2;
		System.out.printf("입력한 값 중 큰 수는 %d 입니다.", result);
	}
}
