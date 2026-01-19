package cond;

public class Switch4 {
    public static void main(String[] args) {
        int grade = 0;

        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default ->  500;
        };

        System.out.println("발급받은 쿠폰: "+coupon);

        //자바 14부터 도입된 새로운 switch문
        //각 case가 값을 반환하여 그 결과를 coupon 변수에 바로 대입한다.
    }
}
