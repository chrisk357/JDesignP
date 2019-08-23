import java.util.Scanner;

public class User {
    Scanner sin = new Scanner(System.in);
    Account acc = new Account();
    private int uBal, uWit, uDep;
    private String un, upw;
    private String lun, lupw;

    public void uWith() {
        System.out.println("How much would you like to withdraw: ");
        uWit = sin.nextInt();
        System.out.println("You would like to withdraw " + uWit + " from your account");
        if (uBal - uWit >= 0) {
            uBal = uBal - uWit;
            System.out.println("Your new balance is: $" + uBal);
        } else {
            System.out.println("We are sorry but you do not have the funds for that");
        }

    }

    public void checkBal() {
        System.out.println("Your current balance is : $" + uBal);
    }

    public void uDepo() {
        System.out.println("How much would you like to deposit: ");
        uDep = sin.nextInt();
        System.out.println("Thank you for depositing " + uDep);
        uBal = uBal + uDep;
        System.out.println("Your new balance is now : $" + uBal);
    }

    public void checkUsername(String lun){
        lun = lun;
        System.out.println("your username is " + lun);
    }
    public void checkPW(String lupw){
        lupw = lupw;
        System.out.println("Your password is " + lupw);
    }



}
