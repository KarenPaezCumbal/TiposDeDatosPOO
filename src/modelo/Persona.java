
package modelo;

/**
 *
 * @author LENOVO
 */
// estableciendo el nombre de la clase
public class Persona {
    //  los atributos declaracion de variables es una declaracion global
    //public-private-protected
    public int idPersona;
    public String nombres;
    public String apellidos;
    public String etnia;
    public int cedula;
    public int numeroTelefono;
    //metodos -accion - comportamientos 
    //public private 
    //secciones de codigo 
    //pueden tener variables locales 
    public void saludar (){
        //mostrar informacion debemos recurrir a imprimir
        System.out.println("¡Hola!"  + nombres);
    }
    
    //metodo de no retorno utilizar argumentos de entrada 
    //un argumento es una variable local 
    //dentro de parentesis () se declara 
    // solo se reconoce en ese bloque de codigo
    public void saludarEdad(int edad){
     if(edad>18){
         System.out.println("Hola mayor de Edad ");
     }else{
         System.out.println("Hola menor de Edad ");
     }
    }    
            //metodo que nos indique el horoscopo 
    public void horoscopo (String signoZodiaco){
        if(signoZodiaco=="Aries"){
            System.out.println("No es momento de cambios para su vida.");
        }else if(signoZodiaco=="Tauro"){
            System.out.println("Mantenga la confianza en usted mismo.");
        }else if(signoZodiaco=="Geminis"){
            System.out.println("Florecerá un nuevo amor en su vida.");
        }else if(signoZodiaco=="Cancer"){
            System.out.println("Trate de esforzarse y cambiar su actitud " 
            + "ya que su exceso de orgullo no le permitirá aceptar las críticas.");
        }else if(signoZodiaco=="Leo"){
            System.out.println("Comprenda que si sostiene la seguridad en sí mismo " 
            + "será la clave para solucionar todos los conflictos que se le puedan presentar en esta jornada.");
        }else if(signoZodiaco=="Virgo"){
            System.out.println("Debería no sobrecargarse con demasiadas actividades.");
        }else if(signoZodiaco=="Libra"){
            System.out.println("Comprenda que sus anhelos no siempre se cumplirán de inmediato.");
        }else if(signoZodiaco=="Escorpion"){
            System.out.println("Póngase firme, ya que su inseguridad conspirará en contra de sus logros.");
        }else if(signoZodiaco=="Sagitario"){
            System.out.println("No dude en entregarse de lleno a disfrutar de su buena suerte.");
        }else if(signoZodiaco=="Capricornio"){
            System.out.println("Evite los desgastes nerviosos innecesarios y no discuta por situaciones inútiles.");
        }else if(signoZodiaco=="Acuario"){
            System.out.println("Coordine mejor sus actividades para poder cumplir con todas las obligaciones en tiempo y forma.");
        }else if(signoZodiaco=="Picis"){
            System.out.println("Vea que su falta de concentración y la dispersión " 
            + "de sus energías harán que no pueda concluir todas las obligaciones.");
        }
    }
}
  
       
    
    
    
    

