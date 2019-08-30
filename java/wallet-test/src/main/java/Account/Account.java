package Account;

import AccountOwner.AccountOwner;

import java.util.ArrayList;
import java.util.List;

public class Account  {
    private int money;
    private String AccountNo;
    public Account(int money,String AccountNo)
    {
        this.money = money;
        this.AccountNo = AccountNo;
    }


    public int addMoney(int moneyToBeAdded) {
        if (moneyToBeAdded > 0) {
             money += moneyToBeAdded;
        }
        System.out.println("Money Added is "+money);
        return money;
    }

    public void setMoney(int money) {
        this.money =  money;
    }

    public void notification()
    {
        System.out.println("Overdrawn is happened under the Account");
    }

    public void takeSpecficMoney(int specificMoney)  {
        Account aobj = new Account(10,"1x");
        AccountOwner acobj = new AccountOwner();
        Auditor adobj = new Auditor();

        List<NotificationIfOverdrawn> observerObj = new ArrayList<>();
        observerObj.add(acobj);
        observerObj.add(adobj);

        int balanceMoneyToBeAdded = 0;
        if (specificMoney > money) {
            balanceMoneyToBeAdded = money-specificMoney;
            for (NotificationIfOverdrawn obj :observerObj) {
                obj.sendNotification();

            }



        }
        SubscriberAction sa = new SubscriberAction();

        sa.addSubscriberAction(List<NotificationIfOverdrawn> observerObj,"Manager");
            sa.removeSubscriberAction()





    }











}
