package com.company;
public class Main {

    public static void main(String[] args) {

        int[] arr_num = {1,2,3};
        int[] arr_cant = {1,2,10};

        Rand rand1 = new Rand(arr_num, arr_cant);


        //System.out.println(rand1.ar());
        //rand1.ar();


        System.out.println("Random = "+rand1.ar()+" \n");

        for(int i : rand1.new_arr)
        {
            System.out.print(i + " ") ;
        }

    }
}
