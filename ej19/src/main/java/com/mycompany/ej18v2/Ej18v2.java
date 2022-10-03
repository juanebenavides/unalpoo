/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ej18v2;

import java.util.Scanner;


public class Ej18v2 {

    public static void main(String[] args) {
        interfaz2 miinterfaz = new interfaz2();
        miinterfaz.setVisible(true);
        Triangulo mitriangulo = new Triangulo(3);
System.out.print("Ingrese el lado: ");
Scanner entrada = new Scanner(System.in);
mitriangulo.lado = entrada.nextDouble();
System.out.println("Perímetro del Triángulo: " + mitriangulo.perimetro());
System.out.println("Altura del Triángulo: " + mitriangulo.altura());
System.out.println("Área del Triángulo: " + mitriangulo.area(mitriangulo.altura()));
    }
}
class Triangulo{
double lado;

Triangulo(double lado){
    this.lado = lado;
}
public double perimetro() {
return lado*3;
}
public double altura() {
return Math.sqrt(Math.pow(lado, 2) - Math.pow(lado / 2, 2));
}
public double area(double altura) {
return lado * altura / 2;
}
}


