package AccountOwner;


import Account.NotificationIfOverdrawn;

public class AccountOwner implements NotificationIfOverdrawn {
     void addMoney(int moneyToBeAdded) { System.out.println("Money is added");}

    @Override
    public void sendNotification() {
        System.out.println("Overdrawn is happened under the Account");
    }
}
