
/*
   Author: Camila Arbaiza

   Professor: Tanes Kanchanawanchai

   Problem 11.1

    (The Triangle class) Design a class named Triangle that extends
    GeometricObject.

 */

import java.util.Scanner;

public class TestClass {

    public static void main(String[]args) {



        Scanner input = new Scanner(System.in);

        System.out.println("Enter three sides of the triangle: ");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();

        input.nextLine();

        System.out.println("Enter the color: " );
        String c = input.nextLine();



        System.out.println("Enter true if triangle is filled or false if it's not : ");
        boolean f = input.nextBoolean();

        Triangle t = new Triangle(s1, s2, s3, c, f);


        t.printTriangle();


    }//end main
}//end TestClass
