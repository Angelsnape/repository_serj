/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605kud.sergey.homework.task02;

import java.util.Random;

/**
 *
 * @author SERJ
 */
public class Task02 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(99);
        int number01 = number/10;
        int[]mass ={0,10,20,30,40,50,60,70,80,90};
       
         
        
        
        switch(mass[number01]){
            case 20 : System.out.print("двадцать");
            break;
            case 30 : System.out.print("тридцать");
            break;
            case 40 : System.out.print("сорок");
            break;
            case 50 : System.out.print("пятьдесят");
            break;
            case 60 : System.out.print("шестьдесят");
            break;
            case 70 : System.out.print("семьдесят");
            break;
            case 80 : System.out.print("восемьдесят");
            break;
            case 90 : System.out.print("девяносто");
            break;
        }
        number = number%10;
        switch(number){
            
            case 0 : System.out.println("ноль");
            break;
            case 1 : System.out.println("один");
            break;
            case 2 : System.out.println("два");
            break;
            case 3 : System.out.println("три");
            break;
            case 4 : System.out.println("четыре");
            break;
            case 5 : System.out.println("пять");
            break;
            case 6 : System.out.println("шесть");
            break;
            case 7 : System.out.println("семь");
            break;
            case 8 : System.out.println("восемь");
            break;
            case 9 : System.out.println("девять");
            break;
            case 10 : System.out.println("десять");
            break;
            case 11 : System.out.println("одиннадцать");
            break;
            case 12 : System.out.println("двенадцать");
            break;
            case 13 : System.out.println("тринадцать");
            break;
            case 14 : System.out.println("четырнадцать");
            break;
            case 15 : System.out.println("пятнадцать");
            break;
            case 16 : System.out.println("шестнадцать");
            break;
            case 17 : System.out.println("семнадцать");
            break;
            case 18 : System.out.println("восемнадцать");
            break;
            case 19 : System.out.println("девятнадцать");
            break;
      
            
               }
         
    }
}
