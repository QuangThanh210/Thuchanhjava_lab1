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
public class bai4 {
    
    public static void main (String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap x:");
        int x=scanner.nextInt();
        System.out.print("Nhap y:");
        int y=scanner.nextInt();
        int tong=x+y;
        System.out.println(x+"+"+y+"="+tong);
        int hieu=x-y;
        System.out.println(x+"-"+y+"="+hieu);
        float tich=x*y;
        System.out.println(x+"*"+y+"="+tich);
        float thuong=x/y;
        System.out.println(x+"/"+y+"="+thuong);
    }
}
