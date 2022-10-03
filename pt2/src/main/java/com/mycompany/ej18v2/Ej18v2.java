/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ej18v2;




public class Ej18v2 {

    public static void main(String[] args) {
        interfaz2 miinterfaz = new interfaz2();
        miinterfaz.setVisible(true);

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

class Rectángulo {
int base; 
int altura; 
Rectángulo(int base, int altura) {
this.base = base;
this.altura = altura;
}

double calcularArea() {
return base * altura;
}

double calcularPerímetro() {
return (2 * base) + (2 * altura);
}
}

class Cuadrado {
int lado;

public Cuadrado(int lado) {
this.lado = lado;
}

double calcularArea() {
return lado*lado;
}

double calcularPerímetro() {
return (4*lado);
}
}

class TriánguloRectángulo {
int base; 
int altura; 

public TriánguloRectángulo(int base, int altura) {
this.base = base;
this.altura = altura;
}

double calcularArea() {
return (base * altura / 2);
}

double calcularPerímetro() {
return (base + altura + calcularHipotenusa()); 
}
double calcularHipotenusa() {
return Math.pow(base*base + altura*altura, 0.5);
}

public String determinarTipoTriángulo() {
if ((base == altura) && (base == calcularHipotenusa()) && (altura
== calcularHipotenusa())){
return "Es un triángulo equilátero"; /* Todos sus
lados son iguales */}
else if ((base != altura) && (base != calcularHipotenusa()) &&
(altura != calcularHipotenusa())){
return"Es un triángulo escaleno"; /* Todos sus
lados son diferentes */}
else{
    return "Es un triángulo isósceles"; /* De otra
manera, es isósceles */
}
}
}

