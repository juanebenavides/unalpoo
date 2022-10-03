/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.e18;

public class E18 {

    public static void main(String[] args) {
        interfaz18 miinterfaz = new interfaz18();
        miinterfaz.setVisible(true);
    }
}

class Trabajador {
        String codigo, nombres;
int horas_trabajadas, valor_htrabajadas, rtfnt;
double bruto, neto;
Trabajador(int horas_trabajadas, int valor_htrabajadas, int rtfnt){
    this.horas_trabajadas = horas_trabajadas;
    this.valor_htrabajadas = valor_htrabajadas;
    this.rtfnt = rtfnt;
}
public double bruto() {
bruto = horas_trabajadas*valor_htrabajadas;
return horas_trabajadas * valor_htrabajadas;
}
public double neto() {
return bruto - (rtfnt * bruto) / 100;
}
}
