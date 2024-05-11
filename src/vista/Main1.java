/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Persona;

/**
 *
 * @author LENOVO
 */
//consumiendo objetos 
// instanciar un objeto es crear instanciar declarar 
public class Main1 {
    //llamar al metodo main traductor o interprete del codigo
    //probar el codigo
    public static void main(String[] args) {
        //crear instanciar declarar un objeto 
        //nombre de clase nombreObjeto=new NombreClase();
        Persona karen=new Persona();
        Persona sebastian=new Persona();
        Persona jonathan=new Persona();
        Persona andrea=new Persona();
        Persona sandra=new Persona();
   
        //declarar datos
        //nombreObjeto.atributo/variable="dato"
        //objeto 1
        karen.idPersona=001;
        karen.nombres="Karen";
        karen.apellidos="Paez";
        karen.etnia="mestiza";
        karen.cedula=1004446702;
        karen.numeroTelefono=978631727;
        //accediendo a metodos 
        karen.saludar();
        //cosumo metodo (dentro del parentesis se llama parametro el dato)
        karen.saludarEdad(  15);
        karen.horoscopo("Acuario");
        
        // objeto 2
        sebastian.idPersona=002;
        sebastian.nombres="Sebastian";
        sebastian.apellidos="Cadena";
        sebastian.etnia="mestizo";
        sebastian.cedula=1041956320;
        sebastian.numeroTelefono=978634567;
        
        // Llamar al método saludar() para cada objeto Persona

        sebastian.saludar();
        sebastian.saludarEdad(18);
        sebastian.horoscopo("Tauro");
        
        //objeto 3
        jonathan.idPersona=003;
        jonathan.nombres="Jonathan";
        jonathan.apellidos="Rosero";
        jonathan.etnia="mestizo";
        jonathan.cedula=1004195630;
        jonathan.numeroTelefono=975678978;
        
        jonathan.saludar();
        jonathan.saludarEdad(20);
        jonathan.horoscopo("Leo");
        
        //objeto 4
        andrea.idPersona=004;
        andrea.nombres="Andrea";
        andrea.apellidos="Cumbal";
        andrea.etnia="mestiza";
        andrea.cedula=1001792462;
        andrea.numeroTelefono=978631727;
        
        andrea.saludar();   
        andrea.saludarEdad(25);
        andrea.horoscopo("Virgo");
       
        //objeto 5
        sandra.idPersona=005;
        sandra.nombres="Sandra";
        sandra.apellidos="Guerrero";
        sandra.etnia="mestiza";
        sandra.cedula=1002350765;
        sandra.numeroTelefono=967821357;
        
        sandra.saludar();
        sandra.saludarEdad(43);
        sandra.horoscopo("Escorpion");
        
    
    }
    
}
