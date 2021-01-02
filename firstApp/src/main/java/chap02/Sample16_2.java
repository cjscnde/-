package chap02;

import java.util.Random;

public class Sample16_2 {

	//메인 메서드 범위 안에 커서 두고 알트+시프트+제이 (페이지 102)
	//코드 템플릿 변수 105페이지 있음
	
    /**
     * 난수를 생성해서 출력하는 예제입니다.
     * @param args 배열
     * @since 1.0
     */
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(3) + 1;   // 1~3까지 출력
        System.out.printf("난수 : %d", num);
    }

}
