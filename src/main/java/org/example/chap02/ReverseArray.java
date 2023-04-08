package org.example.chap02;

import java.util.Scanner;

public class ReverseArray {


    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수:");
        int num = stdIn.nextInt();

        int[] x = new int[num]; // 요솟수가 num인 배열생성

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]");
            x[i] = stdIn.nextInt();
        }


        reverse(x);

        System.out.println("요소 역순으로 정렬함");
        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "]=" + x[i]);
        }

    }

    static void swap(int[] a, int idx1, int idx2) {
        // 배열 요소 a[idx1] 과 a[idx2]를 바꿈
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 배열 a의 요소를 역순으로 정렬
    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - i - 1);
        }
    }


}
