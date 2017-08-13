import java.io.*;
import java.*;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Write a description of class Tringulo1 here.
 * 
 * @author Yesid Alarcón 
 * @version (a version number or a date)
 */
public class Triangulo1
{
    public double lado1;
    public double lado2;
    public double lado3;
    public double Area;
    public double semiperimetro;
    public double Perimetro;
    Scanner scanner=new Scanner(System.in);
    
    public Triangulo1(){
        System.out.println ("Ingrese lado 1");
        lado1= scanner.nextInt ();
        System.out.println ("Ingrese lado 2");
        lado2= scanner.nextInt ();
        System.out.println ("Ingrese lado 3");
        lado3= scanner.nextInt ();              
         
        }
    public void hallarsemiperimetro(){
        semiperimetro= (lado1 + lado2 + lado3) / 2;
    }
    
    public void hallarArea(){
    Area= (Math.sqrt (semiperimetro *(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3)));
        System.out.println ("El area es: "+ Area);
    }
    
    public void hallarPerimetro(){
    Perimetro= lado1 + lado2 + lado3;
        System.out.println ("El perimetro es: "+ Perimetro);
    }
     
    public static void main (String [] args){
        Triangulo1 objeto = new Triangulo1();
        objeto.hallarsemiperimetro();
        objeto.hallarPerimetro();
        objeto.hallarArea();
        
    }
}
    
