/**
 * Created on 4/15/2017.
 */
public interface Subject {
    public void addObserver(Observer orderObserver);

    public void removeObserver(Observer orderObserver);

    public void sendNotification();
}