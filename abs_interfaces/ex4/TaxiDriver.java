package ex4;

public class TaxiDriver implements Conducteur {
    private String name;

    public TaxiDriver(String name) {
        this.name = name;
    }

    @Override
    public void conduire() {
        System.out.println(name + " est en train de conduire un taxi.");
    }

    @Override
    public void stop() {
        System.out.println(name + " a arrêté le taxi.");
    }
 }
