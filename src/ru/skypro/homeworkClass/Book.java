package ru.skypro.homeworkClass;

public class Book extends Author{
    public String bookName;
    private int publisherYear;

    public Book(String bookName,String name,int publisherYear) {
        super(name);
        this.bookName=bookName;
        this.publisherYear=publisherYear;

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

