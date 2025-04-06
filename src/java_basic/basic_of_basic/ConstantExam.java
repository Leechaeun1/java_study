package src.java_basic.basic_of_basic;

public class ConstantExam {
    public static void main(String[] args) {
        int i;
        i= 10;
        i = 5;
//		상수 선언 시 final 앞에 붙임
//		상수는 대문자의 명명 규칙을 따른다
        final int J;
        J = 10;
//		J= 5; -> 불가 !

        double circleArea;
        final double PI = 3.14159;
        circleArea = 3 * 3* PI;

//		상수는 언더바로 문자 구분
        final int OIL_PRICE = 1390;
        int totalPrice = 50 * OIL_PRICE;


    }

}
