import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 1000;
        int correctPIN = 1234;
        int attempts=3;
        int choice;
        
        

        System.out.println("====== ATM MACHINE =====");
        System.out.println("Please Enter your card.\nAfter inserting the card Press 0.");

        int ok = sc.nextInt();

        if (ok == 0) {
            while(attempts>0){

            

            System.out.print("Enter your PIN: ");
            int enterPIN = sc.nextInt();

            if (enterPIN == correctPIN) {

                do {
                    System.out.println("\n====== ATM MENU =====");
                    System.out.println("1. Check Balance");
                    System.out.println("2. Cash Deposit");
                    System.out.println("3. Cash Withdraw");
                    System.out.println("4. Exit");

                    System.out.print("Enter Your Choice: ");
                    choice = sc.nextInt();

                    switch (choice) {

                        case 1:
                            System.out.println("Your Current Balance is " + balance);
                            break;

                        case 2:
                            System.out.print("Enter amount to deposit: ");
                            int deposit = sc.nextInt();
                            if(deposit>=0){
                            balance += deposit;
                            System.out.println("Amount Deposited Successfully");
                            System.out.println("Your Last Deposited amount is "+ deposit);}
                            else{
                                System.out.println("Enter Valid Amount");
                            }
                            break;


                        case 3:
                            System.out.print("Enter amount to withdraw: ");
                            int withdraw = sc.nextInt();

                            if (withdraw>=0 && withdraw <= balance) {
                                balance -= withdraw;
                                System.out.println("Please collect your Cash");
                                System.out.println("Your Last Withdrawed amount is "+ withdraw);
                            } else {
                                System.out.println("Insufficient Balance");
                            }
                            break;

                        case 4:
                            System.out.println("Thank you!! Visit Again..");
                            break;

                        default:
                            System.out.println("Invalid Choice. Try Again");
                    }

                } while (choice != 4);

            } else {
                attempts--;
                System.out.println("Wrong PIN !! Try Again.\n Attempts Left: " +attempts );
            }
            if(attempts==0){
                System.out.println("Card Blocked");
            }
        }

        } else {
            System.out.println("Card not inserted properly");
        }

        sc.close();
    }
}
