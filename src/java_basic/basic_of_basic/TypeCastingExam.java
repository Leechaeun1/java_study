package src.java_basic.basic_of_basic;

public class TypeCastingExam {
    // 기본형의 타입 변환
    // byte < short, char < int < long < float < double
    // 정수 < 실수
    public static void main(String[] args) {

        // 묵시적 형변환
        int x = 50000;
        long y = x;
        // 강제 형변환
        long x2 = 5;
//        int y2 = x2; -> 에러 발생
        int y2 = (int) x2;
    }
}
