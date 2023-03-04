
import java.util.Scanner;

public class Recursividad {
    String cadena = "";
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner lectura = new Scanner (System.in);

        System.out.println("dato 1: ");
        int nun1 = lectura.nextInt();

        System.out.println("dato 2: ");

        int num2 = lectura.nextInt();

        int result = suma(nun1,nun1,num2);
        
        System.out.println(" = "+result);
         
        int result2 = potencia(nun1,nun1,num2);
        
        System.out.println(" = "+result2);
    }
    
    public static int suma(int cuenta,int num1,int num2){
    
        if(num2>1){
            System.out.print(num1+"+");
            return suma((cuenta+num1),num1,(num2-1));
        } 
        System.out.print(num1);
        return cuenta;
    }
    
    public static int potencia(int cuenta,int num1,int num2){
    
        if(num2>1){
            System.out.print(num1+"*");
            return potencia((cuenta*num1),num1,(num2-1));
        } 
        System.out.print(num1);
        return cuenta;
    }
    
}
