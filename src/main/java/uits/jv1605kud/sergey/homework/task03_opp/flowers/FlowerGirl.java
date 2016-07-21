/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605kud.sergey.homework.task03_opp.flowers;

//import java.util.Scanner;



/**
 *
 * @author SERJ
 */



    
  
       




class FlowerGirl extends Flower{
    double price; // цена 

    public FlowerGirl(double price, String flower_name, String colour, int day, double stem_length) {
        super(flower_name, colour, day, stem_length);
        this.price = price;
    }
    
 public static void main(String[] args) {
     //   Scanner sc = new Scanner(System.in);
        Flower rose = new FlowerGirl(17, "Роза", "Красная", 2, 14.7); // (цена, название цветка, цвет, дней после срезки, длина стебля)
        Flower tulip = new FlowerGirl(14,"Тюльпан", "Желтый", 1, 10);
        Flower chrysanthemum = new FlowerGirl(20, "Хризантема", "Желтый", 4, 12.35);
        Flower gerbera = new FlowerGirl(17.50, "Гербера", "Розовый", 1, 11.67);
        Flower chamomile = new FlowerGirl(7, "Ромашка", "Белый", 5, 15);
        
   
      
         Bouquet bouquet = new Bouquet(7); //указываем количество цветов в букете
       
        bouquet.addFlowers(rose,2); //заполняем букет 
        bouquet.addFlowers(tulip);
        bouquet.addFlowers(chrysanthemum,2);
        bouquet.addFlowers(gerbera);
        bouquet.addFlowers(chamomile);
         
        for (FlowerGirl flower : bouquet.flower) {
            System.out.println(flower.flower_name); // до сортировки 
        }
        System.out.println();
         bouquet.sorting(); //сортирует по свежести
         
        for(int i = 0; i<bouquet.flower.length;i++){
          System.out.println(bouquet.flower[i].flower_name);
        }
            bouquet.priceBouquet();// данный метод считает цену букета
          
          bouquet.flowerStem(9); // ищет длину стебля в указанном диапазоне
          
          
      }
       
        
    
    
 }




 

    
   
 

 
   
   
    
    
 






