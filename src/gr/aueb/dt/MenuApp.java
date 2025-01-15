package gr.aueb.dt;

import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int choice;
        int n=0;

        do {

        System.out.println("1. Show n stars horizontally");
        System.out.println("2. Show n stars vertically");
        System.out.println("3. Show n lines with n stars");
        System.out.println("4. Show n lines with stars 1 – n");
        System.out.println("5. Show n lines with stars n – 1");
        System.out.println("6. Exit the program");
        System.out.println("Please enter your choice");
            choice=scanner.nextInt();
            if (choice >= 1 && choice <= 5) {
                System.out.println("Please give the number 'n' of stars:");
                n =scanner.nextInt();
            } else if (choice != 6) {
                System.out.println("Your choice is invalid, please retry");
                continue;
            }
            switch (choice) {
                case 1 -> horizontically(n);
                case 2 -> vertically(n);
                case 3 -> square(n);
                case 4 -> ascendingToN(n);
                case 5 -> descendingFromN(n);
                case 6 -> System.out.println("Exiting the program...");
            }

            System.out.println();
        } while (choice != 6);

        scanner.close();

    }



    public static void horizontically(int n) {
        for (int i=1; i<=n; i++ ) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void vertically(int n){
        for (int i=1; i<=n; i++) {
            System.out.println("*");
        }
    }

    public static void square(int n) {
        for (int i=1; i<=n; i++){
            horizontically(n);
            }
        }

    public static void ascendingToN(int n) {
        for (int i=1; i<=n; i++) {
            horizontically(i);
            }
        }



    public static void descendingFromN(int n) {
        for (int i=n; i>=1; i--) {
            horizontically(i);
            }
        }

}
