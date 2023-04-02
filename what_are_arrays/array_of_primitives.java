package com.what_are_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class array_of_primitives
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // array of primitives
        int[] arr2 = new int[4];
        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;
        arr2[3] = 4;
        // [1,2,3,4]
        System.out.println(arr2[2]);

        // input using loops
        for (int i = 0; i < arr2.length; i++)
        {
            arr2[i] = input.nextInt();
        }

        // print the array
        for (int i = 0; i < arr2.length; i++)
        {
            System.out.print(arr2[i]+" ");
        }

        // print array with refrence variable
        for ( int num : arr2) // for every element in the array print the element
        {
            System.out.print(num+" ");// here num represents elements of the array

        }

        // print array with to string method
        // when you give your array into it, it converts into string and print that string
        System.out.println(Arrays.toString(arr2));









    }

}