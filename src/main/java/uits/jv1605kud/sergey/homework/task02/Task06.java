/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Используя циклические конструкциии массивы создать “рваный массив” треугольной формы, 
реализовать вывод данного массива в виде треугольника в консоль. Реализовать методы, отражающие данный “треугольник”
● погоризонтали
● повертикали
● по горизонтали и вертикали одновременно
 */
package uits.jv1605kud.sergey.homework.task02;

import java.util.Arrays;

/**
 *
 * @author SERJ
 */
public class Task06 {
      
    public static void main(String[] args) {
      
            int [][]array = new int [5][];
            
            fill(array);
    
         for(int i = 0; i<array.length;i++){
              for(int j = 0; j<i+1;j++){
                  System.out.print(array[i][j]);
                  
              
              }
                    System.out.println();
         }
    }
    
    static void fill(int [][]array){
          for(int i = 0; i<5;i++){
  
                 for(int j = 1; j<=i+1;j++ ){
                    array[i] = new int [j];
                     
                       
                         }
                  }
    
    
    }
}
