package ex1;
//Classe abstraite simple


public class teste {
    public static void main(String[] args) {
        Animal monChat = new Chat("Whiskers", 3);
        Animal monChien = new Chien("Buddy", 5);

        monChat.faireSon();
        monChat.manger();

        monChien.faireSon();
        monChien.manger();
    }
}
