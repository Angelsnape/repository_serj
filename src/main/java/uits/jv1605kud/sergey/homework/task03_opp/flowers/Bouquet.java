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
  FlowerGirl[]flower;

    public Bouquet(int quantity) {
        this.flower = new FlowerGirl[quantity];
        this.quantity = quantity;
        
    }
    
     
    public void addFlowers(Flower flower ){
       for(int index = 0;index<quantity;index++){
           if(this.flower[index]==null){
      this.flower[index] = (FlowerGirl) flower;break;
              
           }
        }
       
     }
    public void addFlowers(Flower flower, int quantity ){
        int number = 0;
       for(int index = 0;index<this.quantity;index++){
            if(number==quantity)break;
           if(this.flower[index]==null){
      this.flower[index] = (FlowerGirl) flower;
              number++;
           }
          
        }
       
     }
   


   
    
   void sorting(){
       FlowerGirl[]array = new FlowerGirl[flower.length];
       
       for(int barrier = flower.length-1;barrier>=0;barrier--){
           
     for(int index = 0;index<barrier;index++){
         if(flower[index+1]==null)break;
      if(flower[index].day>flower[index+1].day){
      array[index] = flower[index];
      flower[index]= flower[index+1];
      flower[index+1] = array[index];
         
        
      }
     
       }
       }
    }
   void priceBouquet(){
       double price = 0;
       for(int index = 0;index<this.quantity;index++){
           if(flower[index]==null)break;
         price += flower[index].price;
           
       }
       System.out.println("цена букета"+ price);
       
   
   
   
   }
   
}
