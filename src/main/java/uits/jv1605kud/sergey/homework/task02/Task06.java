/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Используя циклические конструкциии массивы создать “рваный массив” треугольной формы, 
реализовать вывод данного массива в виде треугольника в консоль. Реализовать методы, отражающие данный “треугольник”
● по горизонтали
● повертикали
● по горизонтали и вертикали одновременно
 */
package uits.jv1605kud.sergey.homework.task02;

//import java.util.Arrays;

/**
 *
 * @author SERJ
 */
public class Task06 {
      
    public static void main(String[] args) {
      
            int [][]array = new int [5][];
            
            fill(array);
          // triangle(array);
           //System.out.println();
         
           upright(array);
             System.out.println();
           triangleHorizontally(array);
    }
    
    static void fill(int [][]array){
          for(int i = 0; i<5;i++){
  
                 for(int j = 1; j<=i+1;j++ ){
                    array[i] = new int [j];
                     
                       
                         }
                  }
    
    
    }
    static void triangle(int[][]array) {
        
        
        for (int[] array1 : array) {
            for (int j = 0; j < array1.length; j++) {
                System.out.print(array1[j]);
            }
            System.out.println();
        }
    
    }
    
    static void triangleHorizontally(int[][]array){  
     String[]space = {"         ", "       ","     ","   "," "};
        
        for(int i = array.length-1; i>=0;i--){
              for(int j = 0; j<array[i].length;j++){
                System.out.print(array[i][j]);
                    }
              
                System.out.print(space[i]);
                
              for(int a =0;a<array[i].length;a++){
                  System.out.print(array[i][a]);
               }
              
              System.out.println();
         }
    
    }
    
    static void upright(int[][]array){
        String[]space = {"         ", "       ","     ","   "," "};
        
        for(int i = 0; i<array.length;i++){
              for(int j = 0; j<array[i].length;j++){
                   System.out.print(array[i][j]);
                 }
              
               System.out.print(space[i]);
                for(int a =0;a<array[i].length;a++){
                    System.out.print(array[i][a]);
                   }
                
              System.out.println();
            }
    
    
    }
}
