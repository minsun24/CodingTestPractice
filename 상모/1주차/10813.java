package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 11;
        int v = 2;
        int[] arr = {1,4,1,2,4,2,4,2,3,4,4};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == v)
                count++;
        }
        System.out.println(count);
    }
}