/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*Задание1.Спомощью арифметических операций, операций сравнения и конструкций if else и циклических 
операций создать приложение которое:
●впоследовательности чисел от 0 до 100 выводит все значения кратные 2,3,5,7:
●находит сумму чисел для каждой из этих последовательностей
●вычисляет разность сумм последовательности чисел, кратных 7 и 2
●вычисляет отношение последовательности чисел, кратных 5 к последовательностичисел, кратных 3  */

package uits.jv1605kud.sergey.homework.task02;
import java.math.BigDecimal;
import java.math.MathContext;
/**
 *
 * @author SERJ
 */
public class Task01 {
    public static void main(String[] args) {
        int a;
        int b;
        a = sum(2);
        System.out.println("сумма чисел: "+a);
        System.out.println();
        
        b = sum(7);
        System.out.println("сумма чисел: "+ b);
        System.out.println();
        
        System.out.println("разность сумм последовательности чисел, кратных 7 и 2: " + sumTwo(a, b));
        System.out.println();
        
        a = sum(5);
        System.out.println("сумма чисел: "+a);
        System.out.println();
        
        b = sum(3);
        System.out.println("сумма чисел: "+b);
        System.out.println();
        
        System.out.println("отношение последовательности чисел, кратных 5 к последовательностичисел, кратных 3: " + relations(a, b));
         }
    
    
    static int sum(int number){
        
          int twa_01 = 0;
          
        for(int two = 2;two <=100;two++){
            if(two%number==0 )
             twa_01 = twa_01 + two;
            System.out.println(" значения кратные " + number +": " + two);
                         }
                return twa_01; 
            }
     
     
    static int sumTwo (int a, int b){
           int c = a - b;
           return c;
                 } 
    
    
    static BigDecimal relations(double a, double b){
             MathContext accuracy = new MathContext(2);
             BigDecimal A = new BigDecimal (a, accuracy);
             BigDecimal B = new BigDecimal (b, accuracy);
             BigDecimal R = A.divide(B, accuracy);
             
            return R;
           
                }
      
}
