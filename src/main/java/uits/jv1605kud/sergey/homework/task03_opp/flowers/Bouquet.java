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
class Bouquet{

  int quantity;
  Flower[]flower;

    public Bouquet(int quantity) {
        this.flower = new Flower[quantity];
        this.quantity = quantity;
        
    }
    
     
    public void addFlowers(Flower flower ){
       for(int index = 0;index<quantity;index++){
           if(this.flower[index]==null){
      this.flower[index] = flower;break;
              
           }
        }
       
     }
    public void addFlowers(Flower flower, int quantity ){
       for(int index = 0;index<this.quantity;index++){
            if(index==quantity){
           break;
           }
           if(this.flower[index]==null){
      this.flower[index] = flower;
              
           }
          
        }
       
     }
   


   
    
   void sorting(Flower[]flower){
       Flower[]array = new Flower[flower.length];
       for(int barrier = flower.length-1;barrier>=0;barrier--){
     for(int index = 0;index<barrier;index++){
      if(flower[index].day>flower[index+1].day){
      array[index] = flower[index];
      flower[index]= flower[index+1];
      flower[index+1] = array[index];
         
        
      }
     }
       }
   
    }  
}
