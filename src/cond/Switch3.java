package cond;

public class Switch3 {
    public static void main(String[] args) {
        int grade = 3;

        int coupon;

        switch (grade) {
            case 1 : coupon = 1000; break;
            case 2 :
            case 3 : coupon = 3000; break;
            default: coupon = 500;
        }
        System.out.println("발급받은 쿠폰: "+coupon);

        //break문이 없으면 다음 case로 이동하고,
        // break를 만났을 때 switch문을 빠져나온다.
    }
}
