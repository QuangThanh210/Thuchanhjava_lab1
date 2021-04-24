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
public class bai6 {
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap n:");
        int n=scanner.nextInt();
       
        System.out.printf("Cac so nguyen to nho hon %d la:\n",n);
        if(n>=2){
            System.out.print(2);
        for (int i=3;i<n;i+=2){
            if(isPrimeNumber(i)){
                System.out.print(""+i);
            }
        }
        }
    }

    private static boolean isPrimeNumber(int n) {
        if(n<2){
            return false;//To change body of generated methods, choose Tools | Templates.
    }
    int squareRoot=(int)Math.sqrt(n);
    for(int i=2;i<=squareRoot;i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
}
}
