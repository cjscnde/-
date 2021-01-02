package 연습문제;

import java.util.Scanner;

public class 페이지147 {
	//정수 값 입력받아서 양의정수면 그냥 출력 음의정수면 양으로 변환해서출력
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값을 입력하세요: ");
		int in = sc.nextInt(); //입력 받은 값을 가져온다.
		
		System.out.printf("출력값: %d%n%n", (in > 0)? in : in * -1);
		
		System.out.print("두번째 정수값을 입력하세요:");
		in =sc.nextInt(); //입력받은 값을 가져온다.
		
		System.out.printf("출력값 : %d%n", (in < 0)? in : in * -1);
	}
}
