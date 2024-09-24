import java.util.Scanner;
public class IT24101566Lab7Q3
{
  public static void main(String args[])
  {
    for (int i=1; i<=5; i++)
    {
      System.out.println("Customer "+i);
      Scanner input = new Scanner(System.in);
      System.out.print("Enter total bill amount: ");
      int totalBill = input.nextInt();
      System.out.print("Enter mode of payment (C for cash, O for other): ");
      char modeOfPayment = input.next().charAt(0);

      if (modeOfPayment=='C' || modeOfPayment=='c')
      {
        double discount = (double)totalBill * 5/100;
        System.out.print("Discount is : "+discount);
        System.out.println();

        Double totalAmount = totalBill - discount;
        System.out.print("Amount to be paid: "+totalAmount);
        System.err.println();
        System.out.println();
      }

      else if (modeOfPayment=='O' || modeOfPayment=='o')
      {
        System.out.println("No discount applicable");
        System.out.println("Amount to be paid: "+(double)totalBill);
        System.out.println();
      }

      else
      {
        System.out.println("Payment Mode is Not Valid");
        System.out.println();
      }
    }
  }
}