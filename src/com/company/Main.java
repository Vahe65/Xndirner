package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Xndir59 xndir59 = new Xndir59();
        Scanner in =  new Scanner(System.in);
        int j = in.nextInt();
        xndir59.setNumber(j);
        int[] arr= xndir59.lucum();

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
	// write your code here
    }
}
