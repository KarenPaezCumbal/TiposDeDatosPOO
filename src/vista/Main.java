/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main {
  
          public static void main(String[] args) {
              //tipo de dato
              //1.- enteros
              
             int numeroUno =0 ; 
             int numeroDos=0 ;
             
             numeroUno=8;
             numeroDos=10;
             // 1 suma de dos numeros
             int resultado=numeroUno+numeroDos ;
             
             // imprimir  
             System.out.println("El resultado es:"+resultado);
             
             //3. suma 2 numeros utilizar entradas y salidas 
             Scanner es=new Scanner(System.in);
             
             System.out.println("Ingrese el numero 1:");
             int num1=Integer.parseInt(es.next());
             System.out.println("Ingrese el numero 2:");
             int num2=es.nextInt();
             num1+=num2;
              
              System.out.println("El resultadoes:"+num1);
              
              //transfomando de cadena a entero 
              // 1 cadena es un conjunto de caracteres 
              String cadena="La suma de dos numeros enteros es:";
               System.out.println("Ingrese el numero 1:");
               
             int n1=Integer.parseInt(es.next());
             System.out.println("Ingrese el numero 2:");
             int n2=es.nextInt();
             // transformando  en datos primitivos 
             int res=(int)n1+n2;
             //double recibe tanto enteros como primitivos
             double resul=n1+n2;
             //+""TRansforma cualquier tipo de dato a cadena sumar comillas dobles 
             cadena+=resul+"";
             
             
             
          }
}
