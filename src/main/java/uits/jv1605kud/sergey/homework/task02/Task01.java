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
import java.util.Arrays;
/**
 *
 * @author SERJ
 */
public class Task01 {
    public static void main(String[] args) {
      
      
        System.out.println("все чила от 0 до 100 кратные : 2"  + karraliQadriyatlari(2));
        System.out.println("сумма чисел: "+ sum(2));
        System.out.println();
        
        System.out.println("все чила от 0 до 100 кратные : 7"  + karraliQadriyatlari(7));
        System.out.println("сумма чисел: "+ sum(7));
        System.out.println();
        
        System.out.println("разность сумм последовательности чисел, кратных 7 и 2: " + sumTwo(sum(2), sum(7)));
        System.out.println();
        
        System.out.println("все чила от 0 до 100 кратные : 5"  + karraliQadriyatlari(5));
        System.out.println("сумма чисел: "+ sum(5));
        System.out.println();
        
        System.out.println("все чила от 0 до 100 кратные : 3"  + karraliQadriyatlari(3));
        System.out.println("сумма чисел: "+ sum(3));
        System.out.println();
        
        System.out.println("отношение последовательности чисел, кратных 5 к последовательностичисел, кратных 3: " 
                + relations(sum(5), sum(3)));
         }
    
    static String karraliQadriyatlari(int number){
        
        int [] array = new int [100/number];
        int a = 0;
        for(int i = 2;i<=100;i++){
        if(i%number==0){
            
            array[a] = i;
            a++;
            }
        
        
        }
    
    return Arrays.toString(array);
    }
    
    static int sum(int number){
        
          int twa_01 = 0;
          
        for(int two = 2;two <=100;two++){
            if(two%number==0 )
             twa_01 = twa_01 + two;
            
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
