package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647L; //int의 최고값
        long maxIntOver = 2147483648L; //int의 최고값 + 1
        int intValue = 0;

        intValue = (int) maxIntValue; //형변환
        System.out.println("maxIntValue  casting = "+intValue);

        intValue = (int) maxIntOver; //형변환
        System.out.println("maxIntOver casting = "+intValue); //int의 최소값 -2147483648이 출력됨 : 오버플로우
    }
}
