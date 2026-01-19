package cond.ex;

public class EvenOddEx {
    public static void main(String[] args) {
        int x = 15;

        String result = (x % 2 == 0) ? "짝수" : "홀수" ;   //삼항연산자를 사용하여 조건입력

        System.out.println("x : " + x + ", " + result);
    }
}
