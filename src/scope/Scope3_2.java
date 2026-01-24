package scope;

public class Scope3_2 {
    public static void main(String[] args) {
        int m = 10;
        if (m > 0){
            int temp = m*2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = "+m);

        //scope(범위)를 사용하는 이유 : 불필요한 메모리 사용을 줄일 수 있고, 코드 복잡성을 줄일 수 있기 때문이다.
    }
}
