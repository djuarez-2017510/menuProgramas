/*
Programador: Daniel Oswaldo Juárez Herrera 2017510
 */
package org.danieljuarez.system;

import java.util.Scanner;
        
public class Principal {
    
    static boolean validar(int n){
        
        int suma=0;
        for(int i=1; i<n; i++){
            if(n%i==0)
                suma=suma+i;
        }
            if(suma==n)
                return true;
            return false;
    }
    

    
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
       int numCaso, segTotales, horas, minutos, seg; 
       int dinero, bill200, bill100, bill50, bill20, bill10, bill5, bill1;
       int numEntero;
       int numPerfecto;
       int a=0, b=1, c, numFibo;
       boolean cerrar = false;
       
       do{  
        System.out.println("");   
        System.out.println("Daniel Juarez"+"\nIN5AM 2017510");
        System.out.println("------------MENU------------");
        System.out.println("1. Convertir segundos a formato h:m:s"
                           +"\n2. Programa billetes"
                           +"\n3. Programa par o impar"
                           +"\n4. Programa número perfecto"
                           +"\n5. Programa serie fibonacci"
                           +"\n6. Cerrar");
        
        System.out.println("Ingrese el número del programa que desea utilizar:");
            numCaso = entrada.nextInt();
           System.out.println(""); 
        switch(numCaso){
            
            case 1:    
                
                System.out.println("Ingrese la cantidad de segundos que desea convertir:");
                          segTotales = entrada.nextInt();
                          
                            horas = segTotales/3600;
                            minutos = segTotales%3600/60;
                            seg = segTotales%60;
                                System.out.println("El resultado de la conversion es:");
                                System.out.println(horas+":"+minutos+":"+seg);
                break;
           
            case 2:    
                
                System.out.println("Ingrese la cantidad de dinero a combertir: "); 
                          dinero = entrada.nextInt();
                           
                            bill200 = dinero /200;
                            bill100 = dinero%200 / 100;
                            bill50 = dinero%100 / 50;
                            bill20 = dinero%50 / 20;
                            bill10 = dinero%20 / 10; //en esta parte me da un error sinceramente no veo el error
                            bill5 = dinero%10 / 5;
                            bill1 = dinero%5 / 1;
                            
                                System.out.println("Hay "+bill200+" billetes de Q.200.00"
                                                   +"\nHay "+bill100+" billetes de Q.100.00" 
                                                   +"\nHay "+bill50+" billetes de Q.50.00"
                                                   +"\nHay "+bill20+" billetes de Q.20.00"
                                                   +"\nHay "+bill10+" billetes de Q.10.00"
                                                   +"\nHay "+bill5+" billetes de Q.5.00"
                                                   +"\nHay "+bill1+" billetes de Q.1.00");
                break;
        
                
            case 3:    
                
                System.out.println("Ingrese el numero para saber si es par o impar:");
                          numEntero = entrada.nextInt();
                          
                            if(numEntero%2 == 0){
                                System.out.println("El numero "+numEntero+" es un número par");
                            }
                            else{
                                System.out.println("El numero "+numEntero+" es un número impar");
                            }
                
                break;
                
                
            case 4:    
                
                System.out.println("Ingrese el numero para saber si es perfecto o no: ");
                          numPerfecto = entrada.nextInt();
                         
                            if(validar(numPerfecto)==true)
                                System.out.println("El numero "+numPerfecto+" es perfecto");
                            
                            else
                                System.out.println("El numero "+numPerfecto+" no es perfecto");            
                break;
            
                
            case 5:    
                
                System.out.println("ingrese cuantos valores quiere de la serie: ");
                          numFibo = entrada.nextInt();
                          
                          for (int r = 0; r < numFibo; r++){
                              System.out.println(a);
                              c = a+b;
                              a = b;
                              b = c;
                          }
                break;
                
            case 6: 
                
                System.out.println("Cerrado");
                     cerrar = true;
                
                break;
                
  
            default: 
                
                System.out.println("El numero de opcion que ingreso no es valido intentelo de nuevo");
         
        } 
        
       } while(!cerrar); 
          
    }
 
}
