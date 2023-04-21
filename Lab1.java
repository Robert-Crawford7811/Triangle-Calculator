/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rob
 */
import java.lang.Math;
import java.util.Scanner;
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        double x1, y1, x2, y2, x3, y3, d1, d2, d3, S, Area;
Scanner scanner;
scanner = new Scanner(System.in);

System.out.println("Enter the triangle's coordinate for its first point:");
System.out.println("Enter X coordinate: ");
x1 = scanner.nextDouble();
System.out.println("Enter Y coordinate: ");
y1 = scanner.nextDouble();

System.out.println("Enter the triangle's coordinate for its second point:");
System.out.println("Enter X coordinate: ");
x2 = scanner.nextDouble();
System.out.println("Enter Y coordinate: ");
y2 = scanner.nextDouble();

System.out.println("Enter the triangle's coordinate for its third point:");
System.out.println("Enter X coordinate: ");
x3 = scanner.nextDouble();
System.out.println("Enter Y coordinate: ");
y3 = scanner.nextDouble();


d1 = Math.sqrt(Math.pow((x2-x1),2))+ Math.pow((y2-y1),2);
d2 = Math.sqrt(Math.pow((x3-x2),2))+ Math.pow((y3-y2),2);
d3 = Math.sqrt(Math.pow((x3-x1),2))+ Math.pow((y3-y1),2);
 S = ( d1 + d2 + d3 ) / 2;

Area = Math.sqrt(S * (S - d1) * (S - d2) * (S - d3));

System.out.println("The triangle's first point: (" +x1 + "," + y1+")");
System.out.println("The triangle's second point: (" +x2 + "," + y2+")");
System.out.println("The triangle's last point: ("+ x3 + ","+y3+")");

System.out.println( "The distance between the first and second point:" + d1);
System.out.println("The distance between the second and third point:" + d2);
System.out.println("The distance between the third and first point:" + d3);
System.out.println("The area is: " + Area);

    }
}
