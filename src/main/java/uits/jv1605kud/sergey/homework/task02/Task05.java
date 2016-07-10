/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Создать двумерный массив m на n элементов,заполнить его случайными числами. Реализовать методы, позволяющие:
● распечатать массив в прямом и обратном порядке
● для каждой четной строки вывести все четные элементы массива
● для каждого нечетного столбца вывести все не четные элементы массива
● сумму всех элементов, кратных 7 в четных строках 
● произведение элементов, кратных 3 в нечетных строках
 */
package uits.jv1605kud.sergey.homework.task02;

import java.util.Arrays;
import java.util.Random;



/**
 *
 * @author SERJ
 */
public class Task05 {
    public static void main(String[] args) {
        int [][]array = new int [10][10];

          
         fill(array);
         System.out.println(Arrays.deepToString(array));
         System.out.println();
        invert(array);

        
      
    }
    static void invert(int[][]array){
        for(int i = 0; i<array.length;i++){
             
                for (int j =0;j<array[i].length/2;j++){
                    int number = array[i][j];
                    array[i][j] = array[i][array[i].length -j-1];
                    array[i][array[i].length-j-1] = number;
                
                   }
            
                }
        System.out.print(Arrays.deepToString( array));
        
        
}
    static void fill (int[][] array){
        Random rondom = new Random();
       for(int i = 0; i<array.length;i++){
           for(int j= 0; j<array[i].length;j++){
               array [i][j] = rondom.nextInt(500)+10;
               
           }
           
       }            
    

}
}
