package ru.skypro.homeworkClass;

public class MainClass {
    public static void main(String[] args) {
        Book book1=new Book("TheGreatGatsby","Фицджеральд",1927);
        Book book2 = new Book("AFarewellToArms","Хемингуэй",1925);
        Author Hemingway=new Author("Эрнест","Ми́ллер");
        Author Fitzgerald = new Author("Фрэнсис", "Скотт");
        book1.setNewYEar(1925);
    }
}

