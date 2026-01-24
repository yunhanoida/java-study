package loop.ex;

public class ForEx2 {
    public static void main(String[] args) {

        for (int num = 2; num <= 20; num+=2) {
            System.out.println(num);
        }

        //선생님 코드
        for (int num=2, count=1; count <= 10; num+=2, count++){
            System.out.println(num);
        }

        int num =2;
        for (int count=1; count<=10; count++){
            System.out.println(num);
            num += 2;
        }
    }
}
