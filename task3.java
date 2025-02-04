import java.util.Scanner;

class ATM {
    double pin,balance;

   ATM(double pin1,double initialbalance) {
        pin = pin1;
        balance = initialbalance;
    }

  void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

  void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    void showbalance() {
        System.out.println("Current Balance: " + balance);
    }

    void realatm() {
        Scanner sc= new Scanner(System.in);
        int choice;

        System.out.println("Welcome to the ATM!");
        System.out.print("Enter your PIN: ");
        double entrypin = sc.nextDouble();

        if (entrypin != pin) {
            System.out.println("Incorrect pin access denied.");
            return;
        }

        do {
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    showbalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } 
while (choice != 4);
        sc.close();
}
}

class task3 {
    public static void main(String[] args)
 {
        ATM atm = new ATM(1234, 500.0);        
        atm.realatm();
    }
}
