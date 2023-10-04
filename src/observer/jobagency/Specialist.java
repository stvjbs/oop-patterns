package observer.jobagency;

public class Specialist implements Observer{
    String name;

    public Specialist(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        System.err.println("I am super specialist, a don't need any job");
    }
}
