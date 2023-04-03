/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author phucdong
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         System.out.print("Nhập giá trị: ");
        int value = scanner.nextInt();
        System.out.print("nhập giá trị chuôi : ");
        String a = scanner.next();
        System.out.println("Giá trị vừa nhập: " + value);
        System.out.println("giá trị chuỗi vừa nhập " +a);
        
    }
    
}
