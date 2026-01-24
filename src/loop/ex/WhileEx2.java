package loop.ex;

public class WhileEx2 {
    public static void main(String[] args) {
        //반복문을 사용하여 처음 10개의 짝수를 출력하는 프로그램을 작성해보시오. 이때 num이라는 변수를 사용하여 수를 표현하고
        //while, for문 2가지 버전을 정답으로 만들어야 합니다.
        int num =2;

        while (num <= 20){
            System.out.println(num);
            num = num+2;
        }

        //선생님 코드
        int count = 1;
        while (count <= 10){
            System.out.println(num);
            num += 2;
            count++;
        }
    }
}
