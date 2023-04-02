package com.what_are_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class array_of_objects {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++)
        {
            str[i] = input.next();
        }

        // print
        System.out.println(Arrays.toString(str));

        //print with loop
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+ " ");

        }
    }
}
