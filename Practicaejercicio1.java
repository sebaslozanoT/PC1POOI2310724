/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaejercicio1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Us
 */
public class Practicaejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random valorRandom = new Random();
        
        int valor1 = valorRandom.nextInt(100)+1;
        int valor2 = valorRandom.nextInt(100)+1;
        int suma = valor1 + valor2;
   
        System.out.println("Cual es el resutado del siguiente problema?");
        System.out.println(valor1 + "+" + valor2 + "=");
        
        Scanner scanner = new Scanner(System.in);
        
        try {
            int resultado = scanner.nextInt();
            if (resultado == suma){
                System.out.println("Correcto");
            }else {
                System.out.println("Disculpa, respuesta equivocada. La respuesta correcta es" + suma + ".");
            }
            
        }catch(Exception e){
            System.out.println("Error");
            System.exit(0);
        }     
        
    }
    
}
