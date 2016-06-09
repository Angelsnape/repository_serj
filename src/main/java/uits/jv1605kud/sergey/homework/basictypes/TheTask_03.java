/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605kud.sergey.homework.basictypes;

import java.math.BigDecimal;
import java.math.MathContext;



/**
 *
 * @author SERJ
 */
public class TheTask_03 {
    public static void main(String[] args) {
        double height_H = 20;
        double radius_r = 30;
        double volume_V = TheTask_02.areaOfaAircle(radius_r) * height_H;
        System.out.println("объем цилиндра: " + volume_V);
        
        
        //radius_r = 25;
        //double radius_R = 35;
        height_H = 67;
        double hollow_cylinder_V = height_H * TheTask_02.areaRing(25, 35);
        System.out.println("объем полого цилиндра: "+ hollow_cylinder_V);
        
        //radius_r = 18;
        height_H = 23;
        double side_cylinder_S = TheTask_02.circumference(18) * height_H;
        System.out.println("площадь боковой поверхности цилиндра: "+ side_cylinder_S);
        
        //radius_r = 33;
        double surface_sphere_S = 4 * TheTask_02.areaOfaAircle(33);
        System.out.println("Площадь поверхности шара: "+ surface_sphere_S );
        
        
        //radius_r = 15;
        double volume_sphere = 4*3.14*Math.pow (15, 3)/3;
        System.out.println("объем шара " + volume_sphere );
        
        //double side_a = 40;
        //double side_b = 20;
        double side_c = 25;
        double box_v = TheTask_02.areaOfaRectangle(40, 20)*side_c;
        System.out.println("объем параллелепипеда: "+ box_v );
        
        double box_S = 2*(TheTask_02.areaOfaRectangle(20,40)+TheTask_02.areaOfaRectangle(40,25)+TheTask_02.areaOfaRectangle(20,25));
        System.out.println("площадь поверхности прямоугольного параллелепипеда: "+ box_S);
        
        double tetra_H = 50;
        MathContext accuracy = new MathContext(20);
         BigDecimal b = new BigDecimal ((TheTask_02.areaOfaTriangle(35,35,35))*tetra_H, accuracy); // формула для объёма тетраэдра 1/3*SH;
         BigDecimal A = new BigDecimal (1, accuracy);
         BigDecimal C = new BigDecimal (3, accuracy);
         BigDecimal R = A.divide(C, accuracy);
         BigDecimal tetra_V = R.multiply(b, accuracy);
         System.out.println("объем тетраэдра: "+ tetra_V);
         
         double area_S = TheTask_02.areaOfaTriangle(25, 25, 25)*4;
         System.out.println("площадь поверхности тетраэдра " + area_S);
        
       
       
        
    }
    
}
