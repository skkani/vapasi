package Account;

public class Auditor implements NotificationIfOverdrawn {

    @Override
    public void sendNotification() {
        System.out.println("Overdrawn is happened under the Account");
    }
}
