package src.java_basic.basic_of_basic;

public class ArrayExam {
    public static void main(String[] args) {
        int[] array1 = new int[100];  //몇개를 담을건지 지정

        array1[0] = 50;
        array1[10] = 100;

        // 4개의 int형 1차원 배열 생성
        int[] array2 = new int[]{1, 2, 3, 4};
        // 더 간단히 표현할 수 있다
        int[] array3 = {1, 2, 3, 4};

        //꺼내서 사용
        System.out.println(array3[3]);
        int value = array3[0];

        System.out.println(value);

        // 반복문
        int[] iarray = new int[100];
        int sum = 0;
//        iarray[0] =1;
//        iarray[1] =2;
        for(int i=0; i<iarray.length; i++){
            iarray[i] = i+1;
            sum += iarray[i];
        }
        System.out.println(sum);






    }
}

