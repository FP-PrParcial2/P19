/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppproblema019;
import java.util.*;
/**
 *
 * @author karen
 19.	Realiza un programa que dado el valor de un ángulo, calcule su seno, coseno y tangente.  */
public class PPProblema019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a;
        Scanner n = new Scanner(System.in);
        try {
            System.out.print("Introduce un ángulo de (0...360°): ");
            a = n.nextDouble();
            anguloCal(a);
        } catch (Exception e) {
            System.out.println("ERROR: Datos incorrectos.");
        }
    }
    static void anguloCal(double a){
        //Primer punto, pasa "a" a radianes.
        double b = Math.toRadians(a);
        System.out.println("Seno de " + a + " es: " + Math.sin(b) );
        System.out.println("Coseno de " + a + " es: " + Math.cos(b) );
        System.out.println("Tangente de " + a + " es: " + Math.tan(b) );
    }
}
        
        
   
    

