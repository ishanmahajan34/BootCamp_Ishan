/**
 * Created by mahajani on 7/28/2017.
 */
interface AccountService {

    public void open();
    public void close();
    public void withdraw(double amount);
    public void deposit(double amoumt);
    public void balance();

}
