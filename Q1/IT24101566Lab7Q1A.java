import java.util.Scanner;
public class IT24101566Lab7Q1A
{
  public static void main(String args[])
  {
    
      Scanner input = new Scanner(System.in);
      System.out.println("Enter marks for four subjects:");
      int count = 0;

      for (int i=1; i<=4; i++)
      {
        System.out.print("Enter Subject Mark "+i+": ");
        int marks = input.nextInt();  
        count = count+marks;
      }
      System.out.println();

      double average = (double)count/4;
      System.out.println("Average is : "+average);
      
      if (average<=100 && average>=75)
        System.out.println("Overall Grade is : Distinction");
      else if (average<=74 && average>=50)
        System.out.println("Overall Grade is : Credit");
      else
        System.out.println("Overall Grade is : Fail");System.out.println();

    }
}