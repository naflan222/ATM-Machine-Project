import java.util.Scanner;

public class MainClass {
   public static void main (String [] args) {
       AtmOperationInterf op=new AtmOperationImpl();
       int atmnumber=12345;
       int atmpin=123;

       Scanner in = new Scanner(System.in);
       System.out.println("********Welcome to ATM Machine********");
       System.out.println("Enter ATM Number : ");
       int atmNumber = in.nextInt();
       System.out.println("Enter pin : ");
       int pin= in.nextInt();

       if ((atmnumber==atmNumber)&&atmpin==pin){
           while (true){
               System.out.println("1. View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Mini Statement \n5.Exit");
               System.out.println("Enter the choice : ");
               int ch= in.nextInt();
               if (ch==1){
                   op.viewBlance();
                   
               } else if (ch==2) {
                   System.out.println("Enter Amount to withdraw : ");
                   double withdrwaAmount = in.nextDouble();
                   op.withdrawAmount(withdrwaAmount);
                   
               } else if (ch==3) {
                   System.out.println("Enter Amount to Deposit : ");
                   double depositAmount=in.nextDouble();
                   op.depositAmount(depositAmount);
                   
               } else if (ch==4) {
                   op.viewMiniStatement();
                   
               } else if (ch==5) {
                   System.out.println("Collect your ATM Card");
                   System.out.println("Thank you for using ATM Machine");
                   System.exit(0);
               }
               else
               {
                   System.out.println("Please enter correct choice");
               }
           }

       }
       else {
           System.out.println("Incorrect ATM Number or PIN");
           System.exit(0);
       }

   }
}
