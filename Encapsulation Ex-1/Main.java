//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

    class User{
    public String name = "";
    public int accountNumber = 0;
    private double balance = 100;

    public User(String name,int accountNumber,double balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
        }

    public void setBalance(double newBlance){
        balance = newBlance;
    }
    }

public class Main {

    public static void main(String[] args) {
        User user = new User("kheang",12220,100);
        printUser(user);
    }

    public static void printUser(User user){
        System.out.println("The user name is " + user.name);
        System.out.println("The user accountNumber is " + user.accountNumber);
        System.out.println("The user balance is " + user.getBalance());
    }
}