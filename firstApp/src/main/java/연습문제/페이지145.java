package 연습문제;

import java.util.Scanner;

public class 페이지145 {
/*
 * 100점 만점의 학점을 입력받아서 90점 이상이면  A, 80점 이상이면 B, 70 
 * 70점 이상 C, 60점 이상 D, 60점미만 F로 되게 만들것 (입력받는 점수는 0점에서 100점사이 값)
 * 
 */
	public static void main(String[] args) {
		System.out.println("0~100사이의 학점을 입력:");
		Scanner sc = new Scanner(System.in);
		
		int in = sc.nextInt();	//입력받은 값을 가져온다.
		String score = "";	//변환할 학점을 담을 변수 생성
		
		score = (in >=90) ? "A" :
					(in >=80) ? "B" :
						(in >=70) ? "C" :
							(in >=60) ? "D" : "F";
		System.out.printf("학점 (%d)은 %s입니다.", in, score);
	}
	
	
} 