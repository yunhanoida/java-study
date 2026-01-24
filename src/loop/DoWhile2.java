package loop;

public class DoWhile2 {
    public static void main(String[] args) {
        int i = 10;

        do {
            System.out.println("현재 숫자는: "+i);
        }while(i<3); //false
    //do~while문은 일단 실핼을 하고 조건을 만나
        // 참이면 반복, 거짓이면 do~while문을 빠져나온다.
    }
}
