/**
 * Created by mahajani on 7/28/2017.
 */
public class AccountServiceImpl extends  CustomerServiceImpl implements AccountService {

    private double balance;

    AccountServiceImpl(String name, String address, String number, double balance) {
        super(name, address, number);
        this.balance = balance;
    }


    @Override
    public void open() {

        System.out.println("ACCOUNT OPENED!!");
    }

    @Override
    public void close() {

        System.out.println("ACCOUNT CLOSED!!");

    }

    @Override
    public void withdraw(double amount) {
        System.out.println("AMOUNT WITHDRAWN : " + amount);
        this.balance = this.balance - amount;
    }

    @Override
    public void deposit(double amoumt) {
        System.out.println("AMOUNT DEPOSITED : " + amoumt);
        this.balance = this.balance + amoumt;
    }

    @Override
    public void balance() {
        System.out.println("BALANCE : " + balance);
//        this.balance = this.balance - balance;
    }

    @Override
    public void details() {
        super.details();
        balance();
    }
}
