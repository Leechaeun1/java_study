package src.java_basic.basic_of_basic;

public class BasicType {
//    기본형 -> 정수, 실수, 문자형, boolean
//    문자형 - char(2byte)
//    정수형 - byte(1byte), short(2byte), char(2byte),
//            int(4byte), long(8byte)
//    실수형 - float(4byte), double(8byte)

//    리터럴 -> 정수, 실수, 문자, 논리 리터럴
    public static void main(String[] args) {
        boolean isFun = true;
        System.out.println(isFun);

        char c = 'f'; // 문자 하나 표현 가능

        int x = 59; // 값 자체를 리터럴이라 함
        long bing = 345434534534l; //long은 뒤에 l or L을 넣어야 함
        float f = 32.4f; // 뒤에 f를 붙여야 함
        double d = 345434543454.5;
        System.out.println(bing);
    }
}
