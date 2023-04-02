package com.what_are_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class multi_dimenstion_array
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // in 2d array, a array has array in it
        //input with loops
        int[][] arr = new int[3][3];

        for (int row = 0; row < 3 ; row++)
        {
            // for each col in that row
            for (int col = 0; col < 3; col++)
            {
                arr[row][col] = input.nextInt();

            }

        }

        //printing the array

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < 3 ; j++)
            {
                System.out.print(arr[i][j]+ " ");

            }
            System.out.println();// a new line must be added after every row

        }

        // printing by array to string method
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }


        // inhansed for loop
        for (int[]a : arr){
            System.out.println(Arrays.toString(a));
        }

        // array of not fixed colums

        int[][] arr2 ={
                {1,2,3,4},
                {5,6},
                {7,8,9}
        };

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print( +arr2[i][j]+" ");

            }
            System.out.println();

        }
    }
}
