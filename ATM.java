import java.util.Scanner;

public class ATM {
    public static void main(String[] args){
     
        int balance = 100000, withdraw, deposite;
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("Automated teller machine");
            System.out.println("choose 1 for withdraw");
            System.out.println("choose 2 for deposite");
            System.out.println("choose 3 for check balance");
            System.out.println("choose 4 for EXIT");
            System.out.println("choose the operation you want to perform");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter monney to be withdrawn:");
                    withdraw = sc.nextInt();

                    if (balance >= withdraw){
                        balance = balance - withdraw;
                        System.out.println("please collect your money");
                    }
                    else{
                        System.out.println("insufficient Balance");
                    }
                    System.out.println("");
                    break;

                    case 2:
                    System.out.println("Enter money to be deposited");
                    deposite = sc.nextInt();

                    balance = balance + deposite;
                    System.out.println("Your money has been succesfully deposited");
                    System.out.println("");
                    break;
                    

                case 3:
                 System.out.println("Balance : "+balance);
                 System.out.println("");
                    break;

                case 4:
                System.exit(0);
            }
        }
    }
}
