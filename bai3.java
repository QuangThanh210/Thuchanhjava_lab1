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
public class bai3 {


    public static void main (String[]args)
    {
      Scanner x=new Scanner(System.in);
        System.out.print("Nhap ms sv:");
        String masv=x.nextLine();
        System.out.print("Nhap ho ten:");
        String hoten=x.nextLine();
        System.out.print("Nhap tuoi:");
        byte tuoi=x.nextByte();
        System.out.print("Nhap nam sinh:");
        int namsinh=x.nextInt();
        System.out.print("Nhap dtb:");
        float dtb=x.nextFloat();
    }
}
