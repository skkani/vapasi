import Account.Account;
import AccountOwner.AccountOwner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

//@RunWith(MockitoJUnitRunner.class)
//public class AccountTest {
//
//    @Test
//    public void shouldPutTenRupeesIntoEmptyWallet() {
//        Account account = new Account();
//        assertEquals(10, account.addMoney(10));
//    }
//
//    @Test
//    public void shouldPutTenRupeesIntoWalletWithMoney() {
//        Account account = new Account();
//        account.setMoney(20);
//        assertEquals(30, account.addMoney(10));
//
//    }
//
//    @Test
//    public void shouldNotPutNegativeValues() {
//        Account account = new Account();
//        account.setMoney(20);
//        assertEquals(20, account.addMoney(-10));
//
//    }

//    @Test
//    public void shouldTakeSpecifiedMoney() {
//        Account account = new Account();
//        account.setMoney(20);
//        assertEquals(30, account.takeSpecficMoney(30));
//
//    }
//
//    @Test
//    public void shouldAddMoneyToWallet() {
//        AccountOwner accountOwner = mock(AccountOwner.class);
//        Account account = new Account();
//        account.setMoney(6);
//        assertEquals(10, account.takeSpecficMoney(10));
//        verify(accountOwner).sendEmail(eq("Email Test"));
//
//    }





//    @Test(expected = Wallet.InsufficientFundErrorException.class)
//    public void whenExceptionThrownThenExpectationSatisfied() throws InsufficientFundErrorException {
//        Wallet wallet = new Wallet();
//        wallet.setMoney(0);
//        wallet.takeSpecficMoney(10);
//    }


//}
