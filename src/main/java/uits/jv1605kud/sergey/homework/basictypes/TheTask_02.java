/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1605kud.sergey.homework.basictypes;

/**
 *
 * @author SERJ
 */
public class TheTask_02 {
    public static void main(String[] args) {
   
        
    }
    static double circumference(double r){ // Формула для вычисления периметра круга (длины окружности)
     double perimeter = 2*3.14*r;
     return perimeter;
             }
    static double areaOfaAircle(double r){ //  площадь круга
      double p = 3.14;
      double area = p*r*r;
      return area;
             }
    static double areaRing(double r, double R){ // площадь кольца
      double p = 3.14;
      double s = p*((R*R)-(r*r));
      return s;
             }
    static double perimeterOftheTriangle(double a, double b, double c){  // периметр треугольника
      double P = a+b+c;
      return P;
             }
    static double areaOfaTriangle(double a, double b, double c){ // Площадь треугольника по формуле Герона
        double p = 0.5*(a+b+c);
        double p2 = (p *(p - a)*(p - b)*(p - c));
        double S =  Math.sqrt(p2);
        return S;
    }
    static double perimeterOfaRectangle(double a, double b){    // периметр прямоугольника
       double P = 2*(a+b);
       return P;
             }
    static double areaOfaRectangle(double a, double b ){    // площадь прямоугольника 
        double S = a*b;
        return S;
             }
}
