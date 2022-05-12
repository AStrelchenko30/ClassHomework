package ru.skypro.homeworkClass;

import java.sql.SQLOutput;

public class MainClass {
    public static void main(String[] args) {
        Book book1 = new Book("TheGreatGatsby","Фрэнсис Фицджеральд",1927);;
        Book book2 = new Book("AFarewellToArms","Эрнест Хемингуэй ",1925);
        Author Hemingway = new Author("Эрнест Хемингуэй ");
        Author Fitzgerald = new Author("Фрэнсис Фицджеральд");
        book1.setNewYEar(1925);
    }//("TheGreatGatsby", "Фицджеральд","Скотт",1927);


}
