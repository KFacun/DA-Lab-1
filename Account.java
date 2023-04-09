import java.util.Scanner;

public class Account {
	private double balance;
	private double rate;
   public double newBal;
   public double test;
   
	
Scanner scanner = new Scanner(System.in);
	
   public Account()
	{
		balance = 100.00;
		rate = 0.03;
	}
	
	public void displayBalance()
	{
		String output = "The balance is %.2f";
		output = String.format(output, balance);
		System.out.println(output);
	}
	
	//ToDo Display Rate
   
   public void displayRate() {

      System.out.println("The rate of interest is currently at " + (String.format("%1$,.2f", rate)) + "%. \n");

   }
	
	//ToDo Deposit Money
   
   public boolean depositMoney(boolean test){
         
      System.out.println("How much would you like to deposit?\n");
      newBal = scanner.nextDouble();
      
         if (newBal > 0) {
            balance = newBal + balance;
            return true;
                         }          
            return false;         
                                         }   
	//ToDo Withdraw Money
   
   public boolean withdrawMoney(boolean test) {
      System.out.println("How much would you like to withdraw?\n");
      newBal = scanner.nextDouble();
      
         if (newBal > balance) {
            System.out.println("Insufficient funds!\n");
            return false;
         }
         
         else {  
            balance = balance - newBal;
            return true;
              }
   }
	
	//ToDo Project Interest
   
   public void projectInterest(int month) {
      int i = 0;
   
      while (i < month) {     
   //using while loop and increments with (++i) until it hits 3
         balance = ((balance * rate)/12) + balance;
         System.out.println("In about " + ++i + " month(s), you'll accrue $" + String.format("%1$,.2f", balance) + ".\n");
      }
      
   }
}