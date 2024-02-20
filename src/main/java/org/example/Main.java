package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n = 4;

        printHelloWorld(n);

        int[] arrNum = new int [7];
        arrNum[0] = 3;
        arrNum[1] = 6;
        arrNum[2] = 7;
        arrNum[3] = 9;
        arrNum[4] = 13;
        arrNum[5] = 23;
        arrNum[6] = 25;

        System.out.print(binarySearch(arrNum,21,0,7));

        }
    static void printHelloWorld(int n) {
        if (n > 0) {
            System.out.println("Hello World");
            printHelloWorld(n - 1);
        }
    }
    static int binarySearch(int[] arr, int findNum, int low, int high) {
        if (low > high) {
            return -1;  // base case so if target not found it returns -1
        }

        int mid = (high + low) / 2; // determines what the mid of the array is

        if (arr[mid] == findNum) {
            return mid;  // target found
        } else if (arr[mid] > findNum) {
            return binarySearch(arr, findNum, low, mid - 1);  // search in the left half, mid - 1 is the new high
        } else {
            return binarySearch(arr, findNum, mid + 1, high);  // search in the right half
        }
    }



}