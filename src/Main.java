import java.io.*;
import java.util.Scanner;

import static java.lang.Integer.parseUnsignedInt;
import static java.lang.Integer.sum;

public class Main {

    public static void main(String[] args) throws IOException {
        Account acc1 = new Account();
        User user = new User();
        Scanner sin = new Scanner(System.in);
        int uInput = 0;


        do {
            System.out.println("1) Create Username");
            System.out.println("2) Create PW");
            //    System.out.println("0) Logout");
            uInput = sin.nextInt();
            if (uInput == 1) {
                acc1.uNameCreate();

            } else if (uInput == 2) {
                acc1.uPWCreate();
            } else if (uInput == 4) {

            }

            if (acc1.getuName() != null && acc1.getuPW() != null) {
                System.out.println("Welcome back " + acc1.getuName());

                break;
            }
        }

        while (uInput != 0);
        //   System.out.println( "Goodbye");

        do {
            System.out.println("1)Deposit Money");
            System.out.println("2)Withdraw Money");
            System.out.println("3)Balance");
            System.out.println("4)Logoff");
            uInput = sin.nextInt();

            if (uInput == 1) {
                user.uDepo();
            } else if (uInput == 2) {
                user.uWith();
            }

        }
        while (uInput != 4);
        System.out.println("Goodbye");

    }


}
