package cond;

public class If6 {
    static void main(String[] args) {

        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) { //true
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        } else if (age <= 10) {
            discount = discount + 1000;
        } else {
            System.out.println("할인 없음");
        }
        //첫번째로 만족하는 조건인 1000원만 할인이 적용되고, if문을 빠져나온다.
        System.out.println("총 할인 금액: "+ discount +"원");

        if (true) System.out.println("if문에서 실행됨");
        /* 실행문이 한 줄이라면 {}블록 생략 가능 / 권장하지 않는다.
        => 가독성, 유지보수성의 이유로 중괄호를 쓰는 것을 권장한다. */
    }
}
