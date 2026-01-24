package loop.ex;

public class NestedEx2 {
    public static void main(String[] args) {
        //반쪽피라미드 출력 row변수를 선언하고 이 수만큼 피라미드를 출력한다.

        int row = 3; //행을 저장하는 변수

        for (int i=1; i<=row; i++){ //행의 수
            for (int j=1; j<=i; j++){ //한줄에 들어갈 *의 개수
                System.out.print("*");
            }
            System.out.println(); //줄바꿈해줌
        }
    }
}
