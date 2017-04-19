/**
 * Created by louie on 4/15/2017.
 */
public interface Subject {
    void addObserver(Observer orderObserver);
    void removeObserver(Observer orderObserver);
    void sendNotification();
}