/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Реализовать приложение, которое производит операции циклического сдвига над прямоугольным массивом (матрицей). 
Организовать методы, которые позволяю тпроизвести сдвиг:
● на n позиций влево
● на n позиций вправо
● на n позиций вверх 
● на n позиций вниз
 */
package uits.jv1605kud.sergey.homework.task02;

//import java.util.Arrays;


/**
 *
 * @author SERJ
 */
public class Task07 {
    public static void main(String[] args) {
        int[][]array = new int[10][20];
         fill(array);
         conclusion(horizontally(array, 2,"right"));
         
         fillHor(array);
         System.out.println();
         conclusion(upright(array,3,"up"));
       
       
 
    }
    static void conclusion(int[][]array ){
        for(int i = 0;i<array.length;i++){
          for(int j = 0; j<array[i].length;j++){
              System.out.print(array[i][j]+" ");
            }
         System.out.println();
        
        }
    }
    static void fill(int[][]array ){
      
        for(int i = 0;i<array.length;i++){
           for(int j = 0; j<array[i].length;j++){
              array[i][j]= j;
            }
        }
     
    }
    
    static void fillHor(int[][]array){
         int num = 0;
            for(int i = 0;i<array.length;i++){
               for(int j = 0; j<array[i].length;j++){
                   array[i][j] = num;
                }
               
              num++;
            }
    
    }
    static int[][] horizontally(int[][] array, int how, String side){
    
      int[]array_two = new int [array[array.length-1].length];
      int[]array_three = new int [array[array.length-1].length];
           
           String left = "left";
           String right = "right";
      
    
        if(left.equals(side)){
            for(int i = 0; i<array.length;i++){
              for(int j = 0; j<array[i].length-how;j++){
                  array_two[j]= array[i][j+how];
                }
              
            for(int c = 0; c<how;c++){
                  array_three[c]=array[i][c];
                }
      
      
            for(int l = 0;l<array[i].length;l++){
                 array[i][l] = array_two[l];
                }
            
             int a =0;
             
            for(int g = array[i].length-how;g<array[i].length;g++){
                 array[i][g] = array_three[a];  
                    a++;
                }
            }
        }
        
        
        
        if(right.equals(side)){
          
            for(int i = 0; i<array.length;i++){
                for(int j = 0; j<array[i].length;j++){
                    
                    array_two[j]= array[i][j]; 
                    array_three[j] = array[i][j];
    
                }
    
            }
         System.arraycopy(array_two, array_two.length-how, array_three, 0, how);
         System.arraycopy(array_two, 0, array_three, how, array_two.length-how);
           
              for(int i = 0; i<array.length;i++){
                for(int j = 0; j<array[i].length;j++){
                  
                    array[i][j] = array_three[j];
                
                }
              
              }
         
        }
        
        return array;
   }
    
    static int[][] upright(int[][]array, int how, String side){
        int[][]array_two = new int[20][array.length];
        
           String up = "up";
           String down = "down";
           
        if(up.equals(side)){
              for(int i = 0; i<array.length;i++){
                  for(int j = 0; j<array[i].length;j++){
                     array_two[j][i]=array[i][j];
         
                    }
                }
          horizontally(array_two,how,"left");
         
              for(int i = 0; i<array.length;i++){
                 for(int j = 0; j<array[i].length;j++){
                    array[i][j]= array_two[j][i];
         
                  }
                }
        }
        
        
        if(down.equals(side)){
            
              for(int i = 0; i<array.length;i++){
                 for(int j = 0; j<array[i].length;j++){
                    array_two[j][i]=array[i][j];
         
                  }
                }
              
         horizontally(array_two,how,"right");
         
                for(int i = 0; i<array.length;i++){
                  for(int j = 0; j<array[i].length;j++){
                     array[i][j]= array_two[j][i];
         
                    }
                }
        }
        
        
      return  array;
    }

  
  
    
   
     
   
}
