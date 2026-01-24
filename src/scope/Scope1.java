package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10; //m 변수 생존

        if (true){
            int x = 20; //x변수 생존
            System.out.println("if m = "+m);
            System.out.println("if x = "+x);
        }//x 생존 종료
        //System.out.println("main x = "+x); x변수는 if조건문 블록 안에서 선언되었기 때문에 조건문 블록 밖에서는 사용할 수 없다.
        System.out.println("main m = "+m);
    }//m 생존 종료
}
