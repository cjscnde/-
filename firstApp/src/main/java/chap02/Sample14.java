package chap02;

public class Sample14 {

	/* 89페이지
	 * final은 3가지 경우에 사용됨
	 * 변수 = 초기화 된 이후에는 값 변경 못함
	 * 메서드 = 하위 클래스에서 오버라이드 못함
	 * 클래스 = 계층구조의 마지막 클래스로 하위클래스를 만들수 없음
	 * 
	 * 상수 만드는법
	 * final [자료형] [변수명] = [리터럴];
	 * 
	 */
    public static void main(String[] args) {
        final float PI;  //초기값을 정하지 않고 PI를 상수로 선언
        PI = 3.14f;      //최초 값을 선언한다. 이후 PI값을 변경하면 오류가 발생한다.
        //PI = 3.141592f;  //The final local variable PI may already have been assigned
        int radius = 10;

        float area = radius * radius * PI;

        System.out.printf("원의 넓이 : %f", area);
    }

}
