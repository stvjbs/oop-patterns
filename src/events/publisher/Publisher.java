package events.publisher;

import events.listeners.Observer;

import java.util.List;

public interface Publisher {
    void addSubscriber(Observer observer);
    void removeSubscriber(Observer observer);
    void notifySubscriber(List<Observer> observers);
}
