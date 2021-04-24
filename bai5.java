/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class bai5 {
      public static void main (String[]args)
      {
          Scanner scanner=new Scanner(System.in);
          System.out.print("Nhap a=");
          int a=scanner.nextInt();
           System.out.print("Nhap b=");
          int b=scanner.nextInt();
          System.out.println("USCLN cua "+a+"và"+b+"là"+USCLN(a,b));
           System.out.println("BSCNN cua "+a+"và"+b+"là"+BSCNN(a,b));
      }

    private static int USCLN(int a, int b) {
        if(b==0)return a;
        return USCLN(b,a%b);
         //To change body of generated methods, choose Tools | Templates.
    }

    private static int BSCNN(int a, int b) {
        return (a*b)/USCLN(a,b); //To change body of generated methods, choose Tools | Templates.
    }
}
