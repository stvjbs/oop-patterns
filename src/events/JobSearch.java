package events;

import events.listeners.Subscriber;
import events.publisher.HeadHunter;

public class JobSearch {
    public static void main(String[] args) {
        HeadHunter jobSite = new HeadHunter();

        jobSite.addVacancy("first vacancy");
        jobSite.addVacancy("second vacancy");

        Subscriber one = new Subscriber("Alex");
        Subscriber two = new Subscriber("Nona");
        Subscriber three = new Subscriber("Ella");

        jobSite.addSubscriber(one);
        jobSite.addSubscriber(two);

        jobSite.addVacancy("three vacancy");

        jobSite.addSubscriber(three);

        jobSite.removeVacancy("second vacancy");
    }
}
