/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clazzzzzz;

import java.util.Scanner;

/**
 *
 * @author zelay
 */
public class Clazzzzzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int index=0,total,lat,roto=0;
        System.out.println("ingrese tabla");
        lat=sc.nextInt();
        while(index<12){
            index++;
        total=lat*index;
            System.out.println(lat+"x"+index+"="+total);
         roto=roto+total;
        }
        System.out.println("= "+roto);
    }
    
}
