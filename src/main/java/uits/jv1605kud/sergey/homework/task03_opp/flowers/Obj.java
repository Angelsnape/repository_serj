/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605kud.sergey.homework.task03_opp.flowers;

/**
 *
 * @author SERJ
 */
class Obj {
    public static void main(String[] args) {
      
        Flower rose = new FlowerGirl(17, "Роза", "Красная", 2, 14.7); // (цена, название цветка, цвет, дней после срезки, длина стебля)
        Flower tulip = new FlowerGirl(14,"Тюльпан", "Желтый", 1, 15);
        
 
       
 
      Bouquet bouquet = new Bouquet(5);
      
      bouquet.addFlowers(rose,2);
      bouquet.addFlowers(tulip);
        System.out.println(bouquet.flower[0].flower_name);
      }
        
    
    
    
    }

