package ex4;

// Interface avec méthode default

public class test {
    public static void main(String[] args) {
        TaxiDriver driver1 = new TaxiDriver("Jean");
        TaxiDriver driver2 = new TaxiDriver("Marie");

        driver1.conduire();
        driver1.stop();

        driver2.conduire();
        driver2.stop();
    }
}
