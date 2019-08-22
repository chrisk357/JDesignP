import java.util.Scanner;

public class Account {

    Scanner sin = new Scanner(System.in);
    private String uName = null;

    private String uPW = null;
    private int uBal;



    public void uPWCreate() {
        String suPW;
        System.out.print("Create your PW:");
        suPW = sin.next();
        setuPW(suPW);
        System.out.println("Your Password is now " + getuPW());
    }


    public void uNameCreate() {
        String suName;
        System.out.print("Enter your user desired name:");
        suName = sin.next();
        setuName(suName);
        System.out.println("Your user name is now stored as " + getuName());
    }

    public String getuName() {

        return uName;
    }

    public void setuName(String uName) {

        this.uName = uName;

    }

    public String getuPW() {
        return uPW;
    }

    public void setuPW(String uPW) {
        this.uPW = uPW;

    }


}
