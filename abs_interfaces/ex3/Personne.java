package ex3;

abstract class Personne {

     private String nom;
     private int age;


     public Personne(String nom, int age){
        this.nom = nom;
        this.age = age;
     }

     abstract void tarviller();

        void sePresenter(){
            System.out.println("Bonjour, je m'appelle " + nom + " et j'ai " + age + " ans.");
        }




}