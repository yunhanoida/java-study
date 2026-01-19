package cond;

public class CondOp1 {
    public static void main(String[] args) {
        int age = 18;
        String status;
        if (age >= 18){
            status = "성인";
        } else {
            status = "미성년자";
        }

        System.out.println("age = "+age+" status = "+status);

        //단순히 참과 거짓에 따라 값을 구하는 경우
        //삼항연산자(조건연산자) ?:연산자를 사용할 수 있다.
    }
}
