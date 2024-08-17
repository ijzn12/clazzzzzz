/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clazzzzzz;
import java.util.Scanner;
/**
 *
 * @author zelay
 */
public class perrin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,b=61.45,c=71.5,d = 0,e = 0,f = 0,h;
        System.out.println("ingresar dias");
        a=sc.nextDouble();
        if (a>=0&&a<=40) {
         d=a*b;
        }
        if (a>40&&a<=60) {
         f=a-40;   
         e=a*e;  
        }
        h=d+e;
        System.out.println("pago: "+d);
        System.out.println("pago extra: "+e);
        System.out.println("horas extra: "+f);
        System.out.println("total: "+h);
    }
}
