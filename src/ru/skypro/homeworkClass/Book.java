package ru.skypro.homeworkClass;

public class Book  {
    public String bookName;
    private int publisherYear;

    private final Author author;

    public Book(String bookName, Author author, int publisherYear) {
        this.bookName = bookName;
        this.publisherYear = publisherYear;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }


    public int getPublisherYear() {
        return publisherYear;
    }

    public void setNewYEar(int Year) {
        this.publisherYear = Year;
    }
}

