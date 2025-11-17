package ex6;

public class Canard implements Volant, Nageant {

    @Override
    public void voler() {
        System.out.println("Le canard vole.");
    }

    @Override
    public void nager() {
        System.out.println("Le canard nage.");
    }
    
}
