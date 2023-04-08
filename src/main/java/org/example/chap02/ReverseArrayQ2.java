package org.example.chap02;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayQ2 {

    // 배열을 역순으로  정렬하기위해 필요한것.
    /*
    * 1. 요솟수 설정
    * 2. 요솟수크기만한 배열 생성
    * 3. 생성한 배열에 값 삽입
    * 4. 배열을 역순으로 만들어주는 메서드 생성
    * 5. print
    *
    * 역순 배열 로직
    * swap() 함수 생성
    * 역순으로 정렬하는 reverse() 생성
    *
    * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] x = {1,2,3,4,5,6};

        System.out.println(Arrays.toString(x));

        reverse(x);

        System.out.println(Arrays.toString(x));


    }

    private static void reverse(int[] a) {

        for (int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length-i-1);
        }
    }


    private static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }
}
