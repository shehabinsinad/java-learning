// Question:
//
// Write a Bank Account Summary:
//
// - Create an Account class with accountHolder and balance fields.
// - Store details of 5 accounts.
// - Write a method to find the highest account balance.
// - Write a method to calculate the total money in the bank.
// - Print whether each account has Low Balance
//   (less than ₹1000) or Normal.
// - Print the account with the highest balance.

class Account {
    String accountHolder;
    double balance;

    Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
}

public class BankAccountSummary {

    public static double highestBalance(double[] balances) {
        double highest = balances[0];

        for (int i = 1; i < balances.length; i++) {
            if (balances[i] > highest) {
                highest = balances[i];
            }
        }

        return highest;
    }

    public static double totalBalance(double[] balances) {
        double total = 0;

        for (double balance : balances) {
            total += balance;
        }

        return total;
    }

    public static void main(String[] args) {

        String[] holders = {
            "Arun",
            "Neha",
            "Rahul",
            "Sneha",
            "Akhil"
        };

        double[] balances = {
            850,
            4500,
            1200,
            9500,
            600
        };

        Account[] accounts = new Account[holders.length];

        for (int i = 0; i < holders.length; i++) {
            accounts[i] = new Account(holders[i], balances[i]);
        }

        System.out.println("Total Bank Balance: ₹" + totalBalance(balances));

        double highest = highestBalance(balances);

        for (Account a : accounts) {
            if (a.balance == highest) {
                System.out.println("Highest Balance: " + a.accountHolder + " - ₹" + a.balance);
            }
        }

        System.out.println();

        System.out.println("Account Status:");

        for (Account a : accounts) {
            if (a.balance < 1000) {
                System.out.println(a.accountHolder + " - Low Balance");
            } else {
                System.out.println(a.accountHolder + " - Normal");
            }
        }
    }
}