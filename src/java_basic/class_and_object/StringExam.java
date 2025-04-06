package src.java_basic.class_and_object;

public class StringExam {
    public static void main(String[] args) {
        // string 클래스는 new연산자를 이용하지 않고
        // 인스턴스 생성 가능
        // "hello"는 상수 영역에 생성됨
        // str1, str2 -> 같은 인스턴스 참조
        String str1 = "hello";
        String str2 = "hello";

        // new 연산자로 인스턴스 생성하면
        // hip영역에 인스턴스 생성
        // str3, str4는 서로 다른 인스턴스 참조
        String str3 = new String("hello");
        String str4 = new String("hello");

        // 확인하기
        if (str1==str2)
            System.out.println("str1과 str2는 같은 레퍼런스입니다");
        if(str1 ==str3)
            System.out.println("str1과 str3은 같은 레퍼런스입니다");
        if(str3 ==str4)
            System.out.println("str3과 str4은 같은 레퍼런스입니다");

        System.out.println(str1);
        System.out.println(str1.substring(3));
        // 내부의 값이 변하지 않음
        System.out.println(str1);
    }
}
