package src.java_basic.basic_of_basic;

public class ArrayExam2 {
    public static void main(String[] args) {
        // 2차원 배열 생성
//        0000
//        0000
//        0000
        int [][] array4 = new int[3][4];
//      array4[0] = 10; -> 오류
        array4[0][1] = 10;

        int[][] array5 = new int[3][];
        array5[0] = new int[1];
        array5[0][0]=5;

//        선언과 동시에 초기화 : 초기화시 {}사용
        int[][]array6 = {{1}, {1, 2}, {1, 2, 3}};
        System.out.println(array6[2][2]);
    }
}
