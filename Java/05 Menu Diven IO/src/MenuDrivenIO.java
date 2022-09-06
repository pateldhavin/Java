import java.util.*;
import java.io.*;
class MenuDrivenIO
{
    //user’s first name and echo it back out 20 times.
    public static void echoName(String firstName)
    {
       for(int i = 0; i < 20; i++)
           System.out.println(firstName);
    }
   
    //user’s age and double it and display the age and the doubled age.
    public static void doubleAge(int age)
    {
       int doubleAge = age * 2;
       System.out.println("Your age is: " + age);
       System.out.println("Your age doubled is: " + doubleAge);
       if(age > 18)
           System.out.println("Since you are " + age + " years old, you are not a teenager.");
       else  
           System.out.println("Since you are " + age + " years old, you are a teenager.");
    }
   

    public static void printTriangle(int number) throws FileNotFoundException
    {
       PrintWriter pw = new PrintWriter(new File("triangle.txt"));
       for(int i = 0; i < number; i++)
       {
          for(int j = 0; j < i; j++)
          {
             System.out.print("*");
             pw.write("*");
          }
          System.out.println();
          pw.write("\n");
       }
       pw.close();
    }
   
    public static void main(String[] args) throws FileNotFoundException
    {
       System.out.println("1. Print name 20 times.");
       System.out.println("2. Print age, and double it.");
       System.out.println("3. Print triangle to terminal, and file.");
       System.out.print("Enter your choice: ");
       Scanner sc = new Scanner(System.in);
       int choice = sc.nextInt();
      
       switch(choice)
       {
          case 1:
                  System.out.print("Enter the first name: ");
                  String name = sc.next();
                  echoName(name);
                  break;
          case 2:
                  System.out.print("Enter the age: ");
                  int age = sc.nextInt();
                  doubleAge(age);
                  break;
          case 3:
                  System.out.print("Enter an integer: ");
                  int number = sc.nextInt();
                  printTriangle(number);
                  break;
          default:   System.out.println("Invalid menu choice.");
       }
    }
}