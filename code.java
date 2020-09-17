import java.io.*;
import java.util.*;



public class code{
  public static void main(String args[]){

//Code Challenge 1

Scanner ns;
ns = new Scanner (System.in);
System.out.println("Type a negative number");
int neg = ns.nextInt();
int posneg= Math.abs(neg);
System.out.println ("Type a positive number grater than " + posneg);
int pos = ns.nextInt();
int range = posneg + pos;
int ran1 = (int)(Math.random()*range) + neg;
int ran2 = (int)(Math.random()*range) + neg;
System.out.println("You got a "  + ran1 + " and " + ran2);



//Code Challenges 2


Scanner ms = new Scanner(System.in);

System.out.println("What is your name?");
String name = ms.nextLine();

System.out.println("How old are you?");
int age = ms.nextInt();

System.out.println("What is 3/4 as a decimal?");
double answer = ms.nextDouble();

Scanner hi = new Scanner(System.in);

System.out.println("What is your favorite candy?");
String candy = hi.nextLine();

System.out.println("How tall are you in inches? Round it to the nearest inches.");
int hight = hi.nextInt();

System.out.println("Hi, my name is " + name + "!" + " I'm " + age + " ,and I'm bored. I only finished " + answer + " of my homework and I don't feel like completing the rest. If you don't know what " + answer + " is as a percent, you sholud probably finish your math homework. Did I forget to mention that I'm " + hight + " inches tall, and I don't know why I told you that. I want to eat " + candy + " cuz " + candy + " are my favorite candy!");


  }
}