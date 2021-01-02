package 연습문제;

public class 페이지146 {

	// 다음 소스코드만 보고 값을 예측해서 실행된 값과 비교
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int r1 = ++a + ++b;
		int r2 = a++ + b++;
		int r3 = b++ - --a;
		int r4 = --a + a--;
		int r5 = b+=++a;
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
		
		//a나 b값이 계속 변동한다는것을 기억해야됨
		
	}
}
