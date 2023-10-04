package events.publisher;

import events.listeners.Observer;

import java.util.ArrayList;
import java.util.List;

public class HeadHunter implements Publisher {
    List<Observer> observers;
    List<String> vacancies;

    public HeadHunter() {
        observers = new ArrayList<>();
        vacancies = new ArrayList<>();
    }

    @Override
    public void addSubscriber(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeSubscriber(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscriber(List<Observer> observers) {
        for (Observer observer : observers) {
            observer.handleEvent(vacancies);
        }
    }
    public void addVacancy(String vacancy){
        vacancies.add(vacancy);
        notifySubscriber(observers);
    }
    public void removeVacancy(String vacancy){
        vacancies.remove(vacancy);
        notifySubscriber(observers);
    }
}
