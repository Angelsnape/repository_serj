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
class Flower {
    double stem_length; //длина стебля
    int day; // дней после срезки
    String flower_name; // название цветка
    String colour; // цвет
    
    
    public Flower( String flower_name, String colour, int day,double stem_length) {
     
        this.flower_name = flower_name;  
        this.day = day;
        this.stem_length = stem_length;
        this.colour = colour; 
    }
}