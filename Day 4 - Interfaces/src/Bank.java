import org.junit.Test;

/**
 * Created by mahajani on 7/28/2017.
 */
public class Bank {

    AccountServiceImpl accountService = new AccountServiceImpl("Ishan","PUNE","8390703981",45);

    @Test
    public void testCustomerServiceImpl() {
        accountService.details();
        accountService.deposit(5);
        accountService.balance();
        accountService.withdraw(10);
        accountService.balance();
    }


}
