import java.util.Scanner;
public class IT24101566Lab7Q1B
{
  public static void main(String args[])
  {
    int numStudents = 3;
    int numSubjects = 4;
    for (int i=1; i<=numStudents; i++)
    {
      Scanner input = new Scanner(System.in);
      int count = 0;
      System.out.println("Student "+i);
      int[] marks = new int[numSubjects];

      System.out.print("Enter Marks: ");
    
      for (int j = 0; j<numSubjects; j++)
      { 
        marks[j] = input.nextInt();
        count = count + marks[j];
      }
      //System.out.println();

      double average = count/(double)numSubjects;
      System.out.println("Average is : "+average);

      if (average<=100 && average>=75)
        System.out.println("Overall Grade is : Distinction");
      else if (average<=74 && average>=50)
        System.out.println("Overall Grade is : Credit");
      else
        System.out.println("Overall Grade is : Fail");System.out.println();

    }
    
  }
}