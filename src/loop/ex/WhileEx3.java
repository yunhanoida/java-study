package loop.ex;

public class WhileEx3 {
    public static void main(String[] args) {
        int sum = 0; //합계를 구하는 변수
        int i = 1;
        int max=100; //최대값 변수

        while(i <= max){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
