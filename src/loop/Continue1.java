package loop;

public class Continue1 {
    public static void main(String[] args) {
        int i =1;

        while(i <= 5){
            if (i == 3){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }

        //while문 실행 중 continue를 만나면 다음 실행문은 건너뛰고
        //while문의 조건문으로 돌아가 다음 반복문을 실행한다.
    }
}
