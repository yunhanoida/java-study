package casting;

public class Casting4 {
    public static void main(String[] args) {
        int div1 = 3/2; // int / int = int
        System.out.println("div1 = "+div1);

        double div2 = 3/2; // int / int = int이므로 double타입에 대입을 할 때 자동 형변환이 발생한다.
        System.out.println("div2 = "+div2);

        double div3 = 3.0/2; // double / int = double
        System.out.println("div3 = "+div3);

        double div4 = (double) 3 /2; // double / double = double  : 명시적 형변환
        System.out.println("div4 = "+div4);

        int a = 3;
        int b = 2;
        double result = (double) a/b; // double / double = double
        System.out.println("result = "+result);

        //같은 타입끼리의 계산은 같은 타입의 결과를 나타낸다.
        //서로 다른 타입의 계산은 큰 범위로 자동 형변환이 일어난다.
    }
}
