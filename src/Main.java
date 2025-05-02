import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String [] args){
        //Java simple banking application

        double balance= 0;
        boolean isRunning= true;
        int choice;


        while (isRunning)
        {
            System.out.println("###################");
            System.out.println("BANKING PROGRAM");
            System.out.println("###################");
            System.out.println("1: SHOW_BALANCE");
            System.out.println("2: DEPOSIT");
            System.out.println("3: WITHDRAW");
            System.out.println("4: EXIT");
            System.out.println("###################");

            System.out.print("Enter your choice(1-4): ");
            choice = scanner.nextInt();

            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance+= deposit();
                case 3 -> balance-= withdraw(balance);
                case 4-> isRunning= false;
                default -> System.out.println("Invalid choice");

            }


        }
        System.out.println("You have successfully exit the program");
        System.out.println("Thank you for using banking program, Have a nice day!");






        scanner.close();

    }
    static void showBalance(double balance) {
        System.out.println("###################");
        System.out.println("LKR " + balance);
    }
    static double deposit()
    {

        double amount;
        System.out.print("Enter amount to deposit: ");
        amount = scanner.nextDouble();
        if(amount<0){
            System.out.println("Amount can't be negative");
            return 0;
        }else{
            System.out.println("Your amount LKR " +amount + " has been deposited");
            return amount;
        }

    }
    static double withdraw(double bal){
        double w_amount;
        System.out.print("Enter the amount to withdraw: ");
        w_amount = scanner.nextDouble();
        if (w_amount<0){
            System.out.println("Amount can't be negative");
            return 0;

        } else if (w_amount>bal) {
            System.out.println("Not enough balance to withdraw");
            return 0;
        }else
        {

            System.out.println("Your amount LKR " +w_amount+ " has been withdrew");
            return w_amount;
        }



    }

}
