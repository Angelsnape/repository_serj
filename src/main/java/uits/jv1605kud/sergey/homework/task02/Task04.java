/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*Создать одномерный массив на n элементов, заполнить его случайными  числами. 
Реализовать методы, позволяющие:  
● вывести все элементы массива в прямом и обратном порядке  
● вывести все четные элементы массива  
● вывести все нечетные элементы массива  
● сумму элементов, кратных 7  
● произведение элементов, кратных 3 */
package uits.jv1605kud.sergey.homework.task02;

import java.util.Arrays;



/**
 *
 * @author SERJ
 */
public class Task04 {

    public static void main(String[] args) {
        int[]array = {23,11,15,3,21,90,100,7,77,1};
             System.out.print(Arrays.toString(array));
        
               System.out.println();
        for(int i = 0;i<array.length/2;i++ ){
          int number = array[i]; 
              array[i]= array[array.length - i -1];
                array[array.length - i -1] = number;
        }
           System.out.println(Arrays.toString(array));
           
           
              for(int i = 0; i<array.length;i++){
                  if(i%2==0){
                      System.out.print(array[i]+" ");
                    }
                }
              System.out.println();
              for(int i = 0; i<array.length;i++){
                   if(i%2!=0){
                       System.out.print(array[i]+" ");
                    }
                }
              int value = 0 ;
              System.out.println();
              for(int i = 0; i<array.length;i++){
              if(array[i]%7==0){
                 value += array[i];
                
           }
                  
              }
          
              System.out.println(value);
              
                  int value_02 = 1;
              for(int i = 0; i<array.length;i++){
              if(array[i]%3==0){
                  value_02 *= array[i];
              
              }
                 
              }
               System.out.println(value_02);
               
               

    }
 
}
