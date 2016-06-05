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
      /*  int circle_r = 25;
        double circle_R = 25.7;
        double circle_c = Circumference(circle_r);
        System.out.println("длина окружности: " + circle_c);
        double s = AreaOfaAircle(circle_r);
        System.out.println("площадь круга: " + s);
        s = AreaRing(circle_r, circle_R);
        System.out.println("площадь кольца: " + s);
        int triangle_a = 15, triangle_b = 20, triangle_c = 25;
        int triangle_s = (int)AreaOfaTriangle(triangle_a, triangle_b, triangle_c); // площадь треугольника 
        System.out.println("площадь треугольника: " + triangle_s); */
        
        
    }
    static double Circumference(double r){ // Формула для вычисления периметра круга (длины окружности)
     double perimeter = 2*3.14*r;
     return perimeter;
             }
    static double AreaOfaAircle(double r){ //  площадь круга
      double p = 3.14;
      double area = p*r*r;
      return area;
             }
    static double AreaRing(double r, double R){ // площадь кольца
      double p = 3.14;
      double s = p*((R*R)-(r*r));
      return s;
             }
    static double PerimeterOftheTriangle(double a, double b, double c){  // периметр треугольника
      double P = a+b+c;
      return P;
             }
    static double AreaOfaTriangle(double a, double b, double c){ // Площадь треугольника по формуле Герона
        double p = 0.5*(a+b+c);
        double p2 = (p *(p - a)*(p - b)*(p - c));
        double S =  Math.sqrt(p2);
        return S;
    }
    static double PerimeterOfaRectangle(double a, double b){    // периметр прямоугольника
       double P = 2*(a+b);
       return P;
             }
    static double AreaOfaRectangle(double a, double b ){    // площадь прямоугольника 
        double S = a*b;
        return S;
             }
}
