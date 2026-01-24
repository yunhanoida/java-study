package loop.ex;

public class NestedEx1 {
    public static void main(String[] args) {
        //중첩 for문을 사용해서 구구단을 완성해라
        int result = 0; //구구단 결과값 저장할 변수 result를 선언후 0으로 초기화

        for (int i =1; i<=9; i++){//1단~9단까지 반복
            for (int j=1; j<=9; j++){ //곱해질 숫자 9까지 반복
                result = i*j; //구구단 곱셈 결과값 저장
                System.out.println(i+" * "+j+" = "+result);
            }
            System.out.println();
        }
    }
}
