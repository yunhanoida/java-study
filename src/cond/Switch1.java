package cond;

public class Switch1 {
    public void main(String[] args) {
        int grade = 2;

        int coupon;

        if (grade == 1){
            coupon = 1000;
        } else if (grade == 2){
            coupon = 2000;
        } else if (grade == 3) {
            coupon = 3000;
        } else {
            coupon = 500;
        }
        System.out.println("발급받은 쿠폰: "+coupon);

        //if문은 비교연산자를 사용할 수 있지만 switch문은 값이 같은지만 비교할 수 있다.
    }
}
