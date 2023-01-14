package com.company;

/*
Method to print pay based on base pay and
hours worked
Overtime: More than 40 hours, paid 1.5 times
base pay
Minimum Wage: $8.00/hour
Maximum Work: 60 hours a week
 */
class Main {
    public static void FooCorporation(double pay, int hours){
        if (hours<=40 && pay>=8){
            System.out.println("You worked a week "+hours+" hours, and you get "+pay*hours);
        }else if (hours>40 && hours<=60 && pay>=8){
            System.out.println("You worked a week "+hours+" hours, and you get "+(pay*1.5)*hours);
        }else {
            System.out.println("error");
        }
    }
    public static void main(String[] args) {
        FooCorporation(10.0, 73);
    }
}


/*
class Main{
    public static void main(String[] args) {
        int x, y;
        x = 8;
        y = 2;
        System.out.println(Math.sin(x));
        System.out.println(Math.cos(Math.PI/2));
        System.out.println(Math.pow(x, y));
        System.out.println(Math.log(Math.log(x+y)));
    }
}
 */


/*
class Main{
    public static void main(String[] args) {
        int x = 5;
        if (x == 5) {
            int x = 6;
           int y = 72;
            System.out.println("x = " + x + "y = " + y);
        }
        System.out.println("x = " + x + "y = " );
    }
}
 */


/*
class Main{
    public static void printSquare(int x){
        System.out.println("printSquare x = "+x);
        x = x*x;
        System.out.println("printSquare x = "+x);
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println("main x = "+x);
        printSquare(x);
        System.out.println("main x = "+x);
    }
}
 */

/*
public class Main {
    public static double printSquare(double num){

       // this method return of num which is square of numbers

        return num*num;
                }

public static void main(String[] arguments) {
        int numValue = 2;
        System.out.println(printSquare(numValue));
        System.out.println(printSquare(numValue*2));
        }
        }

 */

/*
class Main{
    public static void times (double a, double b){
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        times(2,2);
    }
}
 */