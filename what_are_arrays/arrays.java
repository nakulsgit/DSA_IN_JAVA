package com.what_are_arrays;

public class arrays {
    public static void main(String[] args) {
        // array is an collection of data types
        // datatype[] variable_name = new datatype[size]
        // 1. all the data in the array should be of same datatype5
        int[] roll = new int[5];
        int[] roll1 = {1,2,3,4,5};
        // here roll is a reference variable and and {1,2,3,4,5} is object array
        // int[] roll; is the declaration of array. roll is getting defines in the stack. compile time
        // roll = {1,2,3,4,5} initialisation, here object is being created in the memory (heap), run time
        // primitives are predefined datatypes for example int char boolean float
        // other than premitives there are objects
        // objects are not predefined we need to create them they are also called non premitives for example strings, arrays
        // 'new' is used to create an object
        // array objects are in heap
        // objects are created in heap memory
        // reference variables are in stack memorey from where the point to the objects of a class
        //reference variable default value is null
        // heap objects are not continuos
        // array in java may not be continuos



        int[] ros = new int[5];
        System.out.println(ros[1]);
        // by deafault int arrray contain all zeros {0,0,0,0,0}

        String[] arr = new String[5];
        System.out.println(arr[1]);
        // by deafault string array contain all null values




    }
}
