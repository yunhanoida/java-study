package cond;

public class If1 {

    static void main(String[] args) {
        int age = 20; //사용자 나이

        if(age >= 18){ //true
            System.out.println("성인입니다."); //조건이 참일 때 실행한다.
        }

        if(age < 18){ //false
            System.out.println("미성년자입니다."); //조건이 참일 때 실행하기 때문에 실행하지 않는다.
        }
    }
}
