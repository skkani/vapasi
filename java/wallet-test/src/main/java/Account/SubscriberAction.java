package Account;

import AccountOwner.AccountOwner;

import java.util.ArrayList;
import java.util.List;

public class SubscriberAction {

    public  List<NotificationIfOverdrawn>  addSubscriberAction(List<NotificationIfOverdrawn> observerObj,List<String> key)
    {
            observerObj.add(key);
            return observerObj;
        }

    }

    public  List<NotificationIfOverdrawn>  removeSubscriberAction(List<NotificationIfOverdrawn> observerObj,String key)
    {
        if (observerObj.contains(key)) observerObj.remove(key);
        return observerObj;
    }
}
