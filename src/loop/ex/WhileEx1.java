package loop.ex;

public class WhileEx1 {
    public static void main(String[] args) {
        //10개의 자연수를 출력하는 프로그램을 작성하시오. 이때 count라는 변수를 사용해야 하고, while,for문 2가지 버전으로 정답을 만드시오
        int count =1;

        while (count <= 10){
            System.out.println(count);
            count++; //count를 1씩 증가
        }

        for (count = 1; count <= 10; count++){
            System.out.println(count);
        }
    }
}
