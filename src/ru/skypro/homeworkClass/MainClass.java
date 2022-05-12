package ru.skypro.homeworkClass;

import java.sql.SQLOutput;

public class MainClass {
    public static void main(String[] args) {
        Author Hemingway = new Author("Эрнест Хемингуэй ");
        Author Fitzgerald = new Author("Фрэнсис Фицджеральд");
        Book book1=new Book("TheGreatGatsby",Fitzgerald,1927) ;
        Book book2=new Book("AFarewellToArms",Hemingway,1925);
        book1.setNewYEar(1925);
    }//("TheGreatGatsby", "Фицджеральд","Скотт",1927);


}
