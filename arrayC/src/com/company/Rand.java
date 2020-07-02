package com.company;
import java.io.*;
import java.util.Random;
public class Rand {
    private int[] arr_num;
    private int[] arr_cant;
    int[] new_arr = new int[13];





    public Rand(int[] arr_num, int[] arr_cant)
    {
        this.arr_num = arr_num;
        this.arr_cant = arr_cant;
        int a = arr_cant.length + arr_num.length;
        int[] new_arr = new int[a];
//        this.new_arr = new_arr;


    }


    public int  ar()
    {
        int aux = 0;

//        int a = arr_cant.length + arr_num.length - 2;

        for(int i = 0; i < arr_num.length; i++)
        {
            for(int j = 0; j < arr_cant[i]; j++) {
                new_arr[aux] = arr_num[i];
                aux ++;
            }
        }

        int rnd = new Random().nextInt(new_arr.length);

        return new_arr[rnd];
    }




}


