
package com.mycompany.Ivan;
import java.util.Scanner;
public class Proyecto9 {
public static void main(String[] args) {
Scanner leer = new Scanner (System.in);
int cont;
int[]arreglo= new int[9];
for(cont=0;cont<=9;cont++){
System.out.print("Ingresa el primer número");
arreglo[cont]=leer.nextInt();
}
for(cont=9;cont>=0;cont--){
System.out.print("Los numero son"+arreglo[cont]);
}       
    }
}
